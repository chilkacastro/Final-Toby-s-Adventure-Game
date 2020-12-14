import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * House Class- Toby's home
 * 
 * @author (Chilka,, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class House extends Actor
{
    /**
     * Act - do whatever the House wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Toby.class)) {
           Greenfoot.playSound("House.wav");
           removeTouching(Toby.class);
           Greenfoot.setWorld(new WinScreen());
        }
    }    
}
