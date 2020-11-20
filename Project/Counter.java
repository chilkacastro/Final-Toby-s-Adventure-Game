import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Counter here. @author (your name) @version (a version number or a date)
 */
public class Counter extends Actor
{ 
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    // protected int lifescore = 3;

    /**
     * Act - do whatever the Counter wants to do. A Counter will appear whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       /* setImage( new  GreenfootImage("Life : " + lifescore, 30, Color.YELLOW, Color.BLACK));
        if (lifescore == 0) {
            Greenfoot.stop();
            getWorld().showText("YOU DIED!", 300, 200);
        }
        */
    }

    /**
     * Adds one life to the total amount of life
     */
    public void addLife()
    {
        //lifescore = lifescore + 1;
    }

    /**
     * Removes one life to the total amount of life
     */
    public void minLife()
    {
        //lifescore = lifescore - 1;
    } 
    
} 
