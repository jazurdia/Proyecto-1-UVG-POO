import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class ScoreCounter extends Actor
{
    /**
     * Act - do whatever the ScoreCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int score = 0;
    public void act()
    {
        setImage(new GreenfootImage("Score : " + score, 50, Color.WHITE, Color.BLACK));
        //https://www.youtube.com/watch?v=VnR6i7BXD-E
    }
    
    public static int getScore()
    {
        return score;
    }
    
    public void addscore ()
    {
        score++;
    }
    
    public void takescore ()
    {
        score--;
    }
    
    public void plus ()
    {
        score = score + 5;
    }
    
    public void showWon()
    {
        if (score > 300)
        {
            World world;
            world = getWorld();
            YouWon youwon = new YouWon();
            world.addObject(youwon, 750, 400);
        }
    }
}
