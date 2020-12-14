import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bonus Level - Toby acquires fire ability
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class Level4 extends MyWorld
{
    /**
     * Constructor for objects of class Level4.
     * 
     */
    public Level4()
    {
        prepare();
        GreenfootImage gg = new GreenfootImage("Bonus Sandbox Level: Use special powers & defeat all enemies to clean the house!", 30, Color.PINK, new Color(0, 0, 0, 0)); 
        gg.setColor(Color.YELLOW);
        getBackground().drawImage(gg, (getWidth()-gg.getWidth())/1, (getHeight()-gg.getHeight())/1);

    }
    
    /**
     * Constructor for objects of class Level4.
     */
    public void act()
    {
        if (getObjects(Spider.class).isEmpty())
        {
           Greenfoot.playSound("House.wav");
           Greenfoot.setWorld(new WinScreen());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
       // Texts written above
        addObject(new Counter(),244, 40);
        addObject(new CounterT(),1345,40);
       // Silver Keys
       for (int i = 0; i < 3; i++) {
          addObject(new KeyPass2(), 1380, 100); 
       }
       // Gold Keys
       for (int i = 0; i < 3; i++) {
          addObject(new KeyPass(), 200, 100); 
       }
       //Spiders
       for (int i = 0; i < 19; i++) {
          addObject(new Spider(), Greenfoot.getRandomNumber(1600) + 40, Greenfoot.getRandomNumber(300) + 50);
       }
       
       //TobyH
       addObject(new TobyH(), 770, 580);

       // Fireball
       addObject(new Power(),765,450);

       // Return to Menu
       addObject(new PlayAgain(),196,556);
    }
}


