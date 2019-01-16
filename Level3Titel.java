import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3Titel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3Titel extends Actor
{
    /**
     * Act - do whatever the Level3Titel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean beschikbaar;
    public Level3Titel(boolean beschikbaar){
        this.beschikbaar = beschikbaar;
        if(beschikbaar){
            setImage("level3.png");
        }else{
            setImage("level3_false.png");
        }
    }
    
    public void act() 
    {
        click();
    }  
     public void click()
    {
        if(beschikbaar){
        if(Greenfoot.mouseClicked(this))
        {
           Greenfoot.setWorld(new Candy()); 
        }   
}
}
}
    
    

