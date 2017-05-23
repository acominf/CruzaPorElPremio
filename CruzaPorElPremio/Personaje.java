import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Personaje extends Actor
{
   
    @Override
    public void act() 
    {
        
    }
    
    public void muevete()
    {
        // si presiona flecha derecha
        if(Greenfoot.isKeyDown("right") && this.getX() < 575)
        {
            this.setLocation(this.getX() + 5, this.getY() );
        }
        
        // si presiona flecha izquierda
        if(Greenfoot.isKeyDown("left") && this.getX() > 25)
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
        if(Greenfoot.isKeyDown("down") && this.getY() < 575)
        {
            this.setLocation(this.getX(), this.getY() + 5);
        }
        
        if(this.isTouching(Carro_Izq.class) || this.isTouching(Carro_Der.class))
        {
            this.setLocation(300, 575);
        }
    }
}
