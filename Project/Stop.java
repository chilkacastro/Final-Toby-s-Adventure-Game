import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stop extends Actor
{
    /**
     * Act - do whatever the Stop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        if (Greenfoot.mouseClicked(this)) {
            
            for (int i = 1; i <= 3; i++) {
               KeyPass keypass = new KeyPass();
               getWorld().addObject(keypass, (i * 400) + 40, 20);  
               Greenfoot.setWorld(new StartScreen());
               

            }
        
        }
        
        
           
       } 
    }

