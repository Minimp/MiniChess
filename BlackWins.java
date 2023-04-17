import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackWins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackWins extends World
{

    /**
     * Constructor for objects of class BlackWins.
     * 
     */
    
    GreenfootImage textImage;
    
    public BlackWins()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        textImage = new GreenfootImage("Schwarz gewinnt die Partie!" , 50 , Color.BLACK , null);
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        getBackground().drawImage(textImage , centerX - textImage.getWidth() / 2, centerY - textImage.getHeight() / 2);
    }}
