import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DogCatcher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DogCatcher extends Actor{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private int counter1=0;
    private int counter2=0;
    private int counter3= 0;
    
    public DogCatcher(){
        image1 = new GreenfootImage("dn_right1.png");
        image2 = new GreenfootImage("dn_right2.png");
        image3 = new GreenfootImage("dn_left1.png");
        image4 = new GreenfootImage("dn_left2.png");       
    }
    /**
     * Act - do whatever the DogCatcher wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    movement();
    if(isTouching(Toby.class)) {
        Greenfoot.playSound("Crying.wav");
        removeTouching(Toby.class);
        getWorld().showText("You have been CAPTURED AND ENSLAVED BY THE DOG CATCHER!",500, 500);
        Greenfoot.stop();
    }
    //atEdge();
    //slowDown();
    rotateAtEdge();
    }
  
    
    /**
     * Movement of dog catcher
     */
    public void movement() {
        counter1++;    
        if (counter1>80) {
            setLocation(getX() + Greenfoot.getRandomNumber(5), getY());
            counter3++;
            if (counter3 <4) {
                setImage (image1);
            } else if (counter3 >8){
            setImage(image2);
            if (counter3 ==12){
            counter3=0;
            }
                                   } 
        }
        else if (counter1<80) {
            setLocation(getX() - Greenfoot.getRandomNumber(5), getY());
            counter2++; 
        
        if (counter2 < 4){
         setImage (image3);
         }
         else if ( counter2 > 8){
         setImage (image4); 
         if (counter2==12){
         counter2= 0;
        }
        }
          //    if (getImage() == image3) {
          //  setImage(image4);
          //  }
          //  else {
          //  setImage(image3);
          //  }
        }
        if (counter1==100) {
            counter1=0;
        }
    }    
    /**
     * Rotates if reaches edge
     */
    public void rotateAtEdge() {
        if (getX() == 0) {
          setLocation(1590, getY()); 
        }
        
       
    }
    /**
     * slowDown - to slow down Toby's movement.
     */
     public void slowDown(){
    // Helps slow down the dog's catcher movement.
    counter2++; 
    if (counter2 < 5){
     setImage (image3);
     //movement();
     }
     else if ( counter2 > 1){
     setImage (image4);         
     counter2= 0;
    }
            }
    }