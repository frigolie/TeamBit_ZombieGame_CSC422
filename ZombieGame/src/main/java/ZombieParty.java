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
public class ZombieParty extends Party{
    
    // Constructors
    // Default
    public ZombieParty(){}
    
    // Generates a random Zombie party of specified size 
    // ************* NOTE: Functionality may be moved to BuildControl class if needed ***********
    public ZombieParty(int partySize){
        
        for(int i=0; i < partySize; i++){
            // Random int generator 
            int randomNum = (int)(Math.random() * 100);  // 0 to 9

            if(randomNum < 20){
                // 20% chance of to add Tank (NOTE: change if needed)
                this.add(new Tank());
            } else {
                // 80% chance of to add CommonInfected (NOTE: change if needed)
                this.add(new CommonInfected());
            }
        }
    }
    
    @Override
    public int[] getPartyInfo() {
        int numberOfCommonInfected = 0;
        int numberOfTanks = 0;
        
        for (Character survivor : this) {
            if (survivor instanceof CommonInfected) {
                numberOfCommonInfected++;
            } else if (survivor instanceof Tank) {
                numberOfTanks++;
            }
        }
        
        int[] partyInfo = {numberOfCommonInfected, numberOfTanks};
        return partyInfo;
    }
    
}
