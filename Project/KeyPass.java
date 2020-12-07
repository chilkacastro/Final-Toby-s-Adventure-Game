import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyPass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyPass extends Actor
{
    /**
     * Act - do whatever the KeyPass wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (isTouching(Toby.class)) {
        Greenfoot.playSound("Key.wav");
     }  

    }
}
