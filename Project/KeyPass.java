import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * KeyPass Class - first level keys that Toby needs to collect to be able to move to the next level.
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
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
