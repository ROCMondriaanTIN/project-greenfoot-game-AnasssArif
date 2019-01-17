import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5Titel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5Titel extends Actor
{
    /**
     * Act - do whatever the Level5Titel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     boolean beschikbaar;
    public Level5Titel(boolean beschikbaar){
        this.beschikbaar = beschikbaar;
        if(beschikbaar){
            setImage("level5.png");
        }else{
            setImage("level5_false.png");
        }
    }
    
    public void act() 
    {
        click();
    }  
    public void click()
    {
        if (beschikbaar){
        if(Greenfoot.mouseClicked(this))
        {
           Greenfoot.setWorld(new Snow()); 
        }
    }
}
}
    

