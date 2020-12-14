import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Power Class - to inform player to pick up the fireball so that Toby could gain fire ability.
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class Power extends Actor
{   
    /**
     * Act - do whatever the Power wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //When touching Toby
        Actor power = getOneObjectAtOffset(0, 0, TobyH.class);
        if (power != null) {
            Greenfoot.playSound("Heart.wav");
        }
    }
    
}
