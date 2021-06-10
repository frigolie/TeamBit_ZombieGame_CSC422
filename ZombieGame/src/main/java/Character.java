/**
 * Character Super Class for ZombieGame project
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
public class Character {
    // Attributes
    private String name;
    private int attack = 0;
    private int health = 0;
    
    public Character(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    // Method to allow character to take damage
    public void takeDamage(int damage){
        this.health -= damage;
    }
    
    // Method checks health to determine if character is dead
    public boolean isDead(){
        return this.health <= 0;
    }
    
    // Getter Methods
    int getAttack(){
        return this.attack;
    }
    int getHealth(){
        return this.health;
    }
    String getName(){
        return this.name;
    }
    
    
    // Setter Methods
    void setAttack(int a){
        this.attack = a;
    }
    void setHealth(int h){
        this.health = h;
    }
    void setName(String name){
        this.name = name;
    }
    
    @Override
    public String toString(){
        return this.name + " Health:" + this.health + " Attack:" + this.attack;
    }
    
}
