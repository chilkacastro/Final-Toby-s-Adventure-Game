import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Heart Class - increase Toby's life by 1.
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class Heart extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private int counter = 0;
    private int lineCounter = 0;
    /**
     * Default constructor
     */
    public Heart(){
        image1 = new GreenfootImage("heart2.png");
        image2 = new GreenfootImage("heart3.png");
        image3 = new GreenfootImage("heart1.png");
        setImage(image1);
    }
    
    /**
     * Act - do whatever the Heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        switchImage();
        gainPoints();  
         
    }

    /**
     * switchImage() - to animate the heart
     */
    public void switchImage() {
        counter++;
        Greenfoot.playSound("Heart.wav");
        if (counter == 10) {
             setImage(image1);
        }
        else if (counter == 15) {
             setImage(image2);
        }
        else if (counter == 20){
            setImage(image3);
            counter=0;
        } 
    }
    
    /**
     * gainPoints() - to gain points if Toby touches and picks up the heart.
     */
    public void gainPoints(){
        if (isTouching(Toby.class)) {
           MyWorld myWorld = (MyWorld)getWorld();
           myWorld.lifeCount(+1);
           printMessage();
           getWorld().removeObject(this);
        }
    }  
    
    /**
     * printMessage() - to print a message whenever Toby touches the heart
     */
    public void printMessage() {
       lineCounter++;
       if (lineCounter > 0) {
            Level3 myLevel3 = (Level3)getWorld();
            myLevel3.addObject(new PlusLifeLine(), 840, 450);
       }
    }
 }
    

