/**
 * Subclass of Character for ZombieGame project - Superclass for Zombie type implementations
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
public class Zombie extends Character{

    // Subtracts int parameters from Zombies health e.g. tank2.takeDamage(5)
    // Abstract method of parent Character class
    public void takeDamage(int damage){
        this.setHealth(this.getHealth() - damage);
    }
    
    public String toString(){
        return this.getType() + " Health:" + this.getHealth() + " Attack:" + this.getAttack();
    }
}
