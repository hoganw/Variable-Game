import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goal extends Actor
{
    private GreenfootImage target = new GreenfootImage(100, 80);
    private String goalName;
    private int textSize = 20;
    private int boxLength = 100;
    private int boxHeight = 80;
    
    public Goal(String name)
    {
        goalName = name;
        
        initialize();
    }
    
    public void initialize()
    {
        if (goalName.equals("int")) {
            target.setColor(Color.BLUE);
        }
        else if (goalName.equals("double")) {
            target.setColor(Color.RED);
        }
        else if (goalName.equals("boolean")) {
            target.setColor(Color.GREEN);
        }
        else if (goalName.equals("String")) {
            target.setColor(Color.ORANGE);
        }
        
        target.fillRect(0,0,boxLength-1,boxHeight-1);
        
        target.setColor(Color.BLACK);
        target.setFont(new Font("Arial", textSize));
        target.drawString(goalName,boxLength/2 - (goalName.length()*(textSize/2))/2, (boxHeight*2)/3 - textSize/2);
        
        setImage(target);
    }
    
    /**
     * Act - do whatever the Goal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public String getName()
    {
        return goalName;
    }
}
