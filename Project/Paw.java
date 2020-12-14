import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Paw Class - clickable paw that brings player to another world
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
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
          Greenfoot.playSound("Woof.wav");
          Greenfoot.setWorld(new Level1());
        }
        
        if (Greenfoot.mouseClicked(this) && getX() == 520) {
           Greenfoot.playSound("Woof.wav");
           Greenfoot.setWorld(new Instruction());
        }
         
        if (Greenfoot.mouseClicked(this) && getX() == 860) {
           Greenfoot.playSound("Woof.wav");
           Greenfoot.setWorld(new Credit());
        }
         
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("Woof.wav");
            if (getWorld() instanceof Instruction) {
                Greenfoot.setWorld(new StartScreen());
            }
        }
         
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("Woof.wav");
            if (getWorld() instanceof GameOver) {
                Greenfoot.setWorld(new StartScreen());
            }
        }
         
        if (Greenfoot.mouseClicked(this) && getX() == 860) {
           Greenfoot.playSound("Woof.wav");
            if (getWorld() instanceof Credit) {
                Greenfoot.setWorld(new StartScreen());
           }
        }

        if (Greenfoot.mouseClicked(this) && getX() == 700) {
            Greenfoot.playSound("Woof.wav");
            if (getWorld() instanceof Credit) {
                Greenfoot.setWorld(new Sources());
            }
        }
        
        if (Greenfoot.mouseClicked(this) && getX() == 1310) {
          Greenfoot.playSound("Woof.wav");
          Greenfoot.setWorld(new StartScreen());
        }

        if (Greenfoot.mouseClicked(this) && getX() == 580) { 
            Greenfoot.playSound("Woof.wav");
            if (getWorld() instanceof WinScreen) {
                Greenfoot.setWorld(new StartScreen());
            }
        }
        
        if (Greenfoot.mouseClicked(this) && getX() == 75) {
           Greenfoot.playSound("Woof.wav"); 
           Greenfoot.setWorld(new StartScreen());
        }
    }
}