import greenfoot.*;  
public class Gun extends Actor
{
    private Level4 myWorld;
    private int used = 0;
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
    public void addedToWorld(World world)
    {
        myWorld = (Level4)world;
    } 
    /**
     * Checks if fireball touches spider to destroy it
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
