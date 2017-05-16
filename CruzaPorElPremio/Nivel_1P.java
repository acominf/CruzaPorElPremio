import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel_1P here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel_1P extends World
{

    /**
     * Constructor for objects of class Nivel_1P.
     * 
     */
    public Nivel_1P()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
    }
    
    @Override
    public void act()
    {
        this.showText("NIVEL 1", 300, 300);
        Greenfoot.delay(300);
        Greenfoot.setWorld(new Nivel1());
    }
}
