import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Inicio extends World
{

    public Inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
    }
    
    @Override
    public void act()
    {
        addObject(new BotonPlay(), 300, 300);
        this.showText("Oprima el boton para iniciar el juego", 300,100);
        
    }
    
}
