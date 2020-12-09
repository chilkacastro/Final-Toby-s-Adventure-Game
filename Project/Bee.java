public class Bee extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int rotation;
<<<<<<< HEAD
=======
    private int lineCounter = 0;
   
        /**
         * Default constructor
         */
>>>>>>> 9edf2d795e5827898d16c2d825993613b16445de
    
        public Bee(){
            image1 =  new  GreenfootImage("bee1.png");
            image2 =  new  GreenfootImage("bee2.png");
        }

<<<<<<< HEAD
 

    public Bee(){
        image1 =  new  GreenfootImage("bee1.png");
        image2 =  new  GreenfootImage("bee2.png");
    }
    
    /**
     * Constructor with one parameter
     */
    public Bee(int rotation){
        image1 =  new GreenfootImage("bee1.png");
        image2 =  new GreenfootImage("bee2.png");
        setRotation(rotation);
        setRotation(90);
=======
        /**
         * Constructor with one parameter
    
         */
        public Bee(int rotation){
            image1 =  new GreenfootImage("bee1.png");
            image2 =  new GreenfootImage("bee2.png");
            setRotation(rotation);
            setRotation(90);
            
        }
>>>>>>> 9edf2d795e5827898d16c2d825993613b16445de
        
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
                lineCounter++;
                Greenfoot.playSound("Bee.wav");
                MyWorld myWorld = (MyWorld)getWorld();
                myWorld.addScore(-100);
              //getWorld().showText("You LOSE Points!",450, 350);
               if (lineCounter > 0) {
                   Level3 line = (Level3)getWorld();
                   line.addObject(new BeeLine(), 850, 350); 
                    
               }
          }
                
                
        }
<<<<<<< HEAD
    }
    
    /**
     * decreasePoints() - to decrease the points of Toby when the bee goes near him and to play a sound.
     */
    public void decreasePoints(){
        if (isTouching(Toby.class)) {
            Greenfoot.playSound("Crying.wav");
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.addScore(-100);
            
            
        }
    }
}
=======
    
}
>>>>>>> 9edf2d795e5827898d16c2d825993613b16445de
