import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Variable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Variable
{
    private String varType;
    private String varValue;
    
    public Variable(String type, String value)
    {
        varType = type;
        varValue = value;
    }
    
    public String getType()
    {
        return varType;
    }
    
    public String getValue()
    {
        return varValue;
    }
}
