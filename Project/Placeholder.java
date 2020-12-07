import lang.stride.*;
import java.util.List;
import greenfoot.*;

/**
 * 
 */
public class Placeholder extends Actor
{
    int test = 0;
    /**
     * Constructor
     */
    public Placeholder()
    {
        //test = Greenfoot.getRandomNumber(50);
    }

    /**
     * Moves towards left screen
     */
    public void act()
    {        
        Actor toby = getOneObjectAtOffset(0, 0, Toby.class);
        if (toby != null) {
            World theWorld = getWorld();
            theWorld.removeObject(toby);
            Greenfoot.playSound("Crying.wav");
            Greenfoot.stop();
            getWorld().showText("POISONED!", 300, 200);
        }
        moveAndTurn(); 
    }

    /**
     * Makes it move and turn
     */
    public void moveAndTurn()
    {
        move(3);
        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(30) - 15);
        }
        if(isAtEdge()) {
            turn(180);
        }
    }
}
