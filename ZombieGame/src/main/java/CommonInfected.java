
/**
 * CommonInfected Subclass for ZombieGame project
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
public class CommonInfected extends Zombie {

    // static number 
    private static int number = 1;

    /**
     * constructor
     */
    public CommonInfected() {
        super(number, 30, 5);
        number++;
    }

    /**
     *
     * @return name of the object
     */
    @Override
    public String toString() {
        return "Common Infected " + this.getNo();
    }
}
