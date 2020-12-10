import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SourceWord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SourceWord extends ClickLines
{
    /**
     * Act - do whatever the SourceWord wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
          Greenfoot.playSound("Woof.wav");
          Greenfoot.setWorld(new Sources());
  
        }    
    }    
}
