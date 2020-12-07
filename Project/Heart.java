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
    private int counter=0;
    /**
     * Makes heart look like it is rotating
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
    public void act() 
    {
    counter++;   
    getImage();
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
    gainPoints();  
    }
    /**
     * Gain a life if Toby grabs the heart
     */
    public void gainPoints(){
            if (isTouching(Toby.class)) {
            ((MyWorld)getWorld()).lifeCount(+1); 
            getWorld().showText("YOU GAINED 1 LIFE!",450, 350);
            getWorld().removeObject(this);
        }
    }
}
