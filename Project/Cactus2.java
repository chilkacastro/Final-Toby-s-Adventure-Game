import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactus2 extends Obstacles
{
    private int lineCounter = 0;
    /**
     * Act - do whatever the Cactus2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(isTouching(Toby.class)) {
           lineCounter++;
           removeTouching(Toby.class);
           MyWorld myWorld = (MyWorld)getWorld();
           myWorld.addScore(-100);
           Greenfoot.playSound("Spike.wav");
           
                      
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
