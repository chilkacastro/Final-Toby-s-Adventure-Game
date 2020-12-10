import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sources here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sources extends World
{

    /**
     * Constructor for objects of class Sources.
     * 
     */
    public Sources()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 650, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ReturnToStart returnToStart = new ReturnToStart();
        addObject(returnToStart,1467,54);
        Paw paw = new Paw();
        addObject(paw,1280,53);
        returnToStart.setLocation(1381,65);
        removeObject(returnToStart);

        ReturnToStart returnToStart2 = new ReturnToStart();
        addObject(returnToStart2,1426,52);
    }
}
