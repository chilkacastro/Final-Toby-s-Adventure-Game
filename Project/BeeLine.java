import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeeLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeeLine extends Lines
{
    private int counter = 0;
    /**
     * Act - do whatever the HitLine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        counter++;
        if (counter == 60) {
            getWorld().removeObject(this);
            counter = 0; 
        }
  
  }
}
