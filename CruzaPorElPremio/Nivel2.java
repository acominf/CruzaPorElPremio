import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Nivel2 extends World
{
    private int puntos;
    private int vidas;
    public Nivel2(int p, int v)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        puntos = p;
        vidas = v;
        dibujate();
    }
    
    @Override
    public void act()
    {
        this.showText("Nivel: 2", 50, 20);
        this.showText("Vidas: " + vidas, 50, 40);
        this.showText("Puntos: " + puntos, 500, 20);
    }
    
    public void dibujate()
    {
        Tronco t1 = new Tronco();
        Tronco t2 = new Tronco();
        Tronco t3 = new Tronco();
        Tronco t4 = new Tronco();
        Tronco t5 = new Tronco();
        Tronco t6 = new Tronco();
        Tronco t7 = new Tronco();
        Tronco t8 = new Tronco();
        
        addObject(t1, 25, 525);
        addObject(t2, 575, 475);
        addObject(t3, 25, 425);
        addObject(t4, 575, 375);
        
        addObject(t5, 25, 225);
        addObject(t6, 575, 175);
        addObject(t7, 25, 125);
        addObject(t8, 575, 75);
    }
}
