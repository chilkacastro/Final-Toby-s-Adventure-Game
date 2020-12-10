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
    public void act() 
    {
        //When touching Toby
        Actor power = getOneObjectAtOffset(0, 0, TobyH.class);
        if (power != null) {
            getWorld().showText("You have obtained the power to shoot Fireballs! Press Space to use it", 500, 500);
            Greenfoot.playSound("Heart.wav");
            
        }
    }
    
}
