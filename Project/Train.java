    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Train here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Train extends Actor
    {
        private int trainCounter = 0;
  
        /**
         * Act - do whatever the Train wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act() 
            {
                setLocation(getX()-6, getY());
                if (getX() == 0) {
                    trainCounter++;
                    if (trainCounter == 5) {
                        setImage("end3.png");
                    }
                    if (trainCounter == 10) {
                        setImage("end2.png");
                    }
                    if (trainCounter == 12) {
                        setImage("end1.png");
                    }
                    if(trainCounter == 14){
                        setImage("Train3.png");
                        setLocation(1650,getY());
                        trainCounter = 0;
                    }
                }
                removeToby();
        }    
        /**
         * removeToby() - to remove Toby from the World and bring him back to his initial position in that level.
         */
            public void removeToby() {
            if (isTouching(Toby.class)) {
                getWorld().addObject(new Blood(), getX()-80, getY());
                Greenfoot.playSound("Train.wav");
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
            myWorld.addScore(-1000);
    
        }
    
        /**
         * reviveToby() - bring back Toby
         */
        public void reviveToby() {
            Level2 myLevel2 = (Level2)getWorld();
            myLevel2.addObject(new Toby(), 800, 640);
           
        }
        

    }
      

