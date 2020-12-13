import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Actor
{
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if ((isTouching(Toby.class) && getX() == 1400 && (getWorld() instanceof Level1))) {   
           Greenfoot.setWorld(new Level2());  
      }

      if (getX() == 400 && (isTouching(Toby.class) && getWorld() instanceof Level2)) {
          Greenfoot.setWorld(new Level1());
          
      }
    }
}
