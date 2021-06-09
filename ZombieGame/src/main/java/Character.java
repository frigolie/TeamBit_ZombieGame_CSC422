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
abstract class Character {
    // Attributes
    
    // Specifies type of chacter that has been created Zombie, Teacher, Etc.
    private String characterType;
    // Specifies specific instance of a type e.g. Zombie 1, Teacher 1, ZOmbie 2
    private String characterName;
    private int attack = 0;
    private int health = 0;

    // Abstract method to allow character to take damage
    abstract void takeDamage(int damage);
    
    // Method checks health to determine if character is dead
    public boolean isDead(){
        if (this.getHealth() <= 0){
            return true;
        } else {
            return false;
        }
    }
    
    // Getter Methods
    int getAttack(){
        return this.attack;
    }
    int getHealth(){
        return this.health;
    }
    String getName(){
        return this.characterName;
    }
    String getType(){
        return this.characterType;
    }
    
    
    // Setter Methods
    void setAttack(int a){
        this.attack = a;
    }
    void setHealth(int h){
        this.health = h;
    }
    void setName(String name){
        this.characterName = name;
    }
    void setType(String t){
        this.characterType = t;
    }
}
