import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CatcherLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CatcherLine extends Lines
{
    private int counter;
    /**
     * Act - do whatever the PlusPoint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        counter++;
        if (counter == 50) {
            getWorld().removeObject(this);
            counter = 0; 
        }
    }    
}
