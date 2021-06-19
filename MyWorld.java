import greenfoot.*;

/**
 * This class is the world in which the simulation takes place
 * 
 * @author Bennet Ranft 
 * @version 11.06.2021
 */

public class MyWorld extends World {
    public Counter healthCount, immuneCount, sickCount, deathCount, infectedCount;

    public MyWorld() {
        super(Config.WORLD_WIDTH, Config.WORLD_HEIGHT, 1);
        Greenfoot.setSpeed(Config.DEFAULT_SPEED);

        System.out.println("\n");
        System.out.println("===========================================");
        System.out.println("#             new simulation              #");
        System.out.println("===========================================");

        populate();
        counters();
    }

    /**
     * Sets the speed of the simulation to Config.DEFAULT_SPEED
     */
    public void setDefaultSpeed() {
        Greenfoot.setSpeed(Config.DEFAULT_SPEED);
    }
    
    /**
     * Spawns persons in the world
     */
    private void populate() {
        System.out.println("Spawning persons...");

        for(int i = Config.SPAWNCOUNT_INFECTED; i > 0; i--) {
            addObject(new Person(true), posx(), posy());
        }

        for(int i = Config.SPAWNCOUNT_HEALTHY; i > 0; i--) {
            addObject(new Person(false), posx(), posy());
        }
    }

    /**
     * Places the counters in the world
     */
    private void counters() {
        healthCount = new Counter("Healthy: ", "counter_green.png");
        immuneCount = new Counter("Immune: ", "counter_blue.png");
        sickCount = new Counter("Sick: ", "counter_red.png");
        deathCount = new Counter("Death: ", "counter_gray.png");
        infectedCount = new Counter("Infected: ", "counter_orange.png");

        addObject(healthCount, 56, 14);
        addObject(infectedCount, 179, 14);
        addObject(sickCount, 296, 14);
        addObject(immuneCount, 410, 14);
        addObject(deathCount, 521, 14);
        
        addObject(new Label("CovidSimulation", 30), Config.WORLD_WIDTH - 100, Config.WORLD_HEIGHT - 30);
        addObject(new Label("by bennetr", 25), Config.WORLD_WIDTH - 60, Config.WORLD_HEIGHT - 10);

        healthCount.setValue(Config.SPAWNCOUNT_HEALTHY);
        infectedCount.setValue(Config.SPAWNCOUNT_INFECTED);
    }

    /**
     * Returns a x position
     * @return a number between 0 and Config.WORLD_WIDTH
     */
    private int posx() {
        return Greenfoot.getRandomNumber(Config.WORLD_WIDTH);
    }

    /**
     * Returns a y position
     * @return a number between 0 and Config.WORLD_HEIGHT
     */
    private int posy() {
        return Greenfoot.getRandomNumber(Config.WORLD_HEIGHT);
    }
}