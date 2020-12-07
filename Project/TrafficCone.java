import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrafficCone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrafficCone extends Actor
{
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
            MyWorld myWorld = (MyWorld)getWorld();
            Greenfoot.playSound("Crying.wav");
            myWorld.addScore(-50);
            getWorld().showText("You lost some POINTS!",250, 250);
       }
    
    }
}
