import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{
    int levelMax = 5;
    static int level = 1; 
    Level1Titel level1titel; 
    Level3Titel level3titel;
    Level4Titel level4titel;
    Level5Titel level5titel;
    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect(int level)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        if (this.level < level) {
            this.level = level;
        }
        
        if( this.level == 1){
           level1titel = new Level1Titel(true); 
           level3titel = new Level3Titel(false);
           level4titel = new Level4Titel(false);
           level5titel = new Level5Titel(false);
        }
        
              
        if( this.level == 3) {
           level1titel = new Level1Titel(true);
           level3titel = new Level3Titel(true);
           level4titel = new Level4Titel(false);
           level5titel = new Level5Titel(false);
        }   
        
         if( this.level == 4) {
           level1titel = new Level1Titel(true);
           level3titel = new Level3Titel(true);
           level4titel = new Level4Titel(true);
           level5titel = new Level5Titel(false);
        }   
        
          if( this.level == 5) {
            level1titel = new Level1Titel(true);
            level3titel = new Level3Titel(true);
            level4titel = new Level4Titel(true);
            level5titel = new Level5Titel(true);
        }   
        
        
        addObject (level1titel, 187, 431);
        addObject (level3titel, 249, 562);
        addObject (level4titel, 770, 566);
        addObject (level5titel, 500, 800);
    }
    
    
}
