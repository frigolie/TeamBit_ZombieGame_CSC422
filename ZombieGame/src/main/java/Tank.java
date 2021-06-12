
/**
 * Tank Subclass of Character for ZombieGame project
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
public class Tank extends Zombie {

    // static number 
    private static int number = 1;

    /**
     * constructor
     */
    public Tank() {
        super(number, 150, 20);
        number++;
    }

    /**
     *
     * @return name of the object
     */
    @Override
    public String toString() {
        return "Tank " + this.getNo();
    }
}
