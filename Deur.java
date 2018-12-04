import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deur extends Mover
{
    public Deur()
    {
        setImage("window.png");
    }
    
    public void act() 
    {
        applyVelocity();
    }
}
