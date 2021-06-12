
/**
 * Character Super Class for ZombieGame project
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
public abstract class Character {

    private int health; // health amount 
    private int attack; /// attack power
    private int no; // number of order such as Tank 1, Child 1 .... 

    /**
     * constructor
     *
     * @param no
     * @param health
     * @param attack
     */
    public Character(int no, int health, int attack) {
        this.health = health;
        this.attack = attack;
        this.no = no;
    }

    /**
     * getter
     *
     * @return health
     */
    public int getHealth() {
        return health;
    }

    /**
     * getter
     *
     * @return attack
     */
    public int getAttack() {
        return attack;
    }

    /**
     * setter
     *
     * @param health new health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * getter
     *
     * @return number of order
     */
    public int getNo() {
        return no;
    }

    /**
     * abstract method which will be implemented in derived class
     *
     * @param characters
     */
    public abstract void attack(Character[] characters);
}
