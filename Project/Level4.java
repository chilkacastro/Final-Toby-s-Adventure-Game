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
        Counter counter = new Counter();
        addObject(counter,67,43);
        counter.setLocation(244,33);
        KeyPass keyPass = new KeyPass();
        addObject(keyPass,233,73);
        keyPass.setLocation(232,73);
        KeyPass keyPass2 = new KeyPass();
        addObject(keyPass2,232,73);
        keyPass.setLocation(233,72);
        KeyPass keyPass3 = new KeyPass();
        addObject(keyPass3,233,72);
        CounterT counterT = new CounterT();
        addObject(counterT,1278,31);
        counterT.setLocation(1348,37);
        KeyPass2 keyPass22 = new KeyPass2();
        addObject(keyPass22,1327,75);
        keyPass22.setLocation(1328,72);
        KeyPass2 keyPass23 = new KeyPass2();
        addObject(keyPass23,1328,72);
        keyPass22.setLocation(1327,74);
        KeyPass2 keyPass24 = new KeyPass2();
        addObject(keyPass24,1327,74);
        keyPass22.setLocation(1341,61);
        keyPass22.setLocation(1335,65);
        keyPass22.setLocation(1338,58);
        keyPass22.setLocation(1385,101);
        keyPass22.setLocation(1330,71);
        keyPass24.setLocation(1329,67);
        keyPass22.setLocation(1334,64);
        keyPass22.setLocation(1336,67);
        keyPass22.setLocation(1336,70);
        keyPass22.setLocation(1338,71);
        keyPass22.setLocation(1334,75);
        keyPass22.setLocation(1334,76);
        keyPass22.setLocation(1358,161);
        keyPass22.setLocation(1229,231);
        removeObject(keyPass24);
        removeObject(keyPass23);
        removeObject(keyPass22);
        addObject(keyPass22,1328,92);
        keyPass22.setLocation(1355,92);
        removeObject(keyPass22);
        addObject(keyPass22,1402,80);
        keyPass22.setLocation(1401,77);
        addObject(keyPass23,1401,77);
        keyPass22.setLocation(1401,79);
        addObject(keyPass24,1401,79);
        Spider spider = new Spider();
        addObject(spider,249,166);
        Spider spider2 = new Spider();
        addObject(spider2,498,264);
        Spider spider3 = new Spider();
        addObject(spider3,559,133);
        Spider spider4 = new Spider();
        addObject(spider4,1231,249);
        Spider spider5 = new Spider();
        addObject(spider5,926,218);
        Spider spider6 = new Spider();
        addObject(spider6,1034,146);
        Spider spider7 = new Spider();
        addObject(spider7,1398,195);
        Spider spider8 = new Spider();
        addObject(spider8,1336,360);
        Spider spider9 = new Spider();
        addObject(spider9,716,188);
        Spider spider10 = new Spider();
        addObject(spider10,305,271);
        Spider spider11 = new Spider();
        addObject(spider11,418,111);
        Spider spider12 = new Spider();
        addObject(spider12,1440,295);
        Spider spider13 = new Spider();
        addObject(spider13,1072,321);
        Spider spider14 = new Spider();
        addObject(spider14,1102,245);
        Spider spider15 = new Spider();
        addObject(spider15,807,309);
        Spider spider16 = new Spider();
        addObject(spider16,850,114);
        Spider spider17 = new Spider();
        addObject(spider17,622,339);
        Spider spider18 = new Spider();
        addObject(spider18,410,335);

        TobyH tobyH = new TobyH();
        addObject(tobyH,762,576);
        Power power = new Power();
        addObject(power,769,479);
        power.setLocation(765,421);
        removeObject(power);
        addObject(power,763,449);

        PlayAgain playAgain = new PlayAgain();
        addObject(playAgain,196,556);
    }
}


