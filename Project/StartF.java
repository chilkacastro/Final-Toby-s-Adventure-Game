import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartF extends Actor
{
    public StartF() {
        /*GreenfootImage textImage = new GreenfootImage(text.length()* 50, 600);
        textImage.drawString(text, 10, 300);
        setImage(textImage); */
    }
    /**
     * Act - do whatever the StartF wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (Greenfoot.mouseClicked(this)) {
          Greenfoot.playSound("Woof.wav");
          Greenfoot.setWorld(new MyWorld());
          Greenfoot.setWorld(new Level4());
        }    
    }
}
