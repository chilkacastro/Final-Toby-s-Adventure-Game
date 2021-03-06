import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Green Car Class
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version  Gold Master(December 14, 2020)
 */
public class Car4 extends Car
{
    private int rotation;
    private int lineCounter = 0;
       
       public Car4() {
          // used for default car direction       
           
       }
       
       /**
        * Constructor with one parameter(rotation) - rotates the car to opposite direction
        */
       public Car4(int rotation) {
           setRotation(rotation);
           
       }
       
       /**
        * Act - do whatever the Car wants to do. This method is called whenever
        * the 'Act' or 'Run' button gets pressed in the environment.
        */
        public void act() {
           removeToby();
           move(2);
           if(isAtEdge()) {
               setLocation(1640, getY());
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
                 if (getWorld() instanceof Level1) {
                        Level1 line1 = (Level1)getWorld();
                        line1.addObject(new HitLine(), 850, 350); 
    
                 }
                 
                 if (getWorld() instanceof Level3) {
                        Level3 line3 = (Level3)getWorld();
                        line3.addObject(new HitLine(), 850, 350); 
    
                 }

             }  
       }
}
       
