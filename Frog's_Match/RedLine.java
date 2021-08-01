import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedLine extends Actor
{
    /**
     * Act - do whatever the RedLine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor frog = getOneIntersectingObject(Frog.class);
        //if (intersects((Actor)getWorld().getObjects(Frog.class).get(0)))        
        if (frog != null)
        {
            World myWorld = getWorld();
            Pool pool = (Pool)myWorld;
            ScoreCounter scorecounter = pool.getScoreCounter();
            scorecounter.addscore();
            int numberthree = Greenfoot.getRandomNumber(100);
            if (numberthree < 21)
            {
                scorecounter.plus();
            }
        }
        
        Actor champion = getOneIntersectingObject(Champion.class);
        //if (intersects((Actor)getWorld().getObjects(Frog.class).get(0)))        
        if (champion != null)
        {
            World myWorld = getWorld();
            Pool pool = (Pool)myWorld;
            EnemyScoreCounter enemyscorecounter = pool.getEnemyScoreCounter();
            enemyscorecounter.addscore();
    
        }

    }
}









