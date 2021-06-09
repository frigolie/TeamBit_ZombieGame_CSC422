/**
 * Child Subclass of Character for ZombieGame project
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

public class Child extends Survivor{
    
    // Attributes
    
    // Static variable to uniquely identitfy object
    private static int count = 1;
    
    // Construtor 
    public Child(){
        setAttack(2);
        setHealth(20);
        setType("Child");
        setName("Child " + count);
        count++;
    };
    
}
