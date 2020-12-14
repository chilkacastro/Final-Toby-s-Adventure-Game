import greenfoot.*;

/**
 * The Door class is implemented to allow Toby go back to a previous level and collect points.
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class Door extends Actor
{
  /**
   * Act - do whatever the Door wants to do. This method is called whenever
   * the 'Act' or 'Run' button gets pressed in the environment.
   */
   public void act() 
  {
      returnLevel1();
      returnLevel2();
    
  }
  
  /**
   * returnLevel1 - to return to previous level(level 2) if player is in level 2.
   */
   public void returnLevel1() {
    if (getX() == 400 && (isTouching(Toby.class) && getWorld() instanceof Level2)) {
          Greenfoot.setWorld(new Level1());
    }
  }

  /**
   * returnLevel2 - to return to previous level(level 2) if player is in level 3.
   */
   public void returnLevel2() {
    if (getX() == 400 && (isTouching(Toby.class) && getWorld() instanceof Level3)) {
          Greenfoot.setWorld(new Level2());
    }
  }
}

