import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Tronco_Der extends Tronco
{
    private int incx;
    
    public Tronco_Der(int x)
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
    } 
}
