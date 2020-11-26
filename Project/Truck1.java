import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Truck1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck1 extends Actor
{
    /**
     * Act - do whatever the Truck1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getX()-6, getY());   
       removeToby();
       if (getX() == 0) {
           setLocation(1650,getY());
       }
    }
        
        /**
         * removeToby() - to remove Toby from the World and bring him back to his initial position in that level.
         */
        public void removeToby() {
            if (isTouching(Toby.class)) {
                Greenfoot.playSound("tireSkid.wav");
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
         * deducPoints() - to remove points when Toby touches the traffic cones.
         */
         public void deductPoints() {
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.lifeCount(-1);
    
        }
    
        /**
         * reviveToby() - bring back Toby
         */
        public void reviveToby() {
            Level3 myLevel3 = (Level3)getWorld();
            myLevel3.addObject(new Toby(), 800, 640);
           
        }
    }
      


 