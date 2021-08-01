import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Frog is the avatar of the player.
 * 
 * @author (Alejandro Azurdia) 
 * @version (0.1)
 */public class Frog extends Actor
{
    public Frog()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()+20, image.getHeight()+20);
        setImage(image);
    }
    
    public void act()
    {
        moveAndTurn();
        eat();
        //scoring();
        redTurn();
    }
    
    int n = 0;
    public void moveAndTurn()
    {
        move (2+n);
        
        if (Greenfoot.isKeyDown("space"))
        {
            move (6);
            World myWorld = getWorld();
            Pool pool = (Pool)myWorld;
            ScoreCounter scorecounter = pool.getScoreCounter();
            scorecounter.takescore();
        }
        if (Greenfoot.isKeyDown("down"))
        {
            turn(180);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-90);
            move(5);
            turn(90);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(90);
            move(5);
            turn(-90);
        }
    }
    
    
    public void eat()
    {
        Actor ant;
        ant = getOneObjectAtOffset(0,0,Ant.class);
        if (ant != null)
        {
            n= n+1;
            World world;
            world = getWorld();
            world.removeObject(ant);
        }
    }
    
    public void redTurn()
    {
        Actor redline;
        redline = getOneObjectAtOffset(0,0,RedLine.class);
        if (redline != null)
        {
            turn(180); 
        }
    }
}










