import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Tronco_Izq extends Tronco
{
    private int incx;
    
    public Tronco_Izq(int x)
    {
        incx = x;
    }
    
    @Override
    public void act() 
    {
        muevete();
    }
    
    
    public void muevete()
    {
       int posx = this.getX();
       int nuevox = posx + incx; 
        
       World mundo = this.getWorld();
       
       if(nuevox >= mundo.getWidth())
        {
            nuevox = 25;
        }
       this.setLocation(nuevox, this.getY());
       
       
       List lista = mundo.getObjects(Personaje.class);
       Object obj = lista.get(0);
       Personaje p = (Personaje)obj;
       if(this.isTouching(Personaje.class))
       {
           p.muevete(this.getX(), this.getY());
       }
       
    }
}
