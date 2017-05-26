import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo


public class Nivel2 extends World
{
    private int puntos;
    private int vidas;
    
    public Nivel2(int p, int v)
    {    
        super(600, 600, 1);
        puntos = p;
        vidas = v;
        dibujate();
    }
    
    @Override
    public void act()
    {
       
    }
    
    public void dibujate()
    {
        this.showText("Nivel: 2", 50, 20);
        this.showText("Vidas: " + vidas, 50, 40);
        this.showText("Puntos: " + puntos, 500, 20);
        
        Tierra te1 = new Tierra();
        Tierra te2 = new Tierra();
        Tierra te3 = new Tierra();
        Tierra te4 = new Tierra();
        addObject(te1, 300, 575);
        addObject(te2, 300, 325);
        addObject(te3, 300, 275);
        addObject(te4, 300, 25);
        
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
        
        Vida v1 = new Vida();
        Vida v2 = new Vida();
        addObject(v1, 100, 275);
        addObject(v2, 500, 275);
        
        Puntos p1 = new Puntos();
        Puntos p2 = new Puntos();
        Puntos p3 = new Puntos();
        addObject(p1, 300, 325);
        addObject(p2, 150, 25);
        addObject(p3, 500, 25);
    }
    
    /*
    public void modificaPuntos(int inc)
    {
        puntos += inc;
        this.showText("Puntos: " + puntos, 500, 20);
    }
    
    public void modificaVidas(int v)
    {
        if(v == 1)
        {
            vidas -= 1;
        }
        
        if(v == 2)
        {
            vidas += 1;
        }
    }
    */
    
}
