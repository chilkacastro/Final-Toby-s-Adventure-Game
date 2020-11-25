import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Train2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train2 extends Actor
{   private int trainCounter1 = 0;
        /**
         * Act - do whatever the Train2 wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act() 
        { 
            setLocation(getX()+6, getY());
            
            if (isAtEdge()) {
                trainCounter1++;
                if (trainCounter1 == 8) {
                    setImage("rotateend3.png");
                }
                if (trainCounter1 == 12) {
                    setImage("rotateend2.png");
                }
                if (trainCounter1 == 16) {
                    setImage("rotateend1.png");
                }
                if (trainCounter1 == 18){
                    setImage("RotateTrain.png");
                    setLocation(0, getY());
                    trainCounter1 = 0;
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
                removeTouching(Toby.class);
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