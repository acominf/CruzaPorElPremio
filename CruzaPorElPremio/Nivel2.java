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
        Tronco1 t1 = new Tronco1();
        Tronco2 t2 = new Tronco2();
        Tronco3 t3 = new Tronco3();
        Tronco4 t4 = new Tronco4();
        Tronco1 t5 = new Tronco1();
        Tronco2 t6 = new Tronco2();
        Tronco3 t7 = new Tronco3();
        Tronco4 t8 = new Tronco4();
        
        addObject(t1, 25, 525);
        addObject(t3, 575, 475);
        addObject(t2, 25, 425);
        addObject(t4, 575, 375);
        
        addObject(t5, 25, 225);
        addObject(t7, 575, 175);
        addObject(t6, 25, 125);
        addObject(t8, 575, 75);
    }
}
