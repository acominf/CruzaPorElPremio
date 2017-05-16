import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Presentacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Presentacion extends World
{

    /**
     * Constructor for objects of class Presentacion.
     * 
     */
    public Presentacion()
    {
        super(600,600,1);
    }
    
    public void act()
    {
        this.showText("Cruza por el premio", 300, 200);
        this.showText("Presione 'ENTER' para continuar", 300, 300);
        
        if(Greenfoot.isKeyDown("enter"))
        {
             Greenfoot.setWorld(new Inicio());
        }
    }
}
