import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends MyWorld
{

    /**
     * Constructor for objects of class Credit.
     * 
     */
    public Credit()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new ReturnToStart(),1000,630);
        addObject(new Paw(),860, 610);
        addObject(new Paw(),700, 610);
        addObject(new SourceWord(), 590 ,640);
    }
}
