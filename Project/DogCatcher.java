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
    private int counterr=0;
    private int slow=0;
    
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
    //atEdge();
    slowDown();
    }
  
    public void movement () {
    counterr++;    
    if (counterr>80) {
        setLocation(getX() + Greenfoot.getRandomNumber(10), getY());
        if (getImage() == image1) {
        setImage(image2);
        }
        else {
        setImage(image1);
        }
        }
        else if (counterr<80) {
        setLocation(getX() - Greenfoot.getRandomNumber(10), getY());
        if (getImage() == image3) {
        setImage(image4);
        }
        else {
        setImage(image3);
        }
        }
    if (counterr==100) {
        counterr=0;
        }
    }    
    
    //public void atEdge(){
    //if (getX() == 1) {
    //   turn(-90);
    //   move (5);
    //} else if (getX() == 1599){
    //  movement();
    //}
    //}
    
    /**
    * removeToby() - to remove Toby from the World and bring him back to his initial position in that level.
    */
        public void removeToby() {
    if (isTouching(Toby.class)) {
         getWorld().addObject(new DogCatcher(), getX()-80, getY());
         removeTouching(Toby.class);
         MyWorld myWorld = (MyWorld)getWorld();
                }  
    }
    /**
     * slowDown - to slow down Toby's movement.
     */
     public void slowDown(){
    // Helps slow down the dog's catcher movement.
     if (slow == 50){
     movement();
     slow = 0;
     }
     else {
     slow += 1;
    }
            }
    }