import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strawberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strawberry extends Food
{  private int lineCounter = 0;
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (isTouching(Toby.class)) {
            lineCounter++;
            ((MyWorld)getWorld()).addScore(50); 
            Greenfoot.playSound("House.wav");
            if (lineCounter > 0) {
                Level1 myLevel1 = (Level1)getWorld();
                myLevel1.addObject(new FruitLine(), 750, 450); 
            }

            getWorld().removeObject(this);
      }  
   }
}
