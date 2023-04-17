import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Springer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Springer extends Actor implements Weiss
{
    
    int x1;
    int y1;
    
    /**
     * Act - do whatever the Springer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       if(Greenfoot.mousePressed(this))
       {
           x1 = this.getX();
           y1 = this.getY();
           System.out.println("X: " + x1 + " ; Y: " + y1);
       }
       
       if(Greenfoot.mouseDragged(this))
       {
           setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
       } 
       
       if(Greenfoot.mouseDragEnded(this))
       {
            if(!(Math.abs(this.getX() - x1) == 2 && Math.abs(this.getY() - y1) == 1) && !(Math.abs(this.getY() - y1) == 2 && Math.abs(this.getX() - x1) == 1))
            {
                   setLocation(x1 , y1);
            }
           
            if(this.getOneObjectAtOffset(0,0,Weiss.class) != null)
            {
                System.out.println("Kein Friendly-Fire!");
                setLocation(x1, y1);
            }
            
            if(this.getOneObjectAtOffset(0,0,KoenigS.class) != null)
            {
                this.getWorld().removeObject(this.getOneObjectAtOffset(0,0,null));
                Greenfoot.setWorld(new WhiteWins());
            }
                
            if(this.getOneObjectAtOffset(0,0,Schwarz.class) != null)
            {
                this.getWorld().removeObject(this.getOneObjectAtOffset(0,0,null));
            }
               
            Greenfoot.playSound("move-self.mp3");
       }
       
    }
    
}
