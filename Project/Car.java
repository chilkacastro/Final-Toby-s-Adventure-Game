import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor {
       private int rotation;
       
       public Car() {
          // do not remove default constructor
           
       }

       public Car(int rotation) {
           setRotation(rotation);
           
       }
       
       /**
        * Act - do whatever the Car wants to do. This method is called whenever
        * the 'Act' or 'Run' button gets pressed in the environment.
        */
        public void act() {
           removeToby();
           move(-2);
    
           if(isAtEdge()) {
               turn(90);
               move(-30);

                  
                  //getWorld().removeObject(this);  
                  
           }

        }
        
        /**
         * removeToby() - to remove Toby from the World and bring him back to his initial position in that level.
         */
        public void removeToby() {
             if (isTouching(Toby.class)) {
                getWorld().addObject(new Blood(), getX()-80, getY());
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
         * deductPoints() - to remove points when Toby touches the traffic cones.
         */
         public void deductPoints() {
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.addScore(-1000);
            myWorld.lifeCount(-1);
    
        }
    
        /**
         * reviveToby() - bring back Toby
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
