import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pato2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pato2 extends Personaje
{
    /**
     * Act - do whatever the Pato2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Nivel1());
            
            World mundo = this.getWorld();
            mundo.addObject(this, 300, 575);
        }
    }      
}
