package zombiegame.app.weapon;

/**
 * Team Project - ZombieGame
 * Concordia St. Paul - CSC 422
 * Team Bit
 *
 * @author Amanda Perrine
 * @author Elise Frigoli
 * @author Jordan Duesterhoeft
 * @author Steven Wiltse
 *
 * Created 06/23/2021
 */
import java.text.NumberFormat;

public class Weapon {

    private int damage;
    private double accuracy;
    private String name;

    public Weapon(int damage, double accuracy, String name) {
        this.damage = damage;
        this.accuracy = accuracy;
        this.name = name;
    }

    public int useWeapon() {
        double rand = Math.random();
        if (rand > accuracy) {
            return 0;
        }
        return damage;
    }
    
    public String getName() { 
        return this.name;
    }

    @Override
    public String toString() {
        NumberFormat defaultFormat = NumberFormat.getPercentInstance();
        return name + " which has damage: " + damage
                + ", and accuracy: " + defaultFormat.format(accuracy);

    }

}
