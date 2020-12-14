import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Carrot Class - increases player points by 50 in Level 3
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class Carrot extends Food
{
   private int lineCounter = 0;
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (isTouching(Toby.class)) {
           ((MyWorld)getWorld()).addScore(50); 
           Greenfoot.playSound("Treats.wav");
           printMessage();
           getWorld().removeObject(this);
      }  
   }
   
    /**
     * printMessage() - to print a message whenever Toby touches a carrot
     */
    public void printMessage() {
       lineCounter++;
       if (lineCounter > 0) {
            Level3 myLevel3 = (Level3)getWorld();
            myLevel3.addObject(new FruitLine(), 850, 470);
       }
   }
}
