import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1Titel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1Titel extends Actor
{
    /**
     * Act - do whatever the Level1Titel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }    
    public void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
           Greenfoot.setWorld(new MyWorld()); 
        }   
}
}
