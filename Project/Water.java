import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Actor
{   
    private int lineCounter = 0;
    /**
     * Act - do whatever the Water wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Toby.class)) {
            lineCounter++;
            ((MyWorld)getWorld()).lifeCount(-1);
            Greenfoot.playSound("Crying.wav");
            removeTouching(Toby.class);
            MyWorld myWorld = (MyWorld)getWorld();
           if (myWorld.getLifeCount() > 0) {
                Level3 myLevel3 = (Level3)getWorld();
                myLevel3.addObject(new Toby(), 800, 640);
 
           }  
            //getWorld().showText("You LOSE Points!",450, 350);
           if (lineCounter > 0) {
               Level3 line = (Level3)getWorld();
               line.addObject(new WaterLine(), 850, 350); 
                
            }
        }
   }  
}  
