import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Nivel1 extends World
{
    public Nivel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        dibujate();
    }
    
    @Override
    public void act()
    {
        int ganar = 0;
        int vidas = 3;
        int puntos = 0;
        
        this.showText("Nivel: 1", 50, 20);
        this.showText("Vidas: " + vidas, 50, 40);
        this.showText("Puntos: " + puntos, 500, 20);
        
       //  List lista = this.getObjects(Personaje.class);
        
        
    }
    
    public void dibujate()
    {
        Carro1 c1 = new Carro1();
        Carro1 c2 = new Carro1();
        Carro2 c3 = new Carro2();
        Carro2 c4 = new Carro2();
        Carro3 c5 = new Carro3();
        Carro3 c6 = new Carro3();
        Taxi t1 = new Taxi();
        Taxi t2 = new Taxi();
        
        addObject(new Calle(), 150, 450);
        addObject(new Calle(), 450, 450);
        addObject(new Calle(), 150, 150);
        addObject(new Calle(), 450, 150);
        
        
        addObject(c1, 25, 525);
        addObject(t1, 575, 475);
        addObject(c3, 25, 425);
        addObject(c5, 575, 375);
        
        addObject(c2, 25, 225);
        addObject(t2, 575, 175);
        addObject(c4, 25, 125);
        addObject(c6, 575, 75);
    }
}
