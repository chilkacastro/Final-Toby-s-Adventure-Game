import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrafficCone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrafficCone extends Actor
{
    private int lineCounter = 0;
    /**
     * Act - do whatever the TrafficCone wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() {
        deductPoints();

    }    
    
    /**
     * deducPoints() - to remove points when Toby touches the traffic cones.
     */
     public void deductPoints() {
       if (isTouching(Toby.class)) {
            lineCounter++;
            removeTouching(Toby.class);
            MyWorld myWorld = (MyWorld)getWorld();
            Greenfoot.playSound("Crying.wav");
            myWorld.addScore(-100);
            //getWorld().showText("You lost some POINTS!",250, 250);

          if (myWorld.getLifeCount() > 0) {
                Level1 myLevel1 = (Level1)getWorld();
                myLevel1.addObject(new Toby(), 800, 640);
 
          }  
            
           if (lineCounter > 0) {
            Level1 line = (Level1)getWorld();
            line.addObject(new MinusLine(), 850, 350); 
        
                
          }
       }
 
    }
}
