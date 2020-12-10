import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CounterT here. @author (your name) @version (a version number or a date)
 */
public class CounterT extends Actor
{ 
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    protected int lifescore = 1000;
    
    public CounterT() {
         
         setImage( new  GreenfootImage("Replay Level 3: Road to Toby's House", 30, Color.RED, Color.BLACK));
         
    }
    /**
     * Act - do whatever the CounterT wants to do. A CounterT will appear whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       
        if (lifescore == 0) {
            Greenfoot.stop();
            getWorld().showText("YOU DIED!", 300, 200);
        }
        
    }

    /**
     * Adds one life to the total amount of life
     */
    public void addLife()
    {
        lifescore = lifescore++;
    }

    /**
     * Removes one life to the total amount of life
     */
    public void minLife()
    {
        lifescore = lifescore--;
    } 
    
} 
