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
          Greenfoot.setWorld(new Level2());  
        }
        
        int keyCount2 = getWorld().getObjects(KeyPass2.class).size();
         if (getX() == 1200 && (getWorld() instanceof Level2) && (isTouching(Toby.class)) && keyCount2 == 0) {
          Greenfoot.setWorld(new Level3());
          Greenfoot.setWorld(new Level3());
        }
        
       if ( getX() == 400 && (isTouching(Toby.class) && getWorld() instanceof Level2)) {
          Greenfoot.setWorld(new Level1());
           Greenfoot.setWorld(new Level1());
        }
    }
}
