import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Stop Class - to quit the game and return to the menu
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class Stop extends ClickLines
{
    /**
     * Act - do whatever the Stop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        if (Greenfoot.mouseClicked(this)) {
               Greenfoot.playSound("Woof.wav");
               Greenfoot.setWorld(new MyWorld());
               Greenfoot.setWorld(new StartScreen());
        }
    } 
}

