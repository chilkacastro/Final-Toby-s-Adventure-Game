import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Yellow Car Class
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version  Gold Master(December 14, 2020)
 */
public class Car3 extends Car
{
    private int rotation;
    private int lineCounter = 0;
       
       public Car3() {
          // used for default car direction       
           
       }
       
       /**
        * Constructor with one parameter(rotation) - rotates the car to opposite direction
        */
       public Car3(int rotation) {
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
             if (lineCounter > 0) {
                 Level1 myLevel1 = (Level1)getWorld();
                 myLevel1.addObject(new Toby(), 800, 640);

             }
       
       }
       
        /**
         * printMessage() - to print a message when Toby touches the red car.
         */
        public void printMessage() {
             lineCounter++;
             if (lineCounter > 0) {
                  Level1 line = (Level1)getWorld();
                  line.addObject(new HitLine(), 850, 350); 

             }
       }
}
       
