import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Letter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letter extends Mover
{
    /**
     * Act - do whatever the Letter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int teller;
    protected char letter;
    public Letter(char letter){
        this.letter = letter;
        setImage("L_" + letter + ".png");
    }
    public void update() {
    }    
    
    public void act() 
    {
        applyVelocity();
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                getWorld().addObject(new LetterLos(this.letter), 100+(teller*100), 700);
                getWorld().removeObject(this);
                teller++;
                break;
                
            }     
    }    
}
}