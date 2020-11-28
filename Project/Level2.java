import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends MyWorld
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2() {
        setPaintOrder(DogCatcher.class, Cactus.class, Cactus2.class, Train.class, Train2.class);
        prepare();
        showLife();
        showScore();
        stopGame();
        
    }  
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        for(int i = 0; i < 2; i++) {
            addObject(new Train(), i * 1200, 205); 

        }
        
        for(int i = 1; i <= 2; i++) {
            addObject(new Train(), i * 980, 438); 

        }
        
        for(int i = 0; i <= 1; i++) {
            addObject(new Train2(), i * 650, 90); 

        }
        
        for(int i = 0; i <= 1; i++) {
            addObject(new Train2(), i * 850, 320); 

        }
        
        for(int i = 1; i <= 2; i++) {
            addObject(new Train2(), i * 750, 564); 

        }
    }

}
