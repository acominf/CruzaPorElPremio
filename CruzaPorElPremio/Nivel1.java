import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Nivel1 extends World
{
   
    public Nivel1()
    {     
        super(600, 600, 1);
        dibujate();
    }
    
    @Override
    public void act()
    {
       
    }
    
    public void dibujate()
    {
       this.showText("Nivel: 1", 50, 20);
       this.showText("Vidas: 5", 50, 40);
       this.showText("Puntos: 0", 500, 20); 
       
        Carro1 c1 = new Carro1();
        Carro1 c2 = new Carro1();
        Carro2 c3 = new Carro2();
        Carro2 c4 = new Carro2();
        Carro3 c5 = new Carro3();
        Carro3 c6 = new Carro3();
        Taxi t1 = new Taxi();
        Taxi t2 = new Taxi();
        Vida v1 = new Vida();
        Vida v2 = new Vida();
        Puntos p1 = new Puntos();
        Puntos p2 = new Puntos();
        Puntos p3 = new Puntos();
        
        addObject(new Calle(), 150, 450);
        addObject(new Calle(), 450, 450);
        addObject(new Calle(), 150, 150);
        addObject(new Calle(), 450, 150);
        
        addObject(v1, 300, 325);
        addObject(v2, 150, 25);
        
        addObject(p1, 100, 275);
        addObject(p2, 500, 275);
        addObject(p3, 500, 25);
        
        addObject(c1, 25, 525);
        addObject(t1, 575, 475);
        addObject(c3, 25, 425);
        addObject(c5, 575, 375);
        
        addObject(c2, 25, 225);
        addObject(t2, 575, 175);
        addObject(c4, 25, 125);
        addObject(c6, 575, 75);
    }
    /*
    public void modificaPuntos(int inc)
    {
        puntos += inc;
        this.showText("Puntos: " + puntos, 500, 20);
    }
   
    public void modificaVidas(int v)
    {
        if(v == 1)
        {
            vidas -= 1;
        }
        
        if(v == 2)
        {
            vidas += 1;
        }
    }
    */
    
}
