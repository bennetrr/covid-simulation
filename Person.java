import greenfoot.*;
import java.util.*;

/**
 * A person for the simulation
 */
public class Person extends Actor
{
    private int status, infectedTime, sickTime, cooldown;
    private final int age;
    private final double R;

    /**
     * @param infected Whether the person spawns infected or not
     */
    public Person(boolean infected) {
        if(infected) setStatus(1);
        else setStatus(0);
        infectedTime = 0;
        sickTime = 0;
        cooldown = 0;
        age = Greenfoot.getRandomNumber(Config.AGE_MAX - Config.AGE_MIN) + Config.AGE_MIN;
        if(age <= Config.MAX_CHILD_AGE) R = Config.Rchild;
        else R = Config.R0;
    }

    public void act() {
        checkStatus();
        walk();
        infect();
    }

    /**
     * Infect other people
     */
    private void infect() {
        if(status == 1 || status == 2 && !(status == 2 && Config.DO_QUARANTINE)) {
            List<Person> persons = getIntersectingObjects(Person.class);
            for(Person person:persons) {
                if(person != null) {
                    if(person.status == 0 && person.cooldown <= 0) {
                        if(getChance(R)) {
                            person.setStatus(1);
                            ((MyWorld) getWorld()).healthCount.add(-1);
                            ((MyWorld) getWorld()).infectedCount.add(1);
                            System.out.println("A person (" + age + ") is infected");
                        }
                        cooldown = Config.INFECTION_TIMEOUT;
                    }
                }
            }
        }
    }

    /**
     * Sets the status of the person and changes the image
     * @param status The new status:<br>
     *               0 - healthy<br>
     *               1 - infected<br>
     *               2 - sick<br>
     *               3 - immune<br>
     *               4 - death
     */
    private void setStatus(int status) {
        this.status = status;
        switch(status) {
            case 0:
            // healthy
            setImage("person_green.png");
            break;
            case 1:
            // infected
            setImage("person_orange.png");
            break;
            case 2:
            // sick
            setImage("person_red.png");
            break;
            case 3:
            // immune
            setImage("person_blue.png");
            break;
            case 4:
            // dead
            setImage("person_gray.png");
            break;
        }
    }

    /**
     * Checks for needed status changes
     */
    private void checkStatus() {
        if(cooldown > 0) cooldown--;

        if(status == 1) {
            infectedTime++;
            if(infectedTime >= Config.INCUBATION_TIME) {
                if(getChance(Config.I_IMMUITY_CHANCE / (age * infectedTime) * 100000)) {
                    // immune
                    System.out.println("A person (" + age + ") is immune");
                    ((MyWorld) getWorld()).infectedCount.add(-1);
                    ((MyWorld) getWorld()).immuneCount.add(1);
                    setStatus(3);
                } else if(getChance((age * Config.DEASESE_CHANCE * infectedTime) / 100000)) {
                    // sick
                    System.out.println("A person (" + age + ") is sick");
                    ((MyWorld) getWorld()).infectedCount.add(-1);
                    ((MyWorld) getWorld()).sickCount.add(1);
                    setStatus(2);
                }
            }
        }

        if(status == 2) {
            sickTime++;
            if(sickTime >= Config.DEASESE_TIME) {
                if(getChance((age * Config.DEATH_CHANCE * sickTime) / 100000)) {
                    System.out.println("A person (" + age + ") is dead");
                    //dead
                    ((MyWorld) getWorld()).sickCount.add(-1);
                    ((MyWorld) getWorld()).deathCount.add(1);
                    setStatus(4);
                } else if(getChance(Config.S_IMMUITY_CHANCE / (age * sickTime) * 100000)) {
                    System.out.println("A person (" + age + ") is immune");
                    // immune
                    ((MyWorld) getWorld()).sickCount.add(-1);
                    ((MyWorld) getWorld()).immuneCount.add(1);
                    setStatus(3);
                }
            }
        }
    }

    /**
     * Walk
     */
    private void walk() {
        if(status != 4 && !(status == 2 && Config.DO_QUARANTINE)) {
            if(getChance(Config.RANDOM_TURN_CHANCE)) turn(Greenfoot.getRandomNumber(Config.RANDOM_TURN_ANGLE * 2) - Config.RANDOM_TURN_ANGLE);
            if(isAtEdge()) turn(Config.EDGE_TURN_ANGLE);
            move();
        }
    }

    private void move() {
        double angle = Math.toRadians(getRotation());
        int x = (int) Math.round(getX() + Math.cos(angle) * Config.WALKING_SPEED);
        int y = (int) Math.round(getY() + Math.sin(angle) * Config.WALKING_SPEED);
        setLocation(x, y);
    }

    public int getAge() {
        return age;
    }

    public int getStatus() {
        return status;
    }

    public boolean getChance(double chance) {
        return Greenfoot.getRandomNumber(99) < chance;
    }
}
