import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlaySecond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlaySecond extends Actor
{
    /**
     * Act - do whatever the PlaySecond wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new StartScreen());
        }    
     }
}
