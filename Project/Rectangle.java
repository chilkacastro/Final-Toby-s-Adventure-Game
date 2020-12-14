import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Rectangle Class - used to show the score on the winner screen and game over screen
 * 
 * @author (Chilka, Madalina, Nicolas, Jose)
 * @version Gold Master(December 14, 2020)
 */
public class Rectangle extends Actor
{
    /**
     * Default Constructor
     */
    public Rectangle () {
        //no parameter
        
    }

    /**
     * Constructor with two parameters
     */
    public Rectangle(int score, int lifeCount) {
       int fontSize = 60;
       Color fontColor = new Color(233, 255, 221);
       Color fontBgColor = new Color(0, 0, 0, 0);

       GreenfootImage txtImg = new GreenfootImage("    Score: " + score + "\n" + "Lives: " + lifeCount, fontSize, fontColor, fontBgColor);
       GreenfootImage img = new GreenfootImage(txtImg.getWidth()+30, txtImg.getHeight()+40);
       img.drawImage(txtImg, (img.getWidth() - txtImg.getWidth())/2, (img.getHeight() - txtImg.getHeight())/2);
       setImage(img);
    }
    
    /**
     * Constructors with three parameters
     */
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
    
}
