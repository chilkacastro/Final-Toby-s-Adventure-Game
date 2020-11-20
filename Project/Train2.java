import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Train2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train2 extends Actor
{
    /**
     * Act - do whatever the Train2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-5, getY());
        if (isAtEdge()) {
            turn(50);
            //setLocation(100, 300);
        } 
        /* if (isTouching(Toby.class)) {    

            WorldName world = (WorldName) getWorld();
            world.SomeMethod;
            Actor Toby = getOneObjectAtOffset(3, 3, Toby.class);
        } */
        
        if (isTouching(Toby.class)) {
           Greenfoot.playSound("Train.wav");
           
           // removeTouching(Toby.class);
            //getWorld().showText("You lose a life!",500, 500);
           
           MyWorld level2 = (MyWorld) getWorld();
           level2.addScore(-10000);
           level2.lifeCount(-1);

        } 
        

            
    }
}
