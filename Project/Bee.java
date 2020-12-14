import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bee Class - one of Toby's obstacles in Level 3 which decreases points by 500.
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */

public class Bee extends Obstacles
{
        private GreenfootImage image1;
        private GreenfootImage image2;
        private int rotation;
        private int lineCounter = 0;
   
        /**
         * Default constructor
         */
    
        public Bee(){
            image1 =  new  GreenfootImage("bee1.png");
            image2 =  new  GreenfootImage("bee2.png");
        }

        /**
         * Constructor with one parameter(rotation) - turns the bee to opposite direction
         */
        public Bee(int rotation){
            image1 =  new GreenfootImage("bee1.png");
            image2 =  new GreenfootImage("bee2.png");
            setRotation(rotation);
            setRotation(90);
        }
        
        /**
         * Act - do whatever the Bee wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act() {
            move(3);
            turnAtEdge();
            randomTurn();
            switchImage();
            decreasePoints();
        }
       
        /**
         * turnAtEdge() - Check whether we are at the edge of the world. If we are, turn a bit. If not, do nothing.
         */
        public void turnAtEdge() {
            if (isAtEdge()) {
                turn(20);
            }
        }
    
        /**
         * switchImage() - Alternate the bee's image between image1 and image2.
         */
        public void switchImage() {
            if (getImage() == image1) {
                setImage(image2);
            }
            else {
                setImage(image1);
            }
        }
        
        /**
         * randomTurn() - Randomly decide to turn from the current direction, or not. If we turn turn a bit left or right by a random degree.
         */
        public void randomTurn() {
            if (Greenfoot.getRandomNumber(100) > 90) {
                turn(Greenfoot.getRandomNumber(40) - 10);
            }
        }

        /**
         * decreasePoints() - to decrease the points of Toby when the bee goes near him and to play a sound.
         */
        public void decreasePoints(){
           if (isTouching(Toby.class)) {
               Greenfoot.playSound("Bee.wav");
               removeTouching(Toby.class);
               MyWorld myWorld = (MyWorld)getWorld();
               myWorld.addScore(-500);
               printMessage();
               reviveToby();
 
           }

        }
    
        /**
         * reviveToby() - to bring back Toby if life count is higher than 0.
         */
        public void reviveToby() {
             MyWorld myWorld = (MyWorld)getWorld();
             if (myWorld.getLifeCount() > 0) {
                 Level3 myLevel3 = (Level3)getWorld();
                 myLevel3.addObject(new Toby(), 800, 640);
             }
        }
        
        /**
         * printMessage() - to print a message whenever Toby touches the heart
         */
        public void printMessage() {
           lineCounter++;
           if (lineCounter > 0) {
               Level3 line = (Level3)getWorld();
               line.addObject(new BeeLine(), 850, 350); 
  
           }
        }
}
        
        
