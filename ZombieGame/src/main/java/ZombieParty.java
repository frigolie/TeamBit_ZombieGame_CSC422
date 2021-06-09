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
    
    // Attributes
    
    // Tracks number of specific instances of each type of Zombie in party
    private int tanks = 0;
    private int commonInfected = 0;
    
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
                    party.add(new Tank());
                    tanks++;
     
                } else {
                    // 80% chance of to add CommonInfected (NOTE: change if needed)
                    party.add(new CommonInfected());
                    commonInfected++;
                }
            }
    }
    
    // Getter methods for # of each type in party
    public int getCommonInfected(){
        return this.commonInfected;
    }
    public int getTanks(){
        return this.tanks;
    }
}
