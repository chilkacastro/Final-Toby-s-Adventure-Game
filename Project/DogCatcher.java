import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class represents one of the obstacles for Toby. It is the dognapper. He moves randomly and in the horizontal direction in order
 * to catch Toby. Whenever the dog is touching the dognapper, one life will be removed.
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version (1)
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
     * Act - the dog catcher moves horizontaly in order to catch Toby. If he captures him, the "Crying" sound should be 
     * played and a text should appear on screen. Toby should also be removed. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
<<<<<<< HEAD
    movement();
    if(isTouching(Toby.class)) {
        Greenfoot.playSound("Crying.wav");
        removeTouching(Toby.class);
        MyWorld myWorld = (MyWorld)getWorld();  
        myWorld.lifeCount(-1);
        getWorld().showText("YOU HAVE BEEN CAPTURED BY THE DOG CATCHER! -1 life",500, 500);
        if (myWorld.getLifeCount() > 0){
        Level2 myLevel2 = (Level2)getWorld();
        myLevel2.addObject(new Toby(), 800, 640);
        }
    }
    rotateAtEdge();
    }
=======
        movement();
        if(isTouching(Toby.class)) {
            Greenfoot.playSound("Crying.wav");
            removeTouching(Toby.class);
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.lifeCount(-1);
            getWorld().showText("You have been CAPTURED AND ENSLAVED BY THE DOG CATCHER!",500, 500);
            if (myWorld.getLifeCount() > 0) {
                Level2 myLevel2 = (Level2)getWorld();
                myLevel2.addObject(new Toby(), 800, 640);
            }   
        }
        //atEdge();
        //slowDown();
        rotateAtEdge();
    }
  

>>>>>>> 696caec4e1c8b53f5bd8019177b11fb4b881908b
    
    /**
     * this method defines the movement of the dog cather. the animation is also included.
     */
    public void movement() {
        counter1++;    
        if (counter1>80) {
            setLocation(getX() + Greenfoot.getRandomNumber(5), getY());
            counter3++; 
            if (counter3 <4) {
                setImage (image1);
<<<<<<< HEAD
            } else if (counter3 >8){
            setImage(image2);
            if (counter3 ==12){
            counter3=0;
            }
=======
            } 
            else if (counter3 >8){
                setImage(image2);
                if (counter3 ==12){
                    counter3=0;
                }
>>>>>>> 696caec4e1c8b53f5bd8019177b11fb4b881908b
            } 
        }
        else if (counter1<80) {
            setLocation(getX() - Greenfoot.getRandomNumber(5), getY());
<<<<<<< HEAD
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
=======
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
>>>>>>> 696caec4e1c8b53f5bd8019177b11fb4b881908b
        }
        if (counter1==100) {
            counter1=0;
        }
    }    
    
<<<<<<< HEAD
    /**
     * if the dog catcher is at the left edge, this method will make him appear at hte right edge.
     */
=======
    
>>>>>>> 696caec4e1c8b53f5bd8019177b11fb4b881908b
    public void rotateAtEdge() {
        if (getX() == 0) {
          setLocation(1590, getY()); 
        }

    }
    
    /**
     * slowDown - Helps slow down the dog's catcher animation.
     */
     public void slowDown(){
<<<<<<< HEAD
    counter2++; 
    if (counter2 < 5){
     setImage (image3);
     }
     else if ( counter2 > 1){
     setImage (image4);         
     counter2= 0;
=======
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
>>>>>>> 696caec4e1c8b53f5bd8019177b11fb4b881908b
    }
  }