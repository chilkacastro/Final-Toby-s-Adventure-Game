import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyPass2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyPass2 extends Actor
{
    /**
     * Act - do whatever the KeyPass2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Toby.class)) {
            Greenfoot.playSound("Key.wav");
        }  
        if (this.getWorld() == null) {
            Greenfoot.playSound("Key.wav");
            Greenfoot.setWorld(new Level2());
            
        } 
    }
}
