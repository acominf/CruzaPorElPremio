import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio extends World
{

    /**
     * Constructor for objects of class Inicio.
     * 
     */
    public Inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
    }
    
    public void act()
    {
        this.showText("Cruza por el premio", 300, 200);
        this.showText("Presione 'ENTER' para continuar", 300, 300);
        
        if(Greenfoot.isKeyDown ("enter"))
        {
            this.setBackground("fondo_azul2.png");
        }
        
        
    }
}
