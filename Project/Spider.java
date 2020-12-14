import greenfoot.*;

/**
 * Spider Class - Toby's obstacle in the Bonus Level(Level 4)
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class Spider extends Obstacles
{
    /**
     * Act - do whatever the Train wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {        
        Actor toby = getOneObjectAtOffset(0, 0, TobyH.class);
        if (toby != null) {
            World theWorld = getWorld();
            theWorld.removeObject(toby);
            Greenfoot.playSound("Crying.wav");
            getWorld().showText("POISONED!", 800, 300);
            Greenfoot.stop();
       }
       moveAndTurn(); 
    }

    /**
     * moveAndTurn() - random movement of the spiders
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
