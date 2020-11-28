import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hole1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hole1 extends Actor
{   
    /**
     * Act - do whatever the Hole1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       removeToby();
       
    }
    
    /**
     * removeToby() - to remove Toby from the World and bring him back to his initial position in that level.
     */
    public void removeToby() {
        if (isTouching(Toby.class)) {
            Greenfoot.playSound("Crying.wav");
            removeTouching(Toby.class);
            getWorld().showText("You lose a life!",500, 500);
            deductPoints();
            MyWorld myWorld = (MyWorld)getWorld();
            if (myWorld.getLifeCount() > 0) {
                reviveToby();
            }   

        }
    }
    
    /**
     * deductPoints() - to remove points when Toby touches the holes.
     */
     public void deductPoints() {
        MyWorld myWorld = (MyWorld)getWorld();
        myWorld.lifeCount(-1);
        myWorld.addScore(-1000);

    }
    
    /**
     * reviveToby() - bring back Toby to initial position.
     */
        public void reviveToby() {
         if (getWorld() instanceof Level1) {
            Level1 myLevel1 = (Level1)getWorld();
            myLevel1.addObject(new Toby(), 800, 640);
         }
         else {
            Level3 myLevel3 = (Level3)getWorld();
            myLevel3.addObject(new Toby(), 800, 640);
       
         }
    }

}
