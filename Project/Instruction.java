import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Instruction Screen Class
 * 
 * @author (Chilka, Madalina, Nicolas, Jose)
 * @version Gold Master(December 14, 2020)
 */
public class Instruction extends World
{

    /**
     * Constructor for objects of class Instruction.
     * 
     */
    public Instruction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1150, 650, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Return to Menu
        addObject(new Paw(),80,615);
        addObject(new ReturnToStart(),250,625);
    }
}
