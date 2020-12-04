import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paw here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paw extends Actor
{
    /**
     * Act - do whatever the Paw wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mouseClicked();
    }
    
    /**
     * mouseClicked() - allows the user to changed worlds by clicking the paw
     */
    public void mouseClicked() {
        if (Greenfoot.mouseClicked(this) && getX() == 320) {
          Greenfoot.setWorld(new Level1());
        }
        
        if (Greenfoot.mouseClicked(this) && getX() == 520) {
           Greenfoot.setWorld(new Instruction());
        }
         
        if (Greenfoot.mouseClicked(this) && getX() == 860) {
           Greenfoot.setWorld(new Credit());
        }
         
        if (Greenfoot.mouseClicked(this)) {
            if (getWorld() instanceof Instruction) {
                Greenfoot.setWorld(new StartScreen());
            }
             
        }
         
        if (Greenfoot.mouseClicked(this)) {
            if (getWorld() instanceof GameOver) {
                Greenfoot.setWorld(new StartScreen());
            }
        }
         
        if (Greenfoot.mouseClicked(this)) {
            if (getWorld() instanceof Credit) {
                Greenfoot.setWorld(new StartScreen());
            }

        }
    }
}