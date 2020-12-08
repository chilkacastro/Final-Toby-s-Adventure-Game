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
        // Bottom of 4th road
        for(int i = 1; i <= 2; i++) {
            addObject(new Truck2(), i * 350, 475); 

        }

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
        Car car = new Car();
        addObject(car,1382,368);
        Car car3 = new Car();
        addObject(car3,768,372);
        Car car4 = new Car();
        addObject(car4,313,367);
        Car car5 = new Car();
        addObject(car5,117,372);
        Car car6 = new Car();
        addObject(car6,1164,369);
        Car car7 = new Car();
        addObject(car7,543,371);
        Car car8 = new Car();
        addObject(car8,965,367);
        Truck1 truck1 = new Truck1();
        addObject(truck1,1528,249);
        Truck1 truck12 = new Truck1();
        addObject(truck12,1206,251);
        Truck1 truck13 = new Truck1();
        addObject(truck13,675,250);
        Truck1 truck14 = new Truck1();
        addObject(truck14,274,254);
        Truck1 truck15 = new Truck1();
        addObject(truck15,38,253);
        Truck1 truck16 = new Truck1();
        addObject(truck16,1355,221);
        Truck1 truck17 = new Truck1();
        addObject(truck17,993,221);
        Truck1 truck18 = new Truck1();
        addObject(truck18,560,219);
        Truck1 truck19 = new Truck1();
        addObject(truck19,181,220);
        Truck1 truck110 = new Truck1();
        addObject(truck110,1507,332);
        Truck2 truck2 = new Truck2();
        addObject(truck2,1280,333);
        Truck2 truck22 = new Truck2();
        addObject(truck22,1538,146);
        Truck2 truck23 = new Truck2();
        addObject(truck23,1350,147);
        Truck2 truck24 = new Truck2();
        addObject(truck24,1193,144);
        Truck2 truck25 = new Truck2();
        addObject(truck25,961,144);
        Truck2 truck26 = new Truck2();
        addObject(truck26,790,146);
        Truck2 truck27 = new Truck2();
        addObject(truck27,616,148);
        Truck2 truck28 = new Truck2();
        addObject(truck28,418,148);
        Truck2 truck29 = new Truck2();
        addObject(truck29,271,146);
        Truck2 truck210 = new Truck2();
        addObject(truck210,110,144);
        Truck2 truck211 = new Truck2();
        addObject(truck211,1505,482);
        Truck2 truck212 = new Truck2();
        addObject(truck212,1357,481);
        Truck2 truck213 = new Truck2();
        addObject(truck213,1189,481);
        Truck2 truck214 = new Truck2();
        addObject(truck214,1039,481);
        Truck2 truck215 = new Truck2();
        addObject(truck215,885,482);
        Truck2 truck216 = new Truck2();
        addObject(truck216,756,483);
        Truck2 truck217 = new Truck2();
        addObject(truck217,602,485);
        Truck2 truck218 = new Truck2();
        addObject(truck218,447,484);
        Truck2 truck219 = new Truck2();
        addObject(truck219,293,475);
        Truck2 truck220 = new Truck2();
        addObject(truck220,87,480);
        Truck1 truck111 = new Truck1();
        addObject(truck111,1503,108);
        Truck1 truck112 = new Truck1();
        addObject(truck112,1241,106);
        Truck1 truck113 = new Truck1();
        addObject(truck113,751,107);
        Truck1 truck114 = new Truck1();
        addObject(truck114,229,107);
        Truck1 truck115 = new Truck1();
        addObject(truck115,1412,446);
        Truck1 truck116 = new Truck1();
        addObject(truck116,979,444);
        Truck1 truck117 = new Truck1();
        addObject(truck117,623,441);
        Truck1 truck118 = new Truck1();
        addObject(truck118,243,446);
        Truck1 truck119 = new Truck1();
        addObject(truck119,52,445);
        Truck1 truck120 = new Truck1();
        addObject(truck120,822,448);
        Truck1 truck121 = new Truck1();
        addObject(truck121,1221,447);
        Truck1 truck122 = new Truck1();
        addObject(truck122,889,331);
        Car car9 = new Car();
        addObject(car9,439,330);
        car9.setLocation(447,333);
        removeObject(car9);
        truck122.setLocation(860,334);
        removeObject(truck122);
        truck110.setLocation(1469,328);
        removeObject(truck110);
        truck2.setLocation(1290,333);
        removeObject(truck2);

        addObject(car9,1555,583);
        Car car10 = new Car();
        addObject(car10,1370,587);
        Car car11 = new Car();
        addObject(car11,1129,588);
        Car car12 = new Car();
        addObject(car12,741,586);
        Car car13 = new Car();
        addObject(car13,279,584);
        Car car14 = new Car();
        addObject(car14,66,588);
        Car car15 = new Car();
        addObject(car15,571,587);
        Car2 car211 = new Car2();
        addObject(car211,149,338);
        Car2 car212 = new Car2();
        addObject(car212,309,335);
        Car2 car213 = new Car2();
        addObject(car213,526,332);
        Car2 car214 = new Car2();
        addObject(car214,737,332);
        Car2 car215 = new Car2();
        addObject(car215,1033,333);
        Car2 car216 = new Car2();
        addObject(car216,1270,335);
        Car2 car217 = new Car2();
        addObject(car217,1492,336);
        removeObject(toby);

        Toby toby2 = new Toby();
        addObject(toby2,849,626);
        Owner owner = new Owner();
        addObject(owner,854,49);
        owner.setLocation(851,53);
        removeObject(truck118);
        removeObject(truck216);
        removeObject(truck218);
        removeObject(truck219);
        removeObject(truck120);
        removeObject(truck116);
        removeObject(truck214);
        removeObject(truck212);
        removeObject(car2);
        removeObject(car12);
        removeObject(car9);
        removeObject(car13);
        removeObject(car27);
        removeObject(car29);
        removeObject(truck115);
        removeObject(truck215);
        removeObject(car212);
        removeObject(car213);
        removeObject(car215);
        removeObject(car7);
        removeObject(car6);
        removeObject(car3);
        removeObject(car5);
        removeObject(truck18);
        removeObject(truck13);
        removeObject(truck15);
        removeObject(truck26);
        removeObject(truck28);
        removeObject(truck24);
        removeObject(truck112);
        removeObject(truck29);
        removeObject(truck22);
        DogCatcher dogCatcher = new DogCatcher();
        addObject(dogCatcher,514,39);
        DogCatcher dogCatcher2 = new DogCatcher();
        addObject(dogCatcher2,1034,38);
        removeObject(dogCatcher);
        removeObject(dogCatcher2);
        removeObject(truck16);
        truck117.setLocation(412,437);
        truck117.setLocation(416,453);
        truck14.setLocation(594,250);
        car15.setLocation(673,588);
        truck213.setLocation(951,476);
        Heart heart = new Heart();
        addObject(heart,864,347);
        Heart heart2 = new Heart();
        addObject(heart2,221,464);
        heart2.setLocation(221,404);
        heart.setLocation(863,269);

        Bee bee1 = new Bee();
        addObject(bee1,1000,150);
        addObject(new Bee(90),300, 350);

        truck217.setLocation(606,469);
        truck217.setLocation(606,471);
        truck27.setLocation(627,140);
        truck211.setLocation(1502,479);
        water4.setLocation(333,289);
        removeObject(water4);
        removeObject(water11);
        removeObject(water15);
        removeObject(water3);
        DogCatcher2 dogCatcher22 = new DogCatcher2();
        addObject(dogCatcher22,790,283);
        owner.setLocation(879,59);
        removeObject(owner);
        house2.setLocation(772,63);
        addObject(owner,772,63);
        house2.setLocation(790,48);
        house2.setLocation(814,73);
        house2.setLocation(786,42);
        house2.setLocation(787,36);
        owner.setLocation(741,65);
        house2.setLocation(791,82);
        house2.setLocation(762,46);
        owner.setLocation(792,74);
        house2.setLocation(767,54);
        owner.setLocation(788,81);
        house2.setLocation(758,36);
        house2.setLocation(951,70);
        house2.setLocation(768,16);
        house2.setLocation(761,41);
        owner.setLocation(792,41);
        house2.setLocation(792,13);
        DogTreat dogTreat = new DogTreat();
        addObject(dogTreat,161,453);
        DogTreat dogTreat2 = new DogTreat();
        addObject(dogTreat2,1382,336);
        DogTreats2 dogTreats2 = new DogTreats2();
        addObject(dogTreats2,1212,140);
        dogTreats2.setLocation(1212,138);
        removeObject(dogTreats2);

        Door door = new Door();
        addObject(door,415,627);
        door.setLocation(288,631);
        Stop stop = new Stop();
        addObject(stop,84,626);
        Bee bee3 = new Bee();
        addObject(bee3,1236,610);
        removeObject(truck213);
        removeObject(truck211);
        removeObject(truck217);
        removeObject(truck220);
    }
}
