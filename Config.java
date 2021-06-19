/**
 * This class is only for configuration.
 * For more Information see https://github.com/bennetrr/CovidSimulation#konfiguration
 * 
 * @author Bennet Ranft 
 * @version 11.06.2021
 */
public class Config {
    ///SECTION: Spawning
    // The height of the world (default: 500)
    public static final int WORLD_HEIGHT = 500;
    // The width of the world (default: 800)
    public static final int WORLD_WIDTH = 800;
    // How many healthy persons are spawned at the beginning (default: 20)
    public static final int SPAWNCOUNT_HEALTHY = 20;
    // How many infected persons are spawned at the beginning (default: 1)
    public static final int SPAWNCOUNT_INFECTED = 1;

    ///SECTION: Speed / Walking
    // The default speed of the animation (default: 50)
    public static final int DEFAULT_SPEED = 50;
    // How fast the persons a walking (default: 2.5)
    public static final double WALKING_SPEED = 2.5;
    // The time to wait after an (failed) infection to infect the same person again (in game ticks; 125 ticks = ca. 1s) (default: 100)
    public static final int INFECTION_TIMEOUT = 100;
    // The chance for the persons to make a random turn (default: 5)
    public static final double RANDOM_TURN_CHANCE = 5;
    // The maximal angle for a random turn in one direction (default: 20)
    public static final int RANDOM_TURN_ANGLE = 20;
    // The angle for a person to turn at an obstacle (default: 20)
    public static final int EDGE_TURN_ANGLE = 20;

    ///SECTION: Age
    // The minimum age of persons (default: 0)
    public static final int AGE_MIN = 0;
    // The maximum age of persons (default: 100)
    public static final int AGE_MAX = 100;
    // The maximum age to count as a child (default: 18)
    public static final int MAX_CHILD_AGE = 18;

    ///SECTION: Chances
    // The chance that a person older than MAX_CHILD_AGE years infects a other person (default: 1)
    public static final double R0 = 0.5;
    // The chance that a person younger than MAX_CHILD_AGE years infects a other person (default: 0.2)
    public static final double Rchild = 0.2;
    // How long it takes at least for an infected person to show symptoms or get immune (in game ticks; 125 ticks = ca. 1s) (default: 1750)
    public static final int INCUBATION_TIME = 1750;
    // The chance that a person gets immunity after being infected (default: 8.0)
    public static final double I_IMMUITY_CHANCE = 8.0;
    // The chance that a person gets sick after being infected (default: 5.0)
    public static final double DEASESE_CHANCE = 5.0;
    // How long a covid-disease takes at least (in game ticks; 125 ticks = ca. 1s) (default: 1500)
    public static final int DEASESE_TIME = 1500;
    // The chance that a person gets immunity after being sick (default: 5.0)
    public static final double S_IMMUITY_CHANCE = 5.0;
    // The chance that a person dies after being sick (default: 4.0)
    public static final double DEATH_CHANCE = 4.0;

    ///SECTION: Infection protection
    // Whether sick people should be put in quarantine (default: false)
    public static final boolean DO_QUARANTINE = true;
}
