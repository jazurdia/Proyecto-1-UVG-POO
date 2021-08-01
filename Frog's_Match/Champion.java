import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Champion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Champion extends Actor
{
    public Champion()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()-1200, image.getHeight()-800);
        setImage(image);
    }
    
    
    public void act()
    {
        moveAndTurn();
        turning();
    }
    
    public void moveAndTurn()
    {
        move (5);
        if (getY() == getWorld().getHeight())
        {
            turn(180);
        }
    }
    
    public void turning()
    {

        Actor redline;
        redline = getOneObjectAtOffset(0,0,RedLine.class);
        if (redline != null)
        {
            turn(180); 
        }
    }
}
