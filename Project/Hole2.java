import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hole1 Class - one of Toby's obstacle that removes one life if toby touches it.
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class Hole2 extends Actor
{   
    private int lineCounter = 0;
    /**
     * Act - do whatever the Hole1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       removeToby();
    }
    
    /**
     * removeToby() - to remove Toby from the World and bring him back to his initial position in that level.
     */
    public void removeToby() {
        if (isTouching(Toby.class)) {
            Greenfoot.playSound("Crying.wav");
            printMessage();
            reviveToby();
            deductLife();
            removeTouching(Toby.class);
        }
    }
    
    /**
     * deductLife() - to remove a life when Toby touches the holes.
     */
     public void deductLife() {
        MyWorld myWorld = (MyWorld)getWorld();
        myWorld.lifeCount(-1);
        
    }
    
    /**
     * reviveToby() - bring back Toby to initial position.
     */
     public void reviveToby() {
        MyWorld myWorld = (MyWorld)getWorld();
        if (myWorld.getLifeCount() > 0) {
             if (getWorld() instanceof Level1) {
                Level1 myLevel1 = (Level1)getWorld();
                myLevel1.addObject(new Toby(), 800, 640);
             }
             else {
                Level3 myLevel3 = (Level3)getWorld();
                myLevel3.addObject(new Toby(), 800, 640);
           
             }
        }
    }

    /**
     * printMessage() - to print a message when Toby touches a hole
     */
    public void printMessage() {
      lineCounter++;
      if (lineCounter > 0) {
          Level1 line = (Level1)getWorld();
          line.addObject(new HoleLine(), 850, 350); 
      }
      
    }
}
