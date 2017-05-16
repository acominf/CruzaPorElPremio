import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends World
{

    /**
     * Constructor for objects of class Nivel1.
     * 
     */
    public Nivel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
    }
    
    @Override
    public void act()
    {
        addObject(new Calle(), 150, 450);
        addObject(new Calle(), 450, 450);
        addObject(new Calle(), 150, 150);
        addObject(new Calle(), 450, 150);
    }
}
