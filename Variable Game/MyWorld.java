import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(new VariableActor("int", "6"), 0, 200);
        addObject(new Goal("String"), 540, 60);
        addObject(new Goal("int"), 540, 150);
        addObject(new Goal("boolean"), 540, 240);
        addObject(new Goal("double"), 540, 330);
    }
}
