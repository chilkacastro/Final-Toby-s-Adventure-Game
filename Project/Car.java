
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
/**
 * Class of Red Car
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class Car extends Actor {
       private int rotation;
       private int lineCounter = 0;
       
       /**
        * Default constructor
        */
       public Car() {
          // used to add object in level 1
       }

       /**
        * Constructor with one parameter(rotation) - to rotate the car so that it could be used in the opposite direction
        * 
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
        * removeToby() - to remove Toby from the World and replace health Toby with Toby with blood.
        */
        public void removeToby() {
             if (isTouching(Toby.class)) {
                Greenfoot.playSound("tireSkid.wav");
                getWorld().addObject(new Blood(), getX()-80, getY());
                removeTouching(Toby.class);
                deductLife();
                reviveToby();
                printMessage();
     
           }
       }
    
       /**
         * deductPoints() - to remove points when Toby touches the red car.
         */
         public void deductLife() {
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.lifeCount(-1);
       }
    
       /**
         * reviveToby() - to bring back Toby if life count is higher than 0.
         */
        public void reviveToby() {
             MyWorld myWorld = (MyWorld)getWorld();
             if (myWorld.getLifeCount() > 0) {
                 // to reuse car in  level 1 and level 3(prevents logic errors when car hits Toby)
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
       
        /**
         * printMessage() - to print a message when Toby touches the red car.
         */
        public void printMessage() {
             lineCounter++;
             if (lineCounter > 0) {
                                     Level3 line3 = (Level3)getWorld();
                      line3.addObject(new HitLine(), 850, 350);   
             }

       }
}
