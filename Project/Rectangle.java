import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle extends Actor
{
    public Rectangle () {
        //default constructor
        
    }

    public Rectangle(int score, int lifeCount) {
       int fontSize = 60;
       Color fontColor = new Color(233, 255, 221);
       Color fontBgColor = new Color(0, 0, 0, 0);

       GreenfootImage txtImg = new GreenfootImage("    Score: " + score + "\n" + "Lives: " + lifeCount, fontSize, fontColor, fontBgColor);
       GreenfootImage img = new GreenfootImage(txtImg.getWidth()+30, txtImg.getHeight()+40);
       img.drawImage(txtImg, (img.getWidth() - txtImg.getWidth())/2, (img.getHeight() - txtImg.getHeight())/2);
       setImage(img);
    }
    
    public Rectangle(int score, int lifeCount, int fontSize) {
        Color fontColor = new Color(233, 255, 221);
        Color fontBgColor = new Color(0, 0, 0, 0);
        Color bgColor = new Color(31, 110, 35);
     
        GreenfootImage txtImg = new GreenfootImage("Score: " + score + "\nLives: " + lifeCount, fontSize, fontColor, fontBgColor);
        GreenfootImage img = new GreenfootImage(txtImg.getWidth()+30, txtImg.getHeight()+40);
        
        img.setTransparency(180);
        img.setColor(bgColor);
        img.fillOval(-13, 10, 50, img.getHeight()-10);
        img.fillOval(img.getWidth()-39, 10, 50, img.getHeight()-10);
        img.fillRect(10, 10, img.getWidth()-20, img.getHeight());
        img.drawImage(txtImg, (img.getWidth() - txtImg.getWidth())/2, (img.getHeight() - txtImg.getHeight())/2);
        setImage(img);
        
    }
    
    /**
     * Act - do whatever the Rectangle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
