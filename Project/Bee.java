import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

 /**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Bee extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int rotation;
<<<<<<< HEAD
    /**
     * Makes it seem like the bee is flying
     */
=======
    
    /**
     * Default constructor
     */

>>>>>>> bfe6ce6da63f98e9c93c597859f7fc06f479bc8f
    public Bee(){
        image1 =  new  GreenfootImage("bee1.png");
        image2 =  new  GreenfootImage("bee2.png");
    }
<<<<<<< HEAD
    /** 
     * Rotates the bee
=======
    
    /**
     * Constructor with one parameter
>>>>>>> bfe6ce6da63f98e9c93c597859f7fc06f479bc8f
     */
    public Bee(int rotation){
        image1 =  new GreenfootImage("bee1.png");
        image2 =  new GreenfootImage("bee2.png");
        setRotation(rotation);
        setRotation(90);
        
    }
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        move(3);
        turnAtEdge();
        randomTurn();
        switchImage();
        decreasePoints();
    }
       
    /**
     * turnAtEdge() - Check whether we are at the edge of the world. If we are, turn a bit. If not, do nothing.
     */
    public void turnAtEdge() {
        if (isAtEdge()) {
            turn(20);
        }
    }
    
    /**
     * switchImage() - Alternate the bee's image between image1 and image2.
     */
    public void switchImage() {
        if (getImage() == image1) {
            setImage(image2);
        }
        else {
            setImage(image1);
        }
    }
    
    /**
     * randomTurn() - Randomly decide to turn from the current direction, or not. If we turn turn a bit left or right by a random degree.
     */
    public void randomTurn() {
        if (Greenfoot.getRandomNumber(100) > 90) {
            turn(Greenfoot.getRandomNumber(40) - 10);
        }
    }
<<<<<<< HEAD
    /**
     * Points decrease when bee touches Toby
=======
    
    /**
     * decreasePoints() - to decrease the points of Toby when the bee goes near him and to play a sound.
>>>>>>> bfe6ce6da63f98e9c93c597859f7fc06f479bc8f
     */
    public void decreasePoints(){
        if (isTouching(Toby.class)) {
            Greenfoot.playSound("Bee.wav");
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.addScore(-100);
            
            
        }
    }
}
