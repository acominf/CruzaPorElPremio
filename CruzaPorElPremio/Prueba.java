import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prueba extends World
{

    /**
     * Constructor for objects of class Prueba.
     * 
     */
    public Prueba()
    {    
        super(600, 400, 1); 
        dibujate();
    }
    
    public void act()
    {
    }
    
    public void dibujate()
    {
        Font f = new Font(100);
        GreenfootImage img = new GreenfootImage(600, 600);
        img.setColor(Color.BLACK);
        img.setFont(f);
        // img.drawString("Cruza por el premio", 300, 200);
        
        this.showText("Cruza por el premio", 300, 200);
        
    }
}
