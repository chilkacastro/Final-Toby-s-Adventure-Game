import greenfoot.*;  

/**
 * Third Level of the game which is suburban style
 * 
 * @author Chilka, Madalina, Nicolas, Jose 
 * @version Gold Master (December 14, 2020)
 */
public class Level3 extends MyWorld {
    
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {
        setPaintOrder(Bee.class, Heart.class, Truck1.class, Truck2.class);
        prepare();
        showScore();
        showLife();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
       // 1st road - top
       for(int i = 1; i <= 5; i++) {
            addObject(new Car3(), i * 380, 110); 
       }
       for(int i = 1; i <= 4; i++) {
            addObject(new Car4(180), i * 350, 150); 
       }

        // 2nd road - top
       for(int i = 1; i <= 3; i++) {
            addObject(new Truck2(), i * 350, 222); 
       }
       for(int i = 0; i <= 3; i++) {
            addObject(new Truck1(), i * 550, 252); 
       }
        
         // 3rd road - middle
       for(int i = 0; i < 5; i++) {
            addObject(new Car(-180), i * 380, 340); 
       }
       for(int i = 1; i < 5; i++) {
            addObject(new Car2(180), (i * 240), 365); 
       }

        // 4th road - bottom
       for(int i = 1; i <= 3; i++) {
            addObject(new Truck2(), i * 350, 475); 
       }
       for(int i = 0; i <= 3; i++) {
            addObject(new Truck1(), i * 550, 448); 
       }
       
       // 5th road - bottom
       for(int i = 0; i < 4; i++) {
            addObject(new Car(180), i * 500, 550); 
       }
       for(int i = 1; i <= 4; i++) {
            addObject(new Car2(180), i * 350, 585); 
       }
   
       // Carrots
       for(int i = 0; i <= 7; i++) {
            addObject(new Carrot(), Greenfoot.getRandomNumber(1500)+ 60, Greenfoot.getRandomNumber(510)+ 40); 
       }

       // Apples
       for(int i = 0; i <= 5; i++) {
            addObject(new Apple(), Greenfoot.getRandomNumber(1430)+ 90, Greenfoot.getRandomNumber(550)+ 80); 
       }

       // Dog Treats
       for (int i = 0; i < 4; i++) {
        addObject(new DogTreat(),Greenfoot.getRandomNumber(1300) + 100, Greenfoot.getRandomNumber(600) + 40);
       }
       
       // Hearts
       addObject(new Heart(),Greenfoot.getRandomNumber(1300) + 50, 245); 
       addObject(new Heart(),Greenfoot.getRandomNumber(1400) + 100, 470);
     
       
       // Deep Water
       addObject(new Water(),1068,406);
       addObject(new Water(),302,512);
       addObject(new Water(),1431,288);
       addObject(new Water(),344,290);
       addObject(new Water(),141,179);
       addObject(new Water(),902,179);
       addObject(new Water(),1419,182);
       addObject(new Water(),72,407);
       addObject(new Water(),598,402);
       addObject(new Water(),1376,516);
       addObject(new Water(),701,289);
       addObject(new Water(),878,515);
       addObject(new Water(),456,181);
       addObject(new Water(),1295,404);
       addObject(new Water(),1028,294);
       addObject(new Water(),1170,182);

       // Toby
       addObject(new Toby(),820, 630);

       // House
       addObject(new House(), 850, 30);

       // Owner
       addObject(new Owner(),854,49);

       // Bees
       addObject(new Bee(),1000,150);
       addObject(new Bee(90),300, 350);
       addObject(new Bee(),1236,610);

       // Green Dog Catcher
       addObject(new DogCatcher2(),790,283);

       //Door
       addObject(new Door(), 290, 630);

       // Quit 
       addObject(new Stop(), 84,626);
     
    }
}
