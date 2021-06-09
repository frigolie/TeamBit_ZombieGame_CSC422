/**
 * CommonInfected Subclass for ZombieGame project
 */

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

public class CommonInfected extends Zombie{
    
    // Attributes
    
    // Static variable to uniquely identitfy object
    private static int count = 1;
    
    public CommonInfected(){
        setAttack(5);
        setHealth(30);
        setType("CommonInfected");
        setName("CommonInfected " + count);
        count++;
    };
}
