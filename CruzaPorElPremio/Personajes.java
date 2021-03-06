import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Personajes extends World
{

    public Personajes()
    {    
        super(600, 600, 1); 
    }
    
    @Override
    public void act()
    {
        addObject(new Pato(), 150, 200);
        addObject(new Perro(), 300, 200);
        addObject(new Cerdo(), 450, 200);
        addObject(new Ardilla(), 150, 400);
        addObject(new Pato2(), 300, 400);
        addObject(new Rana(), 450, 400);
        
        this.showText("Elija su personaje: ", 300, 100);
    }
    
}
