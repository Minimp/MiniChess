import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bauer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bauer extends Actor implements Weiss
{
    
    int x1;
    int y1;
    int x2;
    int y2;
    
    boolean move = true;
       
    /**
     * Act - do whatever the Bauer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {    
       if(Greenfoot.mousePressed(this))
       {
           x1 = this.getX();
           y1 = this.getY();
           System.out.println("Bauer Location:")
           System.out.println("X: " + x1 + " ; Y: " + y1);
           
           if(this.getOneObjectAtOffset(1,-1,Schwarz.class) != null || this.getOneObjectAtOffset(-1,-1,Schwarz.class) != null)
           {
                System.out.println("Gegner in Schlagreichweite!");
                move = false;
           }
       }
       
       if(Greenfoot.mouseDragged(this))
       {
           setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
       } 
       
       if(Greenfoot.mouseDragEnded(this))
       {
           x2 = this.getX();
           y2 = this.getY();
           
           if(move == true){
              if(y1 == 6)
              {
                  if(this.getX() != x1 || this.getY() < y1 -2 || this.getY() > y1)
                  {
                      this.setLocation(x1 , y1);
                  }
              } else
              {
                  if(this.getX() != x1 || this.getY() != y1 -1)
                  {
                      this.setLocation(x1 , y1);
                  }
              }
              
              for(int i = 0; i < y1-this.getY(); i++)
              {
                   if(this.getOneObjectAtOffset(0, i, null) != null)
                   {
                       this.setLocation(x1 , y1);
                       break;
                   }
              }
              
           } else 
           {
               System.out.println("else");
               
               if(this.getX() > x1 +1 || this.getX() < x1 -1 || this.getY() >= y1 || this.getY() < y1 -1)
                {
                    this.setLocation(x1 , y1);
                    move = true;
                }
           }
           
           if(this.getOneObjectAtOffset(0,0,Weiss.class) != null)
           {
                System.out.println("Kein Friendly-Fire!");
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
           
           if(this.getY() == 0)
           {
                Queen zq1 = new Queen(); 
                this.getWorld().addObject(zq1, x2, y2);
                this.getWorld().removeObject(this);
           }
                
           Greenfoot.playSound("move-self.mp3");
       }
       
       //move = true;
    }
    
}
