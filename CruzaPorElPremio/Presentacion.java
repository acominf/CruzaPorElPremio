import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Presentacion extends World
{

    public Presentacion()
    {
        super(600,600,1);
    }
    
    @Override
    public void act()
    {
        this.showText("Cruza por el premio", 300, 200);
        this.showText("Presione 'ENTER' para continuar", 300, 300);

        if(Greenfoot.isKeyDown("enter"))
        {
             Greenfoot.setWorld(new Inicio());
        }
    }
}
