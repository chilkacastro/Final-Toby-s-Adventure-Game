import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactus extends Actor
{
    private int lineCounter = 0;
    /**
     * Act - do whatever the Cactus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(isTouching(Toby.class)) {
           lineCounter++;
           removeTouching(Toby.class);
           Greenfoot.playSound("Spike.wav");
           MyWorld myWorld = (MyWorld)getWorld();
           myWorld.addScore(-100);
           //getWorld().showText("You lost some POINTS!",250, 250);
           
           if (myWorld.getLifeCount() > 0) {
                Level2 myLevel2 = (Level2)getWorld();
                myLevel2.addObject(new Toby(), 800, 640);
 
           }  
           
           if (lineCounter > 0) {
                Level2 myLevel2 = (Level2)getWorld();
                myLevel2.addObject(new MinusLine(), 850, 350);
           }
  
           
       }
    }    
}
