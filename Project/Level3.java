import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends MyWorld {
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {
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
        Water water = new Water();
        addObject(water,1068,406);
        Water water2 = new Water();
        addObject(water2,302,512);
        Water water3 = new Water();
        addObject(water3,1431,288);
        Water water4 = new Water();
        addObject(water4,344,290);
        Water water5 = new Water();
        addObject(water5,141,179);
        Water water6 = new Water();
        addObject(water6,902,179);
        Water water7 = new Water();
        addObject(water7,1419,182);
        Water water8 = new Water();
        addObject(water8,72,407);
        Water water9 = new Water();
        addObject(water9,598,402);
        Water water10 = new Water();
        addObject(water10,1376,516);
        Water water11 = new Water();
        addObject(water11,701,289);
        Water water12 = new Water();
        addObject(water12,878,515);
        Water water13 = new Water();
        addObject(water13,456,181);
        Water water14 = new Water();
        addObject(water14,1295,404);
        Water water15 = new Water();
        addObject(water15,1028,294);
        Water water16 = new Water();
        addObject(water16,1170,182);
        Toby toby = new Toby();
        addObject(toby,820,618);
        toby.setLocation(814,631);
        Car2 car2 = new Car2();
        addObject(car2,342,554);
        Car2 car22 = new Car2();
        addObject(car22,510,554);
        Car2 car23 = new Car2();
        addObject(car23,657,554);
        Car2 car24 = new Car2();
        addObject(car24,805,551);
        Car2 car25 = new Car2();
        addObject(car25,923,551);
        Car2 car26 = new Car2();
        addObject(car26,1105,553);
        Car2 car27 = new Car2();
        addObject(car27,1237,552);
        Car2 car28 = new Car2();
        addObject(car28,1398,556);
        Car2 car29 = new Car2();
        addObject(car29,1528,551);
        Car2 car210 = new Car2();
        addObject(car210,198,552);
        toby.setLocation(805,629);
        removeObject(toby);
        addObject(toby,844,625);
        toby.setLocation(841,621);
        toby.setLocation(828,614);
        House house = new House();
        addObject(house,797,27);
        house.setLocation(851,29);
        house.setLocation(815,63);
        house.setLocation(790,42);
        House house2 = new House();
        addObject(house2,983,42);
        house.setLocation(840,39);
        house.setLocation(811,45);
        removeObject(house);
        house2.setLocation(800,40);
        house2.setLocation(769,37);
        removeObject(car25);
        car26.setLocation(990,563);
        car26.setLocation(1047,553);
        removeObject(car23);
    }
}
