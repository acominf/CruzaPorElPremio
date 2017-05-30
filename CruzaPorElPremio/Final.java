import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Final extends World
{
    private int puntos;
    
    public Final(int p)
    {    
        super(600, 600, 1); 
        puntos = p;
        dibujate();
    }
    
    public void dibujate()
    {
        this.showText("GANADOR!", 300, 300);
        this.showText("Puntuacion final: " + puntos, 300, 350);
    }
}
