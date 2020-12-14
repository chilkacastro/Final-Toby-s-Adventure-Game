import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Credit Screen of the game
 * 
 * @author Chilka, Madalina, Nicolas, Jose 
 * @version Gold Master(December 14, 2020)
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
        // Return to Menu
        addObject(new ReturnToStart(),1000,630);
        addObject(new Paw(),860, 610);
        // Go too Sources Screen
        addObject(new SourceWord(), 590 ,640);
        addObject(new Paw(),700, 610);
        
    }
}
