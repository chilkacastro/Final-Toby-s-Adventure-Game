import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * DogCatcher2 Class - represents one of Toby's obstacle. He moves randomly in the horizontal direction in order to catch Toby. Whenever the dog is 
 * touching the dog catcher, one life will be removed.
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class DogCatcher2 extends Actor{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private int counter1 = 0;
    private int counter2 = 0;
    private int counter3 = 0;
    private int lineCounter = 0;
    
    /**
     * Default Constructor
     */
    public DogCatcher2(){
        image1 = new GreenfootImage("rightcatcher1.png");
        image2 = new GreenfootImage("rightcatcher2.png");
        image3 = new GreenfootImage("leftcatcher1.png");
        image4 = new GreenfootImage("leftcatcher2.png");       
    }

    /**
     * Act - the dog catcher moves horizontaly in order to catch Toby. If he captures him, the "Crying" sound should be 
     * played and a text should appear on screen. Toby should also be removed. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        removeToby();
        rotateAtEdge();
    }
    
    /**
     * removeToby()- if catcher meets Toby, player loses a life, a sound is played and a pop-up line appears.
     */
    public void removeToby() {
        if(isTouching(Toby.class)) {
            deductLife();
            removeTouching(Toby.class);
            reviveToby();
            printMessage();

        }
    }
  
    /**
     * deductLife() - to remove a life when Toby touches the Dog Catcher
     */
    public void deductLife() {
       Greenfoot.playSound("Crying.wav");
       MyWorld myWorld = (MyWorld)getWorld();
       myWorld.lifeCount(-1);
        
    }
    
    /**
     * reviveToby() - to revive Toby when life count is higher than 0.
     */
    public void reviveToby() {
        MyWorld myWorld = (MyWorld)getWorld();
        if (myWorld.getLifeCount() > 0) {
           Level3 myLevel3 = (Level3)getWorld();
           myLevel3.addObject(new Toby(), 800, 640);
        }   
    }
  
    /**
     * movement() - this method defines the movement of the dog catcher including the animation.
     */
    public void movement() {
        counter1++;    
        if (counter1 > 80) {
            setLocation(getX() + Greenfoot.getRandomNumber(5), getY());
            counter3++;
            if (counter3 < 4) {
                setImage(image1);
            } 
            else if (counter3 > 8){
                setImage(image2);
                if (counter3 == 12){
                    counter3 = 0;
                }
            } 
        }
        else if (counter1 < 80) {
            setLocation(getX() - Greenfoot.getRandomNumber(5), getY());
            counter2++; 
            if (counter2 < 4){
                setImage(image3);
            }
            else if ( counter2 > 8){
                setImage(image4); 
                if (counter2 == 12){
                 counter2 = 0;
                }
            }

        }
        if (counter1 == 100) {
            counter1 = 0;
        }
    }    

    /**
     * rotateEdge() - if the dog catcher is at the left edge, this method will make him appear at the right edge.
     */

    public void rotateAtEdge() {
        if (getX() == 0) {
          setLocation(1590, getY()); 
        }
    }

    /**
     * printMessage() - to print a message when Toby touches the Dog Catcher
     */
    public void printMessage() {
      lineCounter++;
      if (lineCounter > 0) {
           Level3 myLevel3 = (Level3)getWorld();
           myLevel3.addObject(new CatcherLine(), 700, 400); 
      }
    }
}
