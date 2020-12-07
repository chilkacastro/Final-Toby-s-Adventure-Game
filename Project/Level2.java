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
        setPaintOrder(Stop.class , KeyPass.class, LeftBorder.class, RightBorder. class, DogCatcher.class, Coin.class, Cactus.class, Cactus2.class, Train.class, Train2.class);
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

        for(int i = 0; i < 3; i++) {
            addObject(new Cactus(),(i * 450) + 100, 110); 

        }
        for(int i = 1; i <= 3; i++) {
            addObject(new Cactus2(), i * 500,360); 

        }
        addObject(new DogCatcher() ,1200, 130);
        addObject(new DogCatcher() ,500, 470);

        for(int i = 0; i <= 8; i++) {
            addObject(new Coin(), Greenfoot.getRandomNumber(1500)+ 60, Greenfoot.getRandomNumber(510)+ 40); 

        }
        addObject(new Toby(), 792, 630); 

        // if (!collectedKeys2) {
        for (int i = 1; i <= 3; i++) {
            KeyPass2 keypass2 = new KeyPass2();
            addObject(keypass2, (i * 400) + 40, 20);
            //collectedKeys2 = true;
            //addObject(new Door(),400,625);
        }
        // } 
        //int keyCount2 = getObjects(KeyPass2.class).size();
        /* if ((collectedKeys2) && keyCount2 == 0) {
        
        } */
        addObject(new LeftBorder(), 200,323);
        RightBorder rightBorder = new RightBorder();
        addObject(rightBorder,1400,320);
        DogTreats2 dogTreats2 = new DogTreats2();
        addObject(dogTreats2,1072,146);
        DogTreats2 dogTreats22 = new DogTreats2();
        addObject(dogTreats22,220,325);
        DogTreats2 dogTreats23 = new DogTreats2();
        addObject(dogTreats23,381,495);

        Stop stop = new Stop();
        addObject(stop,99,614);
        
        addObject(new Door(), 400,625);

        
    }
  }
