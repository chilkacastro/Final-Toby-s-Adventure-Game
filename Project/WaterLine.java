import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * WaterLine Class - This is a pop-up line that appears when Toby touches the deep water
 * 
 * @author (Chilka, Madalina, Nicolas, Jose)
 * @version Gold Master(December 14, 2020)
 */
public class WaterLine extends Lines
{
    private int counter = 0;
    /**
     * Act - do whatever the PlusPoint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        counter++;
        if (counter == 60) {
            getWorld().removeObject(this);
            counter = 0; 
        }
    }    
        
}
