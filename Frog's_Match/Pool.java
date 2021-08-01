import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;

/**
 * Write a description of class Pool here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pool extends World
{
    //Counters
    ScoreCounter scorecounter = new ScoreCounter();
    EnemyScoreCounter enemyscorecounter = new EnemyScoreCounter();
    //
    
    GreenfootSound myMusic = new GreenfootSound("mmMusic.wav");
    
    /**
     * Constructor for objects of class Pool.
     * 
     */
    public Pool()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1); 
        prepare();
        
        
    }
    
    public void prepare()
    {
        addObject(scorecounter, 100, 40);
        addObject(enemyscorecounter,1208,40);

        // Auto Generated
        RedLine redLine = new RedLine();
        addObject(redLine,1497,326);
        RedLine redLine2 = new RedLine();
        addObject(redLine2,2,450);
        Champion champion = new Champion();
        addObject(champion,119,247);
        Frog frog = new Frog();
        addObject(frog,116,513);

        //Random Croco Generated
        Croco croco = new Croco();
        addObject(croco, Greenfoot.getRandomNumber(1500), Greenfoot.getRandomNumber(800));
        Croco croco2 = new Croco();
        addObject(croco2, Greenfoot.getRandomNumber(1500), Greenfoot.getRandomNumber(800));
        Croco croco3 = new Croco();
        addObject(croco3, Greenfoot.getRandomNumber(1500), Greenfoot.getRandomNumber(800));
        Croco croco4 = new Croco();
        addObject(croco4, Greenfoot.getRandomNumber(1500), Greenfoot.getRandomNumber(800));
        Croco croco5 = new Croco();
        addObject(croco5, Greenfoot.getRandomNumber(1500), Greenfoot.getRandomNumber(800));
        Croco croco6 = new Croco();
        addObject(croco6, Greenfoot.getRandomNumber(1500), Greenfoot.getRandomNumber(800));
        
        //Random Ant Generated
        Ant ant = new Ant();
        addObject(ant, Greenfoot.getRandomNumber(1500), Greenfoot.getRandomNumber(800));
        Ant ant2 = new Ant();
        addObject(ant2, Greenfoot.getRandomNumber(1500), Greenfoot.getRandomNumber(800));
        Ant ant3 = new Ant();
        addObject(ant3, Greenfoot.getRandomNumber(1500), Greenfoot.getRandomNumber(800));
        Ant ant4 = new Ant();
        addObject(ant4, Greenfoot.getRandomNumber(1500), Greenfoot.getRandomNumber(800));
        Ant ant5 = new Ant();
        addObject(ant5, Greenfoot.getRandomNumber(1500), Greenfoot.getRandomNumber(800));
        Ant ant6 = new Ant();
        addObject(ant6, Greenfoot.getRandomNumber(1500), Greenfoot.getRandomNumber(800));
        
    }

    public ScoreCounter getScoreCounter()
    {
        return scorecounter;
    }
    
    public EnemyScoreCounter getEnemyScoreCounter()
    {
        return enemyscorecounter;
    }
    
    public void act()
    {
        myMusic.play();
    }
}
