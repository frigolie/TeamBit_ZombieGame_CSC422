<<<<<<< Updated upstream:ZombieGame/src/main/java/zombiegame/app/character/Survivor.java
package zombiegame.app.character;
=======
>>>>>>> Stashed changes:ZombieGame/src/main/java/Survivor.java

/**
 * Subclass of Character for ZombieGame project - Superclass for Survivor type implementations
 */

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
 * Created 06/08/2021
 */
public class Survivor extends Character {

    private Weapon weapon;
    // there are 7 types of weapon
    private static Weapon[] weapons = {
        new Shotgun(), new SubmachineGun(),
        new AssaultRifle(), new Axe(), new Crowbar(),
        new FryingPan(), new Pistol()
    };

    public Survivor(String name, int health, int attack) {
        super(name, health, attack);
        weapon = weapons[(int) (Math.random() * weapons.length)];
    }

    /**
     * survivor could use weapon
     *
     * @return
     */
    @Override
    int getAttack() {
        return super.getAttack() + weapon.power();
    }

    /**
     * getter
     *
     * @return
     */
    public Weapon getWeapon() {
        return weapon;
    }

}
