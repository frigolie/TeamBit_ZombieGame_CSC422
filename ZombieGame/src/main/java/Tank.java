/**
 * Tank Subclass of Character for ZombieGame project
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
public class Tank extends Zombie{
    
    // Attributes
    
    // Static variable to uniquely identitfy object
    private static int count = 1;
  
    public Tank(){
        setAttack(20);
        setHealth(150);
        setType("Tank");
        setName("Tank " + count);
        count++;
    };
}
