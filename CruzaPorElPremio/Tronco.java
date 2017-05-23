import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Tronco extends Actor
{
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void muevete(int incx)
    {
        int posx = this.getX();
        
        if(posx == 25)
        {
            int nuevox = posx + incx;
        
            World mundo = this.getWorld();
       
            if(nuevox > mundo.getWidth())
            {
                nuevox = 25;
            }
       
            this.setLocation(nuevox, this.getY());
        }
        
        if (posx == 575)
        {
            int nuevox = posx - incx;
        
            World mundo = this.getWorld();
       
            if(nuevox < 0)
            {
                nuevox = 575;
            }
       
            this.setLocation(nuevox, this.getY());
        }
    }
}
