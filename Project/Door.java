import greenfoot.*;

/**
 * The Door class is implemented to allw Toby get to the previous level.
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version (1)
 */
public class Door extends Actor
{
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
<<<<<<< HEAD
       if ((isTouching(Toby.class) && getX() == 1400 && (getWorld() instanceof Level1))) {
          Greenfoot.setWorld(new Level2());     
          Greenfoot.setWorld(new Level2());  
       }

       if (getX() == 400 && (isTouching(Toby.class) && getWorld() instanceof Level2)) {
=======
       if ((isTouching(Toby.class) && getX() == 1400 && (getWorld() instanceof Level1))) {   
           Greenfoot.setWorld(new Level2());  
      }

      if (getX() == 400 && (isTouching(Toby.class) && getWorld() instanceof Level2)) {
>>>>>>> 8ea8d6866e161677888552063a2c9ad707c09850
          Greenfoot.setWorld(new Level1());
          
      }
    }
}
