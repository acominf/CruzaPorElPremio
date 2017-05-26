import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class GameOver extends World
{
    public GameOver()
    {    
        super(600, 600, 1); 
    }
    
    @Override
    public void act()
    {
        Greenfoot.delay(300);
        Inicio in = new Inicio();
        Greenfoot.setWorld(in);
    }
}
