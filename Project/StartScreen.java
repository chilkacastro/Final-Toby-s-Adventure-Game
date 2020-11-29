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
    }
    
    private void mouseClicked() {
      Paw pawStart = new Paw();
      addObject(pawStart, 390, 560);
 
      Paw pawInstruction = new Paw();
      addObject(pawInstruction, 630, 560);
      
      Paw pawCredit = new Paw();
      addObject(pawCredit, 880, 560);
    
      addObject(new Start("Start"), 880, 560);
      
    }
}
