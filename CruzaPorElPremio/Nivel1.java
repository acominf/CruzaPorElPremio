import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


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
        
        addObject(new Carro1(), 25, 525);
        addObject(new Taxi(), 575, 475);
        addObject(new Carro2(), 25, 425);
        addObject(new Carro3(), 575, 375);
        
        addObject(new Carro1(), 25, 225);
        addObject(new Taxi(), 575, 175);
        addObject(new Carro2(), 25, 125);
        addObject(new Carro3(), 575, 75);
    }
}
