import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Personaje extends Actor
{
    private int vidas;
    private int puntos;
    
    public Personaje()
    {
        vidas = 5;
        puntos = 0;
    }
    
    @Override
    public void act() 
    { 
       
    }
    
    public void muevete()
    {
       World mundo = this.getWorld();
        
        if(this.isTouching(Carro_Izq.class) || this.isTouching(Carro_Der.class))
        {
            this.setLocation(300, 575);
            vidas -= 1;
            mundo.showText("Vidas: " + vidas, 50, 40);
        }
        
        
        if(this.isTouching(Vida.class))
        {
            this.removeTouching(Vida.class);
            vidas += 1;
            mundo.showText("Vidas: " + vidas, 50, 40);
        }
        
         if(this.isTouching(Puntos.class))
        {
            this.removeTouching(Puntos.class);
            puntos += 100;
            mundo.showText("Puntos: " + puntos, 500, 20);
        }
        
        if(this.isAtEdge())
        {
           puntos += 1000;
           Nivel2 nivel2 = new Nivel2(puntos, vidas);
           Greenfoot.setWorld(nivel2);
           
           nivel2.addObject(this, 300, 575);
        }
        
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
        
    }
}
