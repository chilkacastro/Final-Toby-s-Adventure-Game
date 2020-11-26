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
        //addObject(this, Greenfoot.getRandomNumber(1600),  
        //Greenfoot.getRandomNumber(650));
        if (isTouching(Toby.class)) {
            ((MyWorld)getWorld()).addScore(100); 
            getWorld().showText("You GAINED Points!",450, 350);
            getWorld().removeObject(this);
        }

        
    }
}
