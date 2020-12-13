        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        import java.util.*;
     /**
      * Write a description of class MyWorld here.
      * 
      * @author (your name) 
      * @version (a version number or a date)
      */
        public class MyWorld extends World {
            protected static int score = 500;               // initial points
            protected static int lifeCount = 3;             // initial 3 lives   
            protected static boolean collectedKeys = false;
            public static int score1 = score;
            public static int lifeCount1 = lifeCount;
            //protected static GreenfootSound myMusic = new GreenfootSound("Theme.mp3");
            /**
             * Constructor for objects of class MyWorld.
             * 
             */
            public MyWorld() {
                super(1600, 650, 1); 
                 
            }
                      
            // GETTERS
            public void setCollectedKeys(boolean collectedKeys) {
                this.collectedKeys = collectedKeys;
            }
            
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
        
            // GAME OVER
            /**
             * stopGame() - To stop the game when there is no points OR there is no more lives left.
             */
            public void stopGame() {
                if (lifeCount <= 0 || score <= 0){
                    Greenfoot.setWorld(new GameOver());
                    score = 500;
                    lifeCount = 3;

                }
            }  
            
            // MUSIC
            public void act()
            {
                //myMusic.play();
                
            }
    }
    
    