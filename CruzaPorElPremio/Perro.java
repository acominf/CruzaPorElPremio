import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Perro extends Personaje
{
    @Override
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))
        {
            Nivel1 nivel1 = new Nivel1();
            Greenfoot.setWorld(nivel1);
            
            nivel1.addObject(this, 300, 575);
        }
        this.muevete();
    }
}
