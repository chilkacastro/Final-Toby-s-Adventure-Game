import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends MyWorld {
        /**
         * Constructor for objects of class Level1.
         * 
         */
        public Level1() {
            setPaintOrder(TrafficCone.class, Car2.class, Car.class, Bench.class, Toby.class);
            prepare();
            showLife();
            showScore();
            stopGame();
            score = 10000;
            lifeCount = 3;
            
        }
        
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        
    }
}