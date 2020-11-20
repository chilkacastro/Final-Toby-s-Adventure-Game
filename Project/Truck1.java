import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Truck1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck1 extends Actor
{
    /**
     * Act - do whatever the Truck1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(isTouching(Toby.class)) {
           MyWorld myWorld = (MyWorld)getWorld();
           myWorld.addScore(-100);
       }
        
    }    
}
