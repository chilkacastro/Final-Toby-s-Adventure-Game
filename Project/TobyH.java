import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A class of the main character, TobyH. TobyH for Bonus Level(Level 4)
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class TobyH extends Actor {
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private GreenfootImage image7;
    private GreenfootImage image8;
    private GreenfootImage image9;
    private GreenfootImage image10;
    private GreenfootImage image11;
    private GreenfootImage image12;
    private int slow = 0;
    private int keyCount = 0;
    private Actor gun;
    private int numShot = 0;
    private int shotDelay = 0;
    /**
     * Default Constructor- To create objects.
     */  
    public TobyH() {
        image1 = new GreenfootImage("Right1.png");
        image2 = new GreenfootImage("Right2.png");
        image3 = new GreenfootImage("Right3.png");
        image4 = new GreenfootImage("Left1.png");
        image5 = new GreenfootImage("Left2.png");
        image6 = new GreenfootImage("Left3.png");
        image7 = new GreenfootImage("Back1.png");
        image8 = new GreenfootImage("Back2.png");
        image9 = new GreenfootImage("Back3.png");
        image10 = new GreenfootImage("Front1.png");
        image11 = new GreenfootImage("Front2.png");
        image12 = new GreenfootImage("Front3.png");
        setImage(image7);

    }

    /**
     * Act - do whatever the TobyH wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        checkKeyPressed();
        nextLevel();
        fireBall();
    }

    /**
     * fireBall() - allows Toby to shoot fireballs
     */
    public void fireBall() {
      //Gives Toby power to shoot fireballs
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.playSound("Fire.wav");
            numShot++;
            if(numShot == 1)
            {
                gun = new Gun();
                getWorld().addObject(gun,this.getX(), this.getY());
                gun.setRotation(getRotation());
                gun.setRotation(getRotation() - 90);
                gun.move(2);
            }
        }
        //Else statement to reset the bullet value
        else {
            numShot = 0;
        }
        //Removes the Power when obtained
        Actor power = getOneObjectAtOffset(0, 0, Power.class);
        if (power != null) {
            World myWorld = getWorld();
            getWorld().showText("You have obtained the power to shoot Fireballs! Press Space to use it", 800,40);
            Greenfoot.playSound("Heart.wav");
            myWorld.removeObject(power);
        }
        
    }
    
    /**
     * nextLevel() - to bring TobyH to next level.
     */
    public void nextLevel() {
        if (isTouching(KeyPass.class)){
            Greenfoot.playSound("Treats.wav");
            removeTouching(KeyPass.class);
            keyCount++;
            if (keyCount == 3) {
                Greenfoot.setWorld(new Level2());
                keyCount = 0;

            }
        }

        if (isTouching(KeyPass2.class)) {
            Greenfoot.playSound("Treats.wav");
            removeTouching(KeyPass2.class);
            keyCount++;
            if (keyCount == 3) {
                Greenfoot.setWorld(new Level3());
                keyCount = 0;

            }

        }

        if (isTouching(Door.class) && getWorld() instanceof Level3) {
            Greenfoot.setWorld(new Level2());

        } 
    }

    /**
     * checkKeyPressed - to move or control TobyH whenever a key is pressed.
     */
    public void checkKeyPressed() {
        // Helps TobyH to move forward
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 3);
            // Animates TobyH when going up
            if (slow == 8) {
                if (getImage() == image7) {
                    setImage(image8);
                }
                else if (getImage() == image8) {
                    setImage(image9);

                }
                else{  
                    setImage(image7);
                }
                slow = 0;
            } 
            else {
                slow++;
            }  
        }  

        // Helps TobyH to move downwards
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 3);
            // Animates TobyH when going down
            if (slow == 8) {
                if (getImage() == image10) {
                    setImage(image11);
                }
                else if (getImage() == image11) {
                    setImage(image12);
                }
                else{
                    setImage(image10);
                }
                slow = 0;
            } 
            else {
                slow++;
            }  

        }

        // Helps TobyH to move to the right side.
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 3, getY());
            // Animates TobyH when going to the right
            if (slow == 8) {
                if (getImage() == image1) {
                    setImage(image2);
                }
                else if (getImage() == image2) {
                    setImage(image3);
                }
                else {
                    setImage(image1);
                }

                slow = 0;
            }
            else {
                slow++;
            }  

        }

        // Helps TobyH to move to the left side
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 3, getY());
            // Animates TobyH when going to the left
            if ( slow == 8) {
                if (getImage() == image4) {
                    setImage(image5);

                }
                else if (getImage() == image5) {
                    setImage(image6);

                }
                else {
                    setImage(image4);

                }
                slow = 0;
            }
            else {
                slow++;

            }  

        }
    }
}

