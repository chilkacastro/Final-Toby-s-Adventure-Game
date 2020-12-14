     import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Class of Blue Car
     * 
     * @author (Chilka, Madalina, Nicolas, Jose) 
     * @version Gold Master(December 14, 2020)
     */
    public class Car2 extends Car {
       private int rotation;
       private int lineCounter = 0;
        
       /**
        * Default constructor 
        */
        public Car2() {
           // used for default car direction       
       }
        
       /**
        * Constructor with one parameter(rotation) - rotates the car to opposite direction
        */
        public Car2(int rotation) {
           setRotation(rotation);
               
       }
        
       /**
        * Act - do whatever the Car2 wants to do. This method is called whenever
        * the 'Act' or 'Run' button gets pressed in the environment.
        */
        public void act() {
            move(2);    
            removeToby();
            if(isAtEdge()) {
                turn(90);
                move(35);
                
            } 
       }
                
       /**
        * removeToby() - to remove Toby from the World and replace health Toby with Toby with blood.
        */
        public void removeToby() {
            if (isTouching(Toby.class)) {
                Greenfoot.playSound("tireSkid.wav");
                getWorld().addObject(new Blood(), getX()-50, getY());
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
                      Level1 line = (Level1)getWorld();
                      line.addObject(new HitLine(), 850, 350); 
                   }
                   
             }
       }
  }
        
        


      

