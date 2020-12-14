import greenfoot.*;

/**
 * Coin Class - to help Toby gain points in the game. Each coin equals 100 points.
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class Coin extends Actor
{   private int lineCounter = 0;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private int counter = 0;
    /**
     * Default Constructor- To create objects.
     */  
     public Coin() {
        image1 = new GreenfootImage("coinf.png");
        image2 = new GreenfootImage("coinA.png");
        image3 = new GreenfootImage("coinB.png");
        image4 = new GreenfootImage("coinC.png");
        setImage(image1);
    }
    
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        counter++;
        if(counter == 8) {
            switchImage();
            counter = 0;
        }
        if (isTouching(Toby.class)) {
            ((MyWorld)getWorld()).addScore(100); 
            Greenfoot.playSound("Coin.wav");
            printMessage();
            getWorld().removeObject(this);      
        }
    }
    
    /**
     * switchImage() - this method is implemented in order to do the animation of the coins.
     */
    public void switchImage() {
        if (getImage() == image1) {
            setImage(image2);
        }
        else if(getImage() == image2) {
            setImage(image3);
        }
        else if(getImage() == image3) {
            setImage(image4);
        }
        else {
            setImage(image1);
        }
    }
    
    /**
     * printMessage() - To print a message when Toby touches a coin.
     */
    public void printMessage() {
       lineCounter++;
       if (lineCounter > 0) {
            Level2 myLevel2 = (Level2)getWorld();
            myLevel2.addObject(new PlusPoint(), 840, 420); 

       } 
    }   
}