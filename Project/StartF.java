import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * StartF Class - clickable play word that brings Toby to Bonus Level(Level 4)
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class StartF extends Actor
{
    /**
     * Act - do whatever the StartF wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (Greenfoot.mouseClicked(this)) {
          Greenfoot.playSound("Woof.wav");
          Greenfoot.setWorld(new MyWorld());
          Greenfoot.setWorld(new Level4());
      }    
    }
}
