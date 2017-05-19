import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carro_Der here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro_Der extends Actor
{
    private int incx;
    
    public Carro_Der()
    {
        incx = 10;
    }
    
    @Override
    public void act() 
    {
        // Add your action code here.
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
    }
}
