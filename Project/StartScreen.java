import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        //Greenfoot.playSound("Intro.wav");

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

        //addObject(new Start("Start"), 880, 560);

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
