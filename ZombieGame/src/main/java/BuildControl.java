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

/**
 * Control class for building new Party instances.
 */
public class BuildControl {
    
    /**
     * Builds the a SurvivorParty and a ZombieParty object and returns them as array.
     * Randomly generates the number of Characters of each type.
     * Initializes the Party objects.
     * Initializes the necessary Character objects.
     * Adds the Characters to the appropriate party.
     * 
     * @return Party[], [SurvivorParty, ZombieParty]
     */
    public Party[] build() {
        // Initialize amount of each Character type
        int numberOfChildren = ((int) (Math.random() * 100) % 15) + 1;
        int numberOfTeachers = ((int) (Math.random() * 100) % 10) + 1;
        int numberOfSoldiers = ((int) (Math.random() * 100) % 5) + 1;
        int numberOfCommonInfected = ((int) (Math.random() * 100) % 6) + 1;
        int numberOfTanks = ((int) (Math.random() * 100) % 2) + 1;
        
        // Initializes SurvivorParty
        Party survivorParty = new SurvivorParty();
        for (int i = 0; i < numberOfChildren; i++) {
            String name = "Child " + i;
            Child child = new Child(name);
            survivorParty.add(child);
        }
        for (int i = 0; i < numberOfTeachers; i++) {
            String name = "Teacher " + i;
            Teacher teacher = new Teacher(name);
            survivorParty.add(teacher);
        }
        for (int i = 0; i < numberOfSoldiers; i++) {
            String name = "Soldier " + i;
            Soldier soldier = new Soldier(name);
            survivorParty.add(soldier);
        }
        
        // Initializes ZombieParty
        Party zombieParty = new ZombieParty();
        for (int i = 0; i < numberOfCommonInfected; i++) {
            String name = "CommonInfected " + i;
            CommonInfected commonInfected = new CommonInfected(name);
            zombieParty.add(commonInfected);
        }
        for (int i = 0; i < numberOfTanks; i++) {
            String name = "Tank " + i;
            Tank tank = new Tank(name);
            zombieParty.add(tank);
        }
        
        // Creates and returns parties as array.
        Party[] parties = {survivorParty, zombieParty};
        
        return parties;
    }
    
}
