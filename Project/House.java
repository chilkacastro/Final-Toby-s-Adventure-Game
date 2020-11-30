import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House extends Actor
{
    /**
     * Act - do whatever the House wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Toby.class)) {
                Greenfoot.playSound("House.wav");
                removeTouching(Toby.class);
                getWorld().showText("You have won the game!",500, 500);
                MyWorld myWorld = (MyWorld)getWorld();
        }
    }    
}
