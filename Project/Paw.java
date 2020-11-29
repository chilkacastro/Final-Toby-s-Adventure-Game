import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paw here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paw extends Actor
{
    /**
     * Act - do whatever the Paw wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {if (Greenfoot.mouseClicked(this) && getX() == 390) {
          Greenfoot.setWorld(new Level1());
      }
        
     if (Greenfoot.mouseClicked(this) && getX() == 630) {
          Greenfoot.setWorld(new Instruction());
     }
     
      if (Greenfoot.mouseClicked(this) && getX() == 880) {
          Greenfoot.setWorld(new Instruction());
     }
    }
}