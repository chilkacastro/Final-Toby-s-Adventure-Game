import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TrafficCone Class - one of Toby's obstacle in level 1 that decreases points by 100.
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class TrafficCone extends Obstacles
{
    private int lineCounter = 0;
    /**
     * Act - do whatever the TrafficCone wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() {
        deductPoints();

    }    
    
    /**
     * deducPoints() - to remove points when Toby touches a traffic cone
     */
     public void deductPoints() {
       if (isTouching(Toby.class)) {
          removeTouching(Toby.class);
          MyWorld myWorld = (MyWorld)getWorld();
          myWorld.addScore(-100);
          Greenfoot.playSound("Crying.wav");
          printMessage();
          reviveToby();
    
       }
    }
    
     /**
     * reviveToby() - to revive Toby when life count is higher than 0.
     */
    public void reviveToby() {
        MyWorld myWorld = (MyWorld)getWorld();
        if (myWorld.getLifeCount() > 0) {
             Level1 myLevel1 = (Level1)getWorld();
             myLevel1.addObject(new Toby(), 800, 640);
 
        }   
    }
    
    /**
     * printMessage() - to print a message whenever Toby touches the traffic cone
     */
    public void printMessage() {
       lineCounter++;
       if (lineCounter > 0) {
           Level1 line = (Level1)getWorld();
           line.addObject(new MinusLine(), 850, 350); 
       }
    }

}
