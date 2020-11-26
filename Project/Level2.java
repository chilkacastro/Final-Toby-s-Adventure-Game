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
        Cactus cactus = new Cactus();
        addObject(cactus,1470,238);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,211,243);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,684,353);
        Cactus cactus4 = new Cactus();
        addObject(cactus4,198,476);
        Cactus cactus5 = new Cactus();
        addObject(cactus5,1321,468);
        Cactus cactus6 = new Cactus();
        addObject(cactus6,786,127);
        Cactus cactus7 = new Cactus();
        addObject(cactus7,89,119);
        Cactus cactus8 = new Cactus();
        addObject(cactus8,1349,122);
        Cactus cactus9 = new Cactus();
        addObject(cactus9,870,475);
        Cactus cactus10 = new Cactus();
        addObject(cactus10,1112,241);
        Cactus2 cactus22 = new Cactus2();
        addObject(cactus22,454,132);
        Cactus2 cactus23 = new Cactus2();
        addObject(cactus23,521,479);
        Cactus2 cactus24 = new Cactus2();
        addObject(cactus24,1263,361);
        Cactus2 cactus25 = new Cactus2();
        addObject(cactus25,287,367);
        Cactus2 cactus26 = new Cactus2();
        addObject(cactus26,643,247);
        Cactus2 cactus27 = new Cactus2();
        addObject(cactus27,1045,132);
        Cactus2 cactus28 = new Cactus2();
        addObject(cactus28,213,136);
        removeObject(cactus28);
        Train train = new Train();
        addObject(train,1401,78);
        Train train2 = new Train();
        addObject(train2,581,202);
        Train train3 = new Train();
        addObject(train3,1146,318);
        Train train4 = new Train();
        addObject(train4,418,437);
        cactus5.setLocation(1303,437);
        Train train5 = new Train();
        addObject(train5,1303,437);
        Train train6 = new Train();
        addObject(train6,335,560);
        Train train7 = new Train();
        addObject(train7,1278,565);
        Train train8 = new Train();
        addObject(train8,328,89);
        Train train9 = new Train();
        addObject(train9,1396,206);
        train.setLocation(1162,91);
        train7.setLocation(1159,552);
        train7.setLocation(1302,570);
        Train train10 = new Train();
        addObject(train10,80,314);
        train10.setLocation(291,325);
        train10.setLocation(364,325);
        Toby toby = new Toby();
        addObject(toby,826,631);
        train7.setLocation(1356,558);
        train7.setLocation(1403,563);
        train6.setLocation(258,554);
        train6.setLocation(419,563);
        train6.setLocation(815,560);
        train6.setLocation(419,581);
        train6.setLocation(564,562);
        train7.setLocation(1208,555);
        train7.setLocation(1122,552);
        train7.setLocation(1172,549);
        train7.setLocation(1370,571);
        train6.setLocation(357,563);
        train7.setLocation(1620,568);
        train7.setLocation(1502,562);
        train7.setLocation(1383,569);
        train7.setLocation(1409,557);
        train7.setLocation(1370,571);
        removeObject(train7);
        Train train11 = new Train();
        addObject(train11,1179,561);
        train5.setLocation(1303,478);
        train5.setLocation(995,439);
        train5.setLocation(1077,432);
        train5.setLocation(1397,481);
        train5.setLocation(1479,489);
        removeObject(train5);
        cactus5.setLocation(1305,422);
        removeObject(cactus5);
        Cactus2 cactus29 = new Cactus2();
        addObject(cactus29,1347,485);
        removeObject(train4);
        removeObject(train2);
        train9.setLocation(1229,190);
        removeObject(train9);
        train3.setLocation(1226,336);
        Train train12 = new Train();
        addObject(train12,368,436);
        Train train13 = new Train();
        addObject(train13,1251,442);
        Train train14 = new Train();
        addObject(train14,364,207);
        Train train15 = new Train();
        addObject(train15,1234,212);
        train14.setLocation(346,194);
        removeObject(train14);
        train15.setLocation(943,217);
        removeObject(train15);
        Train2 train22 = new Train2();
        addObject(train22,370,213);
        Train2 train23 = new Train2();
        addObject(train23,1217,214);
        train12.setLocation(591,442);
        train12.setLocation(591,442);
        removeObject(train12);
        train13.setLocation(1069,459);
        removeObject(train13);
        Train2 train24 = new Train2();
        addObject(train24,352,443);
        Train2 train25 = new Train2();
        addObject(train25,1229,439);
        train3.setLocation(946,325);
        Coin coin = new Coin();
        addObject(coin,1122,496);
        Coin coin2 = new Coin();
        addObject(coin2,532,370);
        Coin coin3 = new Coin();
        addObject(coin3,1402,320);
        coin3.setLocation(1402,320);
        Coin coin4 = new Coin();
        addObject(coin4,357,147);
        Coin coin5 = new Coin();
        addObject(coin5,739,84);
        Coin coin6 = new Coin();
        addObject(coin6,958,149);
        Coin coin7 = new Coin();
        addObject(coin7,150,381);
        Coin coin8 = new Coin();
        addObject(coin8,66,268);
        Coin coin9 = new Coin();
        addObject(coin9,1549,485);
        Coin coin10 = new Coin();
        addObject(coin10,1541,133);
        Coin coin11 = new Coin();
        addObject(coin11,148,140);
        Coin coin12 = new Coin();
        addObject(coin12,275,32);
        Coin coin13 = new Coin();
        addObject(coin13,1235,31);
        Coin coin14 = new Coin();
        addObject(coin14,839,270);
        Coin coin15 = new Coin();
        addObject(coin15,880,377);
        coin15.setLocation(880,377);
        KeyPass2 keyPass2 = new KeyPass2();
        addObject(keyPass2,846,31);
        coin2.setLocation(529,381);
        coin15.setLocation(882,383);
        coin14.setLocation(840,265);
        cactus26.setLocation(635,255);
        cactus26.setLocation(658,267);
        cactus26.setLocation(653,243);
        removeObject(cactus26);
        removeObject(cactus10);
        removeObject(cactus2);
        DogCatcher dogCatcher = new DogCatcher();
        addObject(dogCatcher,783,247);
        dogCatcher.setLocation(1149,233);
        dogCatcher.setLocation(1153,251);
        dogCatcher.setLocation(1251,247);
        dogCatcher.setLocation(1262,252);
    }

}
