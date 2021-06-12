/**
 * Creates of Party Object (collection) of the Survivor type
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
public class SurvivorParty extends Party{
    
    // Constructors
    // Default
    public SurvivorParty(){}
    
    // Generates a random Survivor party of specified size 
    // ************* NOTE: Functionality may be moved to BuildControl class if needed ***********
    public SurvivorParty(int partySize){
        
        for(int i=0; i < partySize; i++){
                
            // Random int generator 
            int randomNum = (int)(Math.random() * 100);  // 0 to 99

            // 25% chance of to add soldier (NOTE: change if needed)
            if(randomNum < 25){
                this.add(new Soldier());
            // 25% chance of to add teacher (NOTE: change if needed)
            } else if (randomNum >= 25 && randomNum < 50){
                this.add(new Teacher());
            } else {
            // 50% chance of to add child (NOTE: change if needed)
                this.add(new Child());
            }
        } 
    }

    @Override
    public int[] getPartyInfo() {
        int numberOfChildren = 0;
        int numberOfTeachers = 0;
        int numberOfSoldiers = 0;
        
        for (Character survivor : this) {
            if (survivor instanceof Child) {
                numberOfChildren++;
            } else if (survivor instanceof Teacher) {
                numberOfTeachers++;
            } else if (survivor instanceof Soldier) {
                numberOfSoldiers++;
            }
        }
        
        int[] partyInfo = {numberOfChildren, numberOfTeachers, numberOfSoldiers};
        return partyInfo;
    }
    
}