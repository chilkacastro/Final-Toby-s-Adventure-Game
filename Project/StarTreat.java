import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * StarTreat Class - increases player's points by 100 in Level 1
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */

public class StarTreat extends Food
{
   private int lineCounter = 0;
   /**
     * Act - do whatever the DogTreat wants to do. This method is called 
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (isTouching(Toby.class)) {
           ((MyWorld)getWorld()).addScore(100); 
           Greenfoot.playSound("Treats.wav");
           printMessage();
           getWorld().removeObject(this);
       }

    }    
    
   /**
     * printMessage() - to print a message whenever Toby touches a dog treat.
     */
    public void printMessage() {
       lineCounter++;
       if (lineCounter > 0) {
            Level3 myLevel3 = (Level3)getWorld();
            myLevel3.addObject(new PlusPoint(), 750, 450);
       }
   }
}

