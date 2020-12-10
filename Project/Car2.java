     import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Car2 here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Car2 extends Car {
       private int rotation;
       private int lineCounter = 0;
        
       public Car2() {
           // do not remove
           
       }
       /**
        * Rotates the car
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
         * removeToby() - to remove Toby from the World and bring him back to his initial position in that level.
         */
        public void removeToby() {
            if (isTouching(Toby.class)) {
                lineCounter++;
                getWorld().addObject(new Blood(), getX()-50, getY());
                Greenfoot.playSound("tireSkid.wav");
                removeTouching(Toby.class);
                //getWorld().showText("You lose a life!",500, 500);
                deductPoints();
                MyWorld myWorld = (MyWorld)getWorld();
                if (myWorld.getLifeCount() > 0) {
                    reviveToby();
                }   
                
                if (lineCounter > 0) {
                    if (getWorld() instanceof Level1) {
                        Level1 line = (Level1)getWorld();
                        line.addObject(new HitLine(), 850, 350); 
                    }
                    else {
                      Level3 line2 = (Level3)getWorld();
                      line2.addObject(new HitLine(), 850, 350);   
                     
                    }
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
      


      

