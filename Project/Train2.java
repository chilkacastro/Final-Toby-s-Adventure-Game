import greenfoot.*;

/**
 * The Train2 class is one of the main objects from the level 2. Whenever Toby touches a train, this will automatically remove one life.
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class Train2 extends Actor
{   private int trainCounter = 0;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private GreenfootImage image7;
    private GreenfootImage image8;
    private int lineCounter = 0;
    
    /**
     * Default constructor
     */
    public Train2() {
        image1 = new GreenfootImage("Train2.png");
        image2 = new GreenfootImage("rotateend1.png");
        image3 = new GreenfootImage("rotateend2.png");
        image4 = new GreenfootImage("rotateend3.png");
        image5 = new GreenfootImage("rotateend4.png");
        image6 = new GreenfootImage("rotateend5.png");
        image7 = new GreenfootImage("rotateend6.png");
        setImage(image1);
    }
  
    /**
     * Act - do whatever the Train wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        setLocation(getX() + 6, getY());
        switchImage();
        removeToby();
    } 
    
     /**
     * switchImage() - to make the disappearance of the train realistic
     */
    public void switchImage() {
        if (isAtEdge()) {
            trainCounter++;
            if (trainCounter == 8) {
                setImage(image1);
            }
            if (trainCounter == 16 ) {
                setImage(image2);
            }
            if (trainCounter == 24) {
                setImage(image3);
            }
            if (trainCounter == 32) {
                setImage(image4);
            }
            if (trainCounter == 40) {
                setImage(image5);
            }
            if (trainCounter == 48) {
                setImage(image6);
            }
            if(trainCounter == 56){
                setImage("Train2.png");
                setLocation(0,getY());
                trainCounter = 0;
            }
        }
        
    }

    /**
     * removeToby() - to remove Toby from the World and bring him back to his initial position in that level.
     */
        public void removeToby() {
        if (isTouching(Toby.class)) {
            getWorld().addObject(new Blood(), getX()-80, getY());
            Greenfoot.playSound("Train.wav");
            removeTouching(Toby.class);
            deductPoints();
            printMessage();
            reviveToby();
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
     * reviveToby() - bring back Toby if life count is higher than 0
     */
    public void reviveToby() {
        MyWorld myWorld = (MyWorld)getWorld();
        if (myWorld.getLifeCount() > 0) {
            if (getWorld() instanceof Level2) {
                Level2 myLevel2 = (Level2)getWorld();
                myLevel2.addObject(new Toby(), 800, 640);
            }
        }
    }
    
    /**
     * printMessage() - to print a message whenever Toby touches the heart
     */
     public void printMessage() {
        lineCounter++;
        if (lineCounter > 0) {
           Level2 line = (Level2)getWorld();
           line.addObject(new HitLine(), 850, 350); 
  
        }
    }
}
    
      

