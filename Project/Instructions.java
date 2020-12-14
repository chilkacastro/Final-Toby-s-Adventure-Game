import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends ClickLines
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (Greenfoot.mouseClicked(this)) {
          Greenfoot.playSound("Woof.wav");
          Greenfoot.setWorld(new Instruction());
      }
    }    
}
