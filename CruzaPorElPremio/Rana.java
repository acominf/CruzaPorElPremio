import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rana extends Personaje
{
    /**
     * Act - do whatever the Rana wants to do. This method is called whenever
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
