import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


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
       
       if(nuevox > mundo.getWidth())
        {
            nuevox = 25;
        }
       
       this.setLocation(nuevox, this.getY());
    }
}
