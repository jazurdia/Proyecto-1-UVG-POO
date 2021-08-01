import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class EnemyScoreCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyScoreCounter extends Actor
{
    /**
     * Act - do whatever the EnemyScoreCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int score = 0;
    public void act()
    {
        setImage(new GreenfootImage("Enemy Score : " + score, 50, Color.WHITE, Color.BLACK));
        //https://www.youtube.com/watch?v=VnR6i7BXD-E
    }
    
    public void addscore ()
    {
        score++;
    }
    
    public static int getScore()
    {
        return score;
    }
    

}
