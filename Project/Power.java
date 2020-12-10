import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Power here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Power extends Actor
{   
    /**
     * Act - do whatever the Power wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void givePower() 
    {
        if (isTouching(Toby.class)) {
            getWorld().removeObject(this);
            getWorld().showText("You have obtained the power to shoot Fireballs! Press Space to use it", 500, 500);
            Greenfoot.playSound("Power.wav");
        }

    }
    
}
