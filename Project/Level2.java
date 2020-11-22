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
        setPaintOrder(Cactus.class, Cactus2.class,Train.class);
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
    }

}
