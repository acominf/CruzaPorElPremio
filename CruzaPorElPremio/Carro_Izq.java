import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Carro_Izq extends Actor
{
    @Override
    public void act() 
    {
        // Add your action code here.
    }
    
    public void muevete(int incx)
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
