import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private int counter = 0;
    private int counter2 = 0;
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
        lineCounter++;
        counter++;   
        getImage();
        gainPoints();  
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
           lineCounter++;
           counter2++;
           MyWorld myWorld = (MyWorld)getWorld();
           myWorld.lifeCount(+1);
           //getWorld().showText("YOU GAINED 1 LIFE!",450, 350);
           Greenfoot.playSound("Heart.wav");
           
           if (counter2 == 8){
               getWorld().showText("",797, 350);           
           }

           if (lineCounter > 0) {
                Level3 myLevel3 = (Level3)getWorld();
                myLevel3.addObject(new PlusLifeLine(), 840, 400);
           }
           
           getWorld().removeObject(this);
        }
    }
}
