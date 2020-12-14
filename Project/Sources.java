import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Sources Screen Class (Credits to Images and Sounds used in making the game)
 * 
 * @author (Chilka, Madalina, Nicolas, Jose)
 * @version Gold Master(December 14, 2020)
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
        addObject(new Paw(),1310,53);
    }
}
