import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends MyWorld
{

    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare();
        //Prompt for Level 4
        GreenfootImage gg = new GreenfootImage("Click here to play the Bonus Level!", 30, Color.BLUE, new Color(0, 0, 0, 0));        gg.setColor(Color.YELLOW);
        getBackground().drawImage(gg, (getWidth()-gg.getWidth())/1, (getHeight()-gg.getHeight())/1);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlaySecond playSecond = new PlaySecond();
        addObject(playSecond, 625,120);
        addObject(new Paw(), 580,70);
        addObject(new Rectangle(score, lifeCount), 950, 420);

        StartF startF = new StartF();
        addObject(startF,1163,625);
        startF.setLocation(1807,608);
        startF.setLocation(1325,623);
        startF.setLocation(1428,585);
        Paw paw2 = new Paw();
        addObject(paw2,1332,578);
        startF.setLocation(1428,587);
        removeObject(startF);
        addObject(startF,1425,578);
        startF.setLocation(1414,582);
        startF.setLocation(1451,585);
    }

    /**
     * mouseClicked() - to move to different worlds by clicking the brown paw on the screen. 
     */
    private void mouseClicked() {
        // Level 4
        Paw pawStart = new Paw();
        addObject(pawStart, 320, 555);
        addObject(new Start(), 420, 560);
    }
}
