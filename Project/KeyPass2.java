import greenfoot.*; 

/**
 * The KeyPass2 class helps you to get to the next level once you collect all 3 objects from the Level2 class.
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version (1)
 */
public class KeyPass2 extends Actor
{
    /**
     * Act - do whatever the KeyPass2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Toby.class)) {
            Greenfoot.playSound("Key.wav");
        }  
        if (this.getWorld() == null) {
            Greenfoot.playSound("Key.wav");
            Greenfoot.setWorld(new Level2());
            
        } 
    }
}
