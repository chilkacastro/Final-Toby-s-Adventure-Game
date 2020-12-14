import greenfoot.*;

/**
 * Cactus2 Class - whenever Toby touches the Cactus2 class, 100 points will be removed
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class Cactus2 extends Obstacles
{
    private int lineCounter = 0;
    /**
     * Act - do whatever the Cactus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(isTouching(Toby.class)) {
           removeTouching(Toby.class);
           deductPoints();
           printMessage();
           reviveToby();
           
       }
    }    
    
     /**
     * deductPoints() - to remove points when Toby touches a cactus
     */
    public void deductPoints() {
       Greenfoot.playSound("Spike.wav");
       MyWorld myWorld = (MyWorld)getWorld();
       myWorld.addScore(-100);
    }
 
    /**
     * reviveToby() - to revive Toby when life count is higher than 0.
     */
    public void reviveToby() {
        MyWorld myWorld = (MyWorld)getWorld();
        if (myWorld.getLifeCount() > 0) {
            Level2 myLevel2 = (Level2)getWorld();
            myLevel2.addObject(new Toby(), 800, 640);
        }   
    }
    
    /**
     * printMessage() - to print a message whenever Toby touches the cactus
     */
    public void printMessage() {
       lineCounter++;
       if (lineCounter > 0) {
            Level2 myLevel2 = (Level2)getWorld();
            myLevel2.addObject(new MinusLine(), 850, 350);
       }
    }
}

