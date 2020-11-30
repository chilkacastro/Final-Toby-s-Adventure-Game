import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DogTreat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DogTreat extends Actor
{
    /**
     * Act - do whatever the DogTreat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Toby.class)) {
            ((MyWorld)getWorld()).addScore(100); 
            Greenfoot.playSound("Treats.wav");
            getWorld().showText("You GAINED Points!",450, 350);
            getWorld().removeObject(this);
        }

        
    }    
}
