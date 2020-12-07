import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DogTreats2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DogTreats2 extends Actor
{
    private int lineCounter = 0;
    /**
     * Act - do whatever the DogTreats2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Toby.class)) {
            lineCounter++;
            ((MyWorld)getWorld()).addScore(100); 
            Greenfoot.playSound("Treats.wav");
            if (lineCounter > 0) {
                Level2 myLevel2 = (Level2)getWorld();
                myLevel2.addObject(new PlusPoint(), 700, 400);
            }
            getWorld().removeObject(this);
        }

        
    }    
}
