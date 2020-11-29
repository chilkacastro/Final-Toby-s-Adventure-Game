        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        import java.util.*;
    /**
     * Write a description of class MyWorld here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
     public class MyWorld extends World {
        protected static int score = 10000;                 // initial points
        protected static int lifeCount = 3;                 // initial 3 lives
     
        
            /**
             * Constructor for objects of class MyWorld.
             * 
             */
            public MyWorld() {
                super(1600, 650, 1); 
            }
                      
            // GETTERS
            /**
             * getScore() - To allow the actor classes to access the score.
             */
          
             public int getScore() {
                return score;
            } 
           
            /**
             * getLifeCount() - To allow the actor classes to access the lifeCount.
             */
            public int getLifeCount() {
                return lifeCount;
            }
            
            // SCORE
            /**
             * addScore() - To decrease or increase the score of the player.
             */
            public void addScore(int points) {
                score += points;
                showScore();
                stopGame();
            }
            
 
            /**
             * showScore() - To print the score.
             */
             public void showScore() {
                 showText("Score: "+ score, 80, 25);
            } 
        
             // LIFE 
            /**
             * lifeCount() - To decrease or increase the life count of Toby.
             */
            public void lifeCount(int lives) {
                lifeCount += lives;
                showLife();
                stopGame();
            }
        
        
            /**
             * showLife() - To show how many lives does Toby has and if player lost.
             */
            public void showLife() {
                showText("Lives:" + lifeCount, 200, 25);
                
            }
        
            public void stopGame() {
                if (lifeCount <= 0 || score <= 0){
                    showText("YOU LOST!", 800, 250); 
                    showText("Score:"+ score, 800, 325); 
                    Greenfoot.stop();
                        
                }
            }  
             
            /*
            public void removeBloodyToby() {
                int tobyCount = getObjects(Toby.class).size();
                if (tobyCount > 0) {
                    List <Blood> bloodytobies = new ArrayList<>();
                    bloodytobies.removeAll(getObjects(Blood.class));
                }            
    
            } */
}
    
    