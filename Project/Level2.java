import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Second Level of the game which is desert-themed
 * 
 * @author Chilka, Madalina, Nicolas, Jose 
 * @version Gold Master (December 14, 2020)
 */
public class Level2 extends MyWorld
{
    
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2() {
        setPaintOrder(Stop.class , KeyPass.class, LeftBorder.class, RightBorder. class, DogCatcher.class, Coin.class, BallTreat.class, Cactus.class, Cactus2.class, Train.class, Train2.class);
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
        // Trains
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

        // Cactuses
        for(int i = 0; i < 3; i++) {
            addObject(new Cactus(),(i * 450) + 100, 110); 

        }
        for(int i = 1; i <= 3; i++) {
            addObject(new Cactus2(), i * 500,360); 

        }
        
        // Dog Foods
        for(int i = 0; i <= 7; i++) {
            addObject(new BallTreat(), Greenfoot.getRandomNumber(1560) + 40, Greenfoot.getRandomNumber(580)+ 40); 
        }
        for(int i = 0; i < 5; i++) {
            addObject(new DogTreats2(), Greenfoot.getRandomNumber(1500)+ 60, Greenfoot.getRandomNumber(510)+ 40); 
        }   
        
        // Coins
        for(int i = 0; i <= 8; i++) {
            addObject(new Coin(), Greenfoot.getRandomNumber(1500)+ 60, Greenfoot.getRandomNumber(510)+ 40); 
        }
       
        // Level 2 Keys
        for (int i = 1; i <= 3; i++) {
            addObject(new KeyPass2(), (i * 400) + 40, 20);
            addObject(new Door(),400,625);
        }
        
        // Toby
        addObject(new Toby(), 792, 630); 
        
        // Borders(Left and Right)
        addObject(new LeftBorder(), 200,323);
        addObject(new RightBorder(),1400,320);
       
        // Dog Catchers
        addObject(new DogCatcher() ,1200, 130);
        addObject(new DogCatcher() ,500, 470);
        
        // Quit Word
        addObject(new Stop(),99,614);

        //Trap Door
        addObject(new Door(), 400,625);

    } 
 }
