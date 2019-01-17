import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    int level;
    public GameOver(int level)
    {   super (900, 900, 1, false);
        this.setBackground("gameover.png");
        this.level = level;
    }
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("space"))
        {
             Greenfoot.setWorld(new LevelSelect(level));
    }    
}
}