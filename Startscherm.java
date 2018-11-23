import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startscherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startscherm extends Actor
{
    /**
     * Act - do whatever the Startscherm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Startscherm() 
    {
        // Add your action code here.
        //super(800, 600, 1);
        
        prepare();
    } 
    private void prepare()
    {
        //TitleLetters titleletters = new TitleLetters();        
        //addObject(titleletters, 400, 300);     
    }
    public void act()
    {
        setImage("startscherm.jpg");
        if (Greenfoot.isKeyDown("enter"))

           getWorld().removeObject(this);
        }
        }      
