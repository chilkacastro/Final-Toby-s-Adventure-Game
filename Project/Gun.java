import greenfoot.*;  
/**
 * Gun Class - fireball of Toby in Bonus Level(Level4)
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class Gun extends Actor
{
    private Level4 myWorld;
    private int used = 0;
    
    /**
     * Act - do whatever the Gun wants to do. This method is called 
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(15);
        checkDestroy();
        if(isAtEdge())
        //Removes fireball when it reaches edge
        {
            myWorld.removeObject(this);
        }
    }  
    
    /**
     * addedToWorld() - to add fireball to Level 4
     */
    public void addedToWorld(World world)
    {
        myWorld = (Level4)world;
    } 
    
    /**
     * checkDestroy()- checks if fireball touches spider to destroy it
     */
    public void checkDestroy()
    {
      if(used == 0){
        Spider spider = (Spider)getOneIntersectingObject (Spider.class);
        if(spider != null) {
            getWorld().removeObject(spider);
            used = 1;
        }
      }
    }
}
