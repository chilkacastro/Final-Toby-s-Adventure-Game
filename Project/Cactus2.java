import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactus2 extends Actor
{
    /**
     * Act - do whatever the Cactus2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(isTouching(Toby.class)) {
           Greenfoot.playSound("Spike.wav");
           MyWorld myWorld = (MyWorld)getWorld();
           myWorld.addScore(-100);
           getWorld().showText("You lost some POINTS!",250, 250);
       }
    }    
}
