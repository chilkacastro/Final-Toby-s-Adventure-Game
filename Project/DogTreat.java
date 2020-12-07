import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DogTreat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DogTreat extends Actor
{
    private int lineCounter = 0;
    /**
     * Act - do whatever the DogTreat wants to do. This method is called 
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Toby.class)) {
            lineCounter++;
           ((MyWorld)getWorld()).addScore(100); 
            Greenfoot.playSound("Treats.wav");
            //getWorld().showText("You GAINED Points!",450, 350);
            if (lineCounter > 0) {
                Level3 myLevel3 = (Level3)getWorld();
                myLevel3.addObject(new PlusPoint(), 840, 400);
            }
            getWorld().removeObject(this);
        }

    }    
}
