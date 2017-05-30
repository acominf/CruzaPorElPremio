import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Tronco_Fin extends Tronco
{
   private int incx;
    
    public Tronco_Fin(int x)
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
       
       int nuevox = posx - incx;
        
       World mundo = this.getWorld();
       
       if(nuevox < 0)
       {
            nuevox = 575;
       }
       this.setLocation(nuevox, this.getY());
       
       List lista = mundo.getObjects(Personaje.class);
       Object obj = lista.get(0);
       Personaje p = (Personaje)obj;
       if(this.isTouching(Personaje.class))
       {
           p.muevete2(this.getX(), this.getY());
       }
       
    } 
}
