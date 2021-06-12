
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

    /**
     * constructor
     *
     * @param no
     * @param health
     * @param attack
     */
    public Survivor(int no, int health, int attack) {
        super(no, health, attack);
    }

    /**
     * survivor attacks
     *
     * @param characters
     */
    @Override
    public void attack(Character[] characters) {
        // it should be alive first
        if (this.getHealth() > 0) {
            for (Character character : characters) {
                // aatack an alive zombie
                if (character instanceof Zombie && character.getHealth() > 0) {
                    character.setHealth(
                            character.getHealth() - this.getAttack());
                    // if the zombie is out ot the fight
                    // show a message
                    if (character.getHealth() <= 0) {
                        System.out.println("\t"
                                + this.toString()
                                + " killed " + character.toString());
                    }
                }
            }
        }
    }

}
