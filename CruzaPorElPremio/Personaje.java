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
        
        if(vidas == 0)
        {
            GameOver go = new GameOver();
            Greenfoot.setWorld(go);
        }
        
    }
    
    public void muevete(int x, int y)
    {
        this.setLocation(x, y);
        
        // si presiona flecha derecha
        if(Greenfoot.isKeyDown("right") && this.getX() < 575)
        {
            this.setLocation(this.getX() + 30, this.getY() );
        }
        
        // si presiona flecha izquierda
        if(Greenfoot.isKeyDown("left") && this.getX() > 25)
        {
            // muevete a la derecha
            this.setLocation(this.getX() - 30, this.getY() );
        }
        
        // si presiona flecha arriba
        if(Greenfoot.isKeyDown("up"))
        {
            this.setLocation(this.getX(), this.getY() - 30);
        }
        
        // si presiona flecha abajo
        if(Greenfoot.isKeyDown("down") && this.getY() < 575)
        {
            this.setLocation(this.getX(), this.getY() + 30);
        }
        
    }
    
    public void muevete2(int x, int y)
    {
        this.setLocation(x, y);
        
        // si presiona flecha derecha
        if(Greenfoot.isKeyDown("right") && this.getX() < 575)
        {
            this.setLocation(this.getX() + 40, this.getY() );
        }
        
        // si presiona flecha izquierda
        if(Greenfoot.isKeyDown("left") && this.getX() > 25)
        {
            // muevete a la derecha
            this.setLocation(this.getX() - 40, this.getY() );
        }
        
        // si presiona flecha arriba
        if(Greenfoot.isKeyDown("up"))
        {
            this.setLocation(this.getX(), this.getY() - 40);
        }
        
        // si presiona flecha abajo
        if(Greenfoot.isKeyDown("down") && this.getY() < 575)
        {
            this.setLocation(this.getX(), this.getY() + 40);
        }
        
    }
    
    public void modificaVidas()
    {
        World mundo = this.getWorld();
        
        if(!this.isTouching(Tierra.class) && !this.isTouching(Tronco.class))
        {
            vidas -= 1;
            this.setLocation(300, 575);
            mundo.showText("Vidas: " + vidas, 50, 40);
        }
    }
    
    public int regresaPuntos()
    {
        return puntos;
    }
    
}
