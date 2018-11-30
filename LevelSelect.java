import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{

    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        Level1Titel level1titel = new Level1Titel();
        Level2Titel level2titel = new Level2Titel();
        Level3Titel level3titel = new Level3Titel();
        Level4Titel level4titel = new Level4Titel();
        Level5Titel level5titel = new Level5Titel();
        addObject (level1titel, 187, 431);
        addObject (level2titel, 957, 398);
        addObject (level3titel, 249, 562);
        addObject (level4titel, 770, 566);
        addObject (level5titel, 500, 800);
    }
}
