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
    private int counter=0;
    /**
     * 
     */
    public Heart(){
    image1 = new GreenfootImage("heart1.png");
    image2 = new GreenfootImage("heart2.png");
    }
    /**
     * Act - do whatever the Heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
counter++;   
if (counter<10) {
setImage(image1);
}
else if (counter>20){
setImage(image2);
    counter=0;
}   
    }
    public void gainPoints(){
            if (isTouching(Toby.class)) {
            //((MyWorld)getWorld()).addTrial(+1); 
            getWorld().showText("YOU GAINED 1 LIFE!",450, 350);
            getWorld().removeObject(this);
        }
    }
}
