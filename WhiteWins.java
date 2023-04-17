import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteWins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteWins extends World
{

    /**
     * Constructor for objects of class WhiteWins.
     * 
     */
    
    GreenfootImage textImage;
    
    public WhiteWins()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        textImage = new GreenfootImage("Weiß gewinnt die Partie!" , 50 , Color.BLACK , null);
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        getBackground().drawImage(textImage , centerX - textImage.getWidth() / 2, centerY - textImage.getHeight() / 2);
    }
}
