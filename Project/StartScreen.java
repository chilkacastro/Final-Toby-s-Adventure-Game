import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Start Screen Class - the game menu which links to start, instructions and credits 
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1065, 600, 1); 
        mouseClicked();
        Greenfoot.playSound("Intro.wav");
        prepare();
    }

    /**
     * mouseClicked() - to move to different worlds by clicking the brown paw on the screen. 
     */
    private void mouseClicked() {
        // paw and start
        Paw pawStart = new Paw();
        addObject(pawStart, 320, 555);
        addObject(new Start(), 420, 560);

        // paw and instruction
        Paw pawInstruction = new Paw();
        addObject(pawInstruction, 520, 555);
        addObject(new Instructions(), 690, 555);

        // paw and credit
        Paw pawCredit = new Paw();
        addObject(pawCredit, 860, 555);
        addObject(new Credits(),975, 555);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
