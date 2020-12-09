import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Food
{
   private int lineCounter = 0;
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (isTouching(Toby.class)) {
            lineCounter++;
            ((MyWorld)getWorld()).addScore(50); 
            Greenfoot.playSound("Coin.wav");
            if (lineCounter > 0) {
                Level3 myLevel3 = (Level3)getWorld();
                myLevel3.addObject(new FruitLine(), 750, 450); 
            }

            getWorld().removeObject(this);
      }  
   }
   
}
