import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Variable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VariableActor extends Actor
{
    private Variable var;
    private int speed = 2;
    private GreenfootImage label;
    private Color labelColor = Color.BLACK;
    private int labelSize = 30;
    private String labelFont = "Arial";
    
    private boolean isGrabbed = false;
    public VariableActor(String type, String value)
    {
        var = new Variable(type, value);
        label = new GreenfootImage((var.getValue().length()+1)*labelSize, labelSize + (labelSize/4));
       
        label.setFont(new Font(labelFont, labelSize));
        label.setColor(labelColor);
        label.drawString(var.getValue(),var.getValue().length()*(labelSize/2), labelSize);
        
        setImage(label);
    }
    
    /**
     * Act - do whatever the Variable wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this) && !isGrabbed)
        {
            // grab the object
            isGrabbed = true;
            // the rest of this block will avoid this object being dragged UNDER other objects
            World world = getWorld();
            MouseInfo mi = Greenfoot.getMouseInfo();
            world.removeObject(this);
            world.addObject(this, mi.getX(), mi.getY());
            return;
        }
        // check for actual dragging of the object
        if ((Greenfoot.mouseDragged(this)) && isGrabbed)
        {
            // follow the mouse
            MouseInfo mi = Greenfoot.getMouseInfo();
            setLocation(mi.getX(), mi.getY());
            return;
        }
        // check for mouse button release
        if (Greenfoot.mouseDragEnded(this) && isGrabbed)
        {
            // release the object
            isGrabbed = false;
            Goal obj = (Goal) getOneIntersectingObject(Goal.class);
            if (obj != null && obj.getName().equals(var.getType())) {
                //System.out.println(obj);
                getWorld().removeObject(this);
                //drop = true;
            }
            else {
                System.out.println(obj.getName() + "  " + var.getType());
            }
            return;
        }
        
        if (!isGrabbed){
            if (getX() >= 400) {
                setLocation(getX(), getY() + speed++);
            }
            else {
                setLocation(getX() + speed, getY());
            }
        }
    }    
}
