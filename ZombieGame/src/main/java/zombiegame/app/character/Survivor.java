/**
 * Team Project - ZombieGame
 * Concordia St. Paul - CSC 422
 * Team Bit
 * @author Amanda Perrine
 * @author Elise Frigoli
 * @author Jordan Duesterhoeft
 * @author Steven Wiltse
 * 
 * Created 06/08/2021
 */
package zombiegame.app.character;

import java.util.Random;
import zombiegame.app.weapon.Weapon;

/**
 * {@code Survivor} is an {@code Equippable Character}.
 */
public class Survivor extends Character implements Equippable{

    private Weapon weapon;

    public Survivor(String name, int health, int attack) {
        super(name, health, attack);
        equip();
    }

    /**
     * Equips a random {@code Weapon} from {@code Equippable.WEAPON_CACHE}.
     */
    @Override
    public void equip() {
        Random random = new Random();
        int numberOfWeapons = Equippable.WEAPON_CACHE.length;
        int weaponIndex = random.nextInt(numberOfWeapons);
        this.weapon = Equippable.WEAPON_CACHE[weaponIndex];
    }

    /**
     * Gets the currently equipped {@code Weapon}.
     * 
     * @return currently equipped {@code Weapon}
     */
    @Override
    public Weapon getWeapon() {
        return this.weapon;
    }

}
