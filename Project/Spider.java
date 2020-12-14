import lang.stride.*;
import java.util.List;
import greenfoot.*;

/**
 * 
 */
public class Spider extends Obstacles
{
    int test = 0;
    /**
     * Constructor
     */
    public Spider()
    {
        //test = Greenfoot.getRandomNumber(50);
    }

    /**
     * Moves randomly in the screen
     */
    public void act()
    {        
        Actor toby = getOneObjectAtOffset(0, 0, TobyH.class);
        if (toby != null) {
            World theWorld = getWorld();
            getWorld().addObject(new Blood(), getX()-80, getY());
            theWorld.removeObject(toby);
            Greenfoot.playSound("Crying.wav");
            Greenfoot.stop();
            getWorld().showText("POISONED!", 300, 200);
        }
        moveAndTurn(); 
    }

    /**
     * 
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
