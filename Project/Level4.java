import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        GreenfootImage gg = new GreenfootImage("Bonus Sandbox Level: Use special powers & defeat all enemies to clean the house!", 30, Color.PINK, new Color(0, 0, 0, 0)); gg.setColor(Color.YELLOW);
        getBackground().drawImage(gg, (getWidth()-gg.getWidth())/1, (getHeight()-gg.getHeight())/1);

    }
    /**
     * Constructor for objects of class Level4.
     * 
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
        /*
        Heart heart = new Heart();
        addObject(heart,402,292);
        Heart heart2 = new Heart();
        addObject(heart2,514,293);
        Toby toby = new Toby();
        addObject(toby,1323,441);
        DogCatcher dogCatcher = new DogCatcher();
        addObject(dogCatcher,1354,291);
        Placeholder placeholder = new Placeholder();
        addObject(placeholder,1199,437);
        Placeholder placeholder2 = new Placeholder();
        addObject(placeholder2,1266,608);
        Placeholder placeholder3 = new Placeholder();
        addObject(placeholder3,946,473);
        Placeholder placeholder4 = new Placeholder();
        addObject(placeholder4,972,362);
        Placeholder placeholder5 = new Placeholder();
        addObject(placeholder5,954,609);
        Placeholder placeholder6 = new Placeholder();
        addObject(placeholder6,1121,493);
        Placeholder placeholder7 = new Placeholder();
        addObject(placeholder7,744,469);
        Placeholder placeholder8 = new Placeholder();
        addObject(placeholder8,465,430);
        Placeholder placeholder9 = new Placeholder();
        addObject(placeholder9,500,591);
        dogCatcher.setLocation(304,609);
        toby.setLocation(1364,149);
        Fire fire = new Fire();
        addObject(fire,1267,331);
        dogCatcher.setLocation(777,295);
        KeyPass keyPass = new KeyPass();
        addObject(keyPass,185,617);
        Electric electric = new Electric();
        addObject(electric,1404,80);
        Electric electric2 = new Electric();
        addObject(electric2,432,86);
        removeObject(electric2);
        electric.setLocation(1369,56);
        Coin coin5 = new Coin();
        addObject(coin5,1367,314);
        fire.setLocation(964,422);
        Coin coin6 = new Coin();
        addObject(coin6,1224,321);
        KeyPass2 keyPass2 = new KeyPass2();
        addObject(keyPass2,1249,264);
        KeyPass2 keyPass22 = new KeyPass2();
        addObject(keyPass22,1492,261);
        KeyPass2 keyPass23 = new KeyPass2();
        addObject(keyPass23,1245,189);
        KeyPass2 keyPass24 = new KeyPass2();
        addObject(keyPass24,1487,188);
        KeyPass2 keyPass25 = new KeyPass2();
        addObject(keyPass25,1245,222);
        KeyPass2 keyPass26 = new KeyPass2();
        addObject(keyPass26,1486,218);
        keyPass2.setLocation(1242,259);
        toby.setLocation(1374,176);
        KeyPass2 keyPass27 = new KeyPass2();
        addObject(keyPass27,1272,152);
        KeyPass2 keyPass28 = new KeyPass2();
        addObject(keyPass28,1455,148);
        Hole2 hole2 = new Hole2();
        addObject(hole2,380,527);
        Hole1 hole1 = new Hole1();
        addObject(hole1,421,524);
        removeObject(hole1);
        Hole2 hole22 = new Hole2();
        addObject(hole22,421,527);
        Hole2 hole23 = new Hole2();
        addObject(hole23,462,526);
        Hole2 hole24 = new Hole2();
        addObject(hole24,506,525);
        Hole2 hole25 = new Hole2();
        addObject(hole25,548,525);
        removeObject(keyPass27);
        removeObject(keyPass23);
        removeObject(keyPass25);
        removeObject(keyPass2);
        removeObject(keyPass22);
        removeObject(keyPass26);
        removeObject(keyPass24);
        removeObject(keyPass28);
        Hole2 hole26 = new Hole2();
        addObject(hole26,1248,265);
        Hole2 hole27 = new Hole2();
        addObject(hole27,1492,267);
        addObject(hole1,1245,234);
        Hole1 hole12 = new Hole1();
        addObject(hole12,1487,231);
        Hole2 hole28 = new Hole2();
        addObject(hole28,1243,201);
        Hole2 hole29 = new Hole2();
        addObject(hole29,1489,198);
        Hole1 hole13 = new Hole1();
        addObject(hole13,1476,166);
        Hole1 hole14 = new Hole1();
        addObject(hole14,1253,172);
        Hole2 hole210 = new Hole2();
        addObject(hole210,1276,148);
        Hole2 hole211 = new Hole2();
        addObject(hole211,1454,143);
        electric.getWorld();
        electric.act();
        removeObject(electric);
        addObject(electric,1364,74);
        removeObject(fire);
        addObject(fire,999,450);
        placeholder3.setLocation(923,510);
        fire.setLocation(962,457);
        placeholder3.setLocation(917,515);
        fire.setLocation(971,465);
        toby.setLocation(1362,192);
        Coin coin7 = new Coin();
        addObject(coin7,1301,192);
        Coin coin8 = new Coin();
        addObject(coin8,1433,194);
        KeyPass keyPass3 = new KeyPass();
        addObject(keyPass3,632,285);
        electric.setLocation(1366,128);
        KeyPass2 keyPass29 = new KeyPass2();
        addObject(keyPass29,1366,128); */
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


