
/**
 * Subclass of Character for ZombieGame project - Superclass for Zombie type implementations
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
public class Zombie extends Character {

    public Zombie(int health, int attack) {
        super(health, attack);
    }

    @Override
    public void attack(Character[] characters) {
        if (this.getHealth() > 0) {
            for (Character character : characters) {
                if (character instanceof Survivor) {
                    character.setHealth(
                            character.getHealth() - this.getAttack());
                }
            }
        }
    }

}
