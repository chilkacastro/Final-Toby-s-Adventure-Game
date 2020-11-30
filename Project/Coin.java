import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Toby.class)) {
            ((MyWorld)getWorld()).addScore(100); 
            Greenfoot.playSound("Coin.wav");
            getWorld().showText("You GAINED Points!",450, 350);
            getWorld().removeObject(this);
        }

        
    }
}
