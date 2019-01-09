import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    private GreenfootImage walkIm1;
    private GreenfootImage walkIm2;
    private GreenfootImage walkIm3;
    private GreenfootImage walkIm4;
    private GreenfootImage walkIm5;
    private GreenfootImage walkIm6;
    private GreenfootImage walkIm7;
    private GreenfootImage walkIm8;
    private GreenfootImage walkIm9;
    private GreenfootImage walkIm10;
    private GreenfootImage walkIm11;
    private int width;
    private int levens = 1;
    private boolean isOnGround;
    private int spawnX;
    private int spawnY;
    private int walkStatus = 1;
    private int score = 0;
    private int status = 0;

    private String direction = "right";
    public static int munt;
    
    
    public Hero(int spawnX, int spawnY) {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        this.spawnX = spawnX;
        this.spawnY = spawnY;
        
        
        walkIm1 = new GreenfootImage ("p1_walk1.png");
        walkIm2 = new GreenfootImage ("p1_walk2.png");
        walkIm3 = new GreenfootImage ("p1_walk3.png");
        walkIm4 = new GreenfootImage ("p1_walk4.png");
        walkIm5 = new GreenfootImage ("p1_walk5.png");
        walkIm6 = new GreenfootImage ("p1_walk6.png");
        walkIm7 = new GreenfootImage ("p1_walk7.png");
        walkIm8 = new GreenfootImage ("p1_walk8.png");
        walkIm9 = new GreenfootImage ("p1_walk9.png");
        walkIm10 = new GreenfootImage ("p1_walk10.png");
        walkIm11 = new GreenfootImage ("p1_walk11.png");
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        
        getWorld().showText("Score = " + score, 100, 20);
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
        
        for (Tile tile : getIntersectingObjects(Tile.class)) {
           if (tile != null) { 
           if (tile.getImage().toString().contains("liquid")){
               setLocation(spawnX, spawnY);
               break; 
       }
           if (tile.getImage().toString().contains("coinBronze")){
               getWorld().removeObject(tile);
               updateScoremunt();
               break;
            }
           if (tile.getImage().toString().contains("spikes")){
               setLocation(spawnX, spawnY);
               break;
        }   
        }}
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            
            }
            for (Actor deur : getIntersectingObjects(Deur.class)) {
            if (deur != null) {
                Greenfoot.setWorld(new LevelSelect());
                break;
            }
        }
        } 
    

     private double posToNeg(double x) {

            return (x - (x * 2));

     }
    public void handleInput() {
        width = getImage().getWidth() / 2;

 

        Tile tile = (Tile) getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, Tile.class

        );

 

        if (tile == null) {

            tile = (Tile) getOneObjectAtOffset(this.width - 3, getImage().getHeight() / 2 + 1, Tile.class

            );

 

        }

        if (tile == null) {

            tile = (Tile) getOneObjectAtOffset((int) posToNeg(this.width) + 3, getImage().getHeight() / 2 + 1, Tile.class

            );

        }
        
         if (tile != null && tile.isSolid) {

            isOnGround = true;

        } else {

            isOnGround = false;

        }

        if (Greenfoot.isKeyDown("space")) {
            if (isOnGround) {

                velocityY = -17;

                animationJump(getWidth(), getHeight(),1);

            }
        }

 

        if (Greenfoot.isKeyDown("left")) {

            velocityX = -10;

            direction = "left";

            animationWalk(getWidth(), getHeight(), 1);

 

        } else if (Greenfoot.isKeyDown("right")) {

            velocityX = 10;

            direction = "right";

            animationWalk(getWidth(), getHeight(), 1);

        } else {

            animationStand(getWidth(), getHeight(), 1);

        }

    }

 

    public void animationWalk(int width, int heigth, int player) {

 

        if (status == 2) {

            if (walkStatus > 11) {

                walkStatus = 1;

            }

 

            if (isOnGround) {

                setImage("p" + player + "_walk"

                        + walkStatus + ".png");

            } else {

                setImage("p" + player + "_jump.png");

            }

            mirror();

            walkStatus++;

            status = 0;

        } else {

 

            status++;

        }

 

        getImage().scale(width, heigth);

    }

 

    public void animationJump(int width, int heigth, int player) {

        setImage("p" + player + "_jump.png");

        mirror();

        getImage().scale(width, heigth);

    }

 

    public void animationStand(int width, int heigth, int player) {

        if (isOnGround) {

            setImage("p" + player + "_walk1.png");

            getImage().scale(width, heigth);

            walkStatus = 1;

 

        } else {

            setImage("p" + player + "_jump.png");

        }

        mirror();

        getImage().scale(width, heigth);

    }
  
    public void mirror() {

        if (direction.equals("left")) {

            getImage().mirrorHorizontally();

        }

    }
    
    public void dood() {
        levens --;
        if (levens > 0) {
          setLocation(spawnX, spawnY);
        } else {
          getWorld().removeObject(this);
        }
    } 
    
    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
   
    
    public void updateScoremunt()
    {
        score ++;    
    }   
}