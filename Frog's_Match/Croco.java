import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class croco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Croco extends Actor
{
    /**
     * Act - do whatever the croco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Croco()
    {
        //https://www.greenfoot.org/topics/1763
        GreenfootImage image = getImage();
        image.scale(image.getWidth()-30, image.getHeight()-10);
        setImage(image);
    }
    
    public void act()
    {
        moveAndTurn();
        eat();
    }
    
    public void eat()
    {
        Actor frog;
        frog = getOneObjectAtOffset(0,0,Frog.class);
        if (frog != null)
        {
            World world;
            world = getWorld();
            world.removeObject(frog);
            if (ScoreCounter.getScore() > EnemyScoreCounter.getScore())
            {
                YouWon youwon = new YouWon();
                world.addObject(youwon, 750, 400);
            }
            else
            {
                GameOver gameover = new GameOver();
                world.addObject(gameover, 750, 400);
            }
        
            Greenfoot.stop();
        
        }
    }
    
    public void moveAndTurn()
    {
        move (3);
        int number = Greenfoot.getRandomNumber(200);
        if (number < 10)
        {
            turn (11);
        }
        if (number > 189)
        {
            turn (-10);
        }
        if (isAtEdge() == true)
        {
            turn(180);
        }
    }
}
