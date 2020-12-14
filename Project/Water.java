import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Deep Water Class- a third level obstacle that reduces life count.
 * 
 * @author (Chilka, Madalina, Nicolas, Jose) 
 * @version Gold Master(December 14, 2020)
 */
public class Water extends Obstacles
{   
   private int lineCounter = 0;
    /**
     * Act - do whatever the Water wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
   {
        if (isTouching(Toby.class)) {
           removeTouching(Toby.class);
           deductLife();
           reviveToby();
           printMessage();
           
        }
   }  
   
   /**
    * deductLife() - To decrease life count when Toby touches the deep water.
    */
   public void deductLife() {
       ((MyWorld)getWorld()).lifeCount(-1);
        Greenfoot.playSound("Crying.wav");
   }  

   /**
    * reviveToby() - To revive Toby if life count is higher than 0.
    */
   public void reviveToby() {
       MyWorld myWorld = (MyWorld)getWorld();
       if (myWorld.getLifeCount() > 0) {
            Level3 myLevel3 = (Level3)getWorld();
            myLevel3.addObject(new Toby(), 800, 640);
       }  
   
   }  
   
   /**
    * printMessage() - To print a message when Toby is touching the deep water.
    */
   public void printMessage() {
       lineCounter++;
       if (lineCounter > 0) {
           Level3 line = (Level3)getWorld();
           line.addObject(new WaterLine(), 850, 350); 
       }
   
   }  
   
 }
