import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
/**
 * Class of Red Car
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor {
       private int rotation;
       private int lineCounter = 0;
       
       /**
        * Default constructor
        */
       public Car() {
          // do not remove default constructor
           
       }


       /**
        * Constructor with one parameter
        */
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
            }

       }
        
        /**
         * removeToby() - to remove Toby from the World and bring him back to his initial position in that level.
         */
        public void removeToby() {
             if (isTouching(Toby.class)) {
                lineCounter++;
                getWorld().addObject(new Blood(), getX()-80, getY());
                Greenfoot.playSound("tireSkid.wav");
                removeTouching(Toby.class);
                //getWorld().showText("You lose a life!",500, 500);
                deductPoints();
                MyWorld myWorld = (MyWorld)getWorld();
                if (myWorld.getLifeCount() > 0) {
                    reviveToby();
                }  
                
                if (lineCounter > 0) {
                    Level1 line = (Level1)getWorld();
                    line.addObject(new HitLine(), 850, 350); 
                
                
                }
            }
        }
    
        /**
         * deductPoints() - to remove points when Toby touches the traffic cones.
         */
         public void deductPoints() {
            MyWorld myWorld = (MyWorld)getWorld();
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
