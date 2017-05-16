import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Personaje extends Actor
{
    /**
     * Act - do whatever the Personaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    @Override
    public void act() 
    {
        // si presiona flecha derecha
        if(Greenfoot.isKeyDown("right"))
        {
            this.setLocation(this.getX() + 5, this.getY() );
        }
        
        // si presiona flecha izquierda
        if(Greenfoot.isKeyDown("left"))
        {
            // muevete a la derecha
            this.setLocation(this.getX() - 5, this.getY() );
        }
        
        // si presiona flecha arriba
        if(Greenfoot.isKeyDown("up"))
        {
            this.setLocation(this.getX(), this.getY() - 5);
        }
        
        // si presiona flecha abajo
        if(Greenfoot.isKeyDown("down"))
        {
            this.setLocation(this.getX(), this.getY() + 5);
        }
    }    
}
