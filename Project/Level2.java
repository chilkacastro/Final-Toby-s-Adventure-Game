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
        setPaintOrder(Train.class, Cactus.class, Cactus2.class);
        prepare();
        showScore();
        showLife();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        Cactus cactus = new Cactus();
        addObject(cactus,988,482);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,358,373);
        cactus2.setLocation(358,349);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,114,482);
        Cactus cactus4 = new Cactus();
        addObject(cactus4,1373,242);
        Cactus cactus5 = new Cactus();
        addObject(cactus5,643,122);
        Cactus cactus6 = new Cactus();
        addObject(cactus6,160,245);
        Cactus cactus7 = new Cactus();
        addObject(cactus7,115,121);
        Cactus cactus8 = new Cactus();
        addObject(cactus8,769,353);
        Cactus cactus9 = new Cactus();
        addObject(cactus9,1265,351);
        Cactus cactus10 = new Cactus();
        addObject(cactus10,555,478);
        Cactus cactus11 = new Cactus();
        addObject(cactus11,1456,486);
        Train2 train2 = new Train2();
        addObject(train2,1309,430);
        cactus11.setLocation(1457,483);
        cactus11.setLocation(1434,495);
        removeObject(cactus11);
        removeObject(cactus9);
        cactus4.setLocation(1367,220);
        removeObject(cactus4);
        cactus.setLocation(984,480);
        removeObject(cactus);
        cactus10.setLocation(557,481);
        removeObject(cactus10);
        cactus8.setLocation(769,359);
        removeObject(cactus8);
        cactus5.setLocation(652,109);
        removeObject(cactus5);
        cactus7.setLocation(115,129);
        removeObject(cactus7);
        cactus6.setLocation(154,253);
        removeObject(cactus6);
        cactus2.setLocation(360,358);
        removeObject(cactus2);
        cactus3.setLocation(106,474);
        removeObject(cactus3);
        Train train = new Train();
        addObject(train,1332,200);
        train.setLocation(1332,200);
        Train3 train3 = new Train3();
        addObject(train3,829,562);
        Train3 train32 = new Train3();
        addObject(train32,191,211);
        Train3 train33 = new Train3();
        addObject(train33,224,434);
        Train3 train34 = new Train3();
        addObject(train34,1292,88);
        Train3 train35 = new Train3();
        addObject(train35,268,91);
        Train3 train36 = new Train3();
        addObject(train36,1323,320);
        Train2 train22 = new Train2();
        addObject(train22,377,323);
        Train train4 = new Train();
        addObject(train4,1575,566);
        Cactus cactus12 = new Cactus();
        addObject(cactus12,860,488);
        Cactus cactus13 = new Cactus();
        addObject(cactus13,266,481);
        Cactus cactus14 = new Cactus();
        addObject(cactus14,1381,488);
        train22.setLocation(585,356);
        Cactus cactus15 = new Cactus();
        addObject(cactus15,585,356);
        train32.setLocation(102,238);
        Cactus cactus16 = new Cactus();
        addObject(cactus16,102,238);
        Cactus cactus17 = new Cactus();
        addObject(cactus17,1432,237);
        Cactus cactus18 = new Cactus();
        addObject(cactus18,775,230);
        train35.setLocation(336,111);
        Cactus cactus19 = new Cactus();
        addObject(cactus19,336,111);
        Cactus cactus20 = new Cactus();
        addObject(cactus20,837,114);
        train34.setLocation(1483,111);
        Cactus cactus21 = new Cactus();
        addObject(cactus21,1483,111);
        Cactus cactus22 = new Cactus();
        addObject(cactus22,1459,6);
        cactus22.setLocation(1446,25);
        removeObject(cactus22);
        cactus12.setLocation(1153,361);
        cactus14.setLocation(1473,494);
        Toby toby = new Toby();
        addObject(toby,792,623);
        removeObject(toby);
        train34.setLocation(1199,94);
        removeObject(train34);
        removeObject(train35);
        removeObject(train);
        train32.setLocation(461,257);
        removeObject(train32);
        train36.setLocation(982,323);
        removeObject(train36);
        removeObject(train22);
        removeObject(train2);
        removeObject(train33);
        removeObject(train3);
        removeObject(train4);
        Train train5 = new Train();
        addObject(train5,1460,556);
        Train2 train23 = new Train2();
        addObject(train23,1365,449);
        Train3 train37 = new Train3();
        addObject(train37,1437,310);
        cactus17.setLocation(1417,207);
        Train3 train38 = new Train3();
        addObject(train38,1417,207);
        Toby toby2 = new Toby();
        addObject(toby2,759,628);
        toby2.setLocation(754,622);
        removeObject(toby2);
        KeyPass2 keyPass2 = new KeyPass2();
        addObject(keyPass2,813,26);
        Coin coin = new Coin();
        addObject(coin,365,258);
        Coin coin2 = new Coin();
        addObject(coin2,985,383);
        Coin coin3 = new Coin();
        addObject(coin3,437,491);
        Coin coin4 = new Coin();
        addObject(coin4,1177,141);
        Coin coin5 = new Coin();
        addObject(coin5,152,141);
        Coin coin6 = new Coin();
        addObject(coin6,981,504);
        Coin coin7 = new Coin();
        addObject(coin7,59,495);
        Coin coin8 = new Coin();
        addObject(coin8,58,366);
        Coin coin9 = new Coin();
        addObject(coin9,614,149);
        Coin coin10 = new Coin();
        addObject(coin10,1055,146);
        Coin coin11 = new Coin();
        addObject(coin11,374,432);
        coin11.setLocation(367,380);
        Toby toby3 = new Toby();
        addObject(toby3,800,621);
        train37.setLocation(1163,296);
        train5.setLocation(1164,551);
        removeObject(train5);
        train23.setLocation(1196,431);
        removeObject(train23);
        train37.setLocation(1252,323);
        removeObject(train37);
        train38.setLocation(1281,190);
        removeObject(train38);
    }

}
