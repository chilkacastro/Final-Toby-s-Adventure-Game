import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Counter here. @author (your name) @version (a version number or a date)
 */
public class Counter extends Actor
{ 
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    protected int lifescore = 1000;
    
    public Counter() {
         
         setImage( new  GreenfootImage("Touch key to replay Level 2: Desert Trains", 30, Color.YELLOW, Color.BLACK));
         
    }
    /**
     * Act - do whatever the Counter wants to do. A Counter will appear whenever the 'Act' or 'Run' button gets pressed in the environment.
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
