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
    
    // Attributes
    
    // Tracks number of specific instances of each type of Survivor in party
    private int children = 0;
    private int soldiers = 0;
    private int teachers = 0;
     
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
                    party.add(new Soldier());
                    soldiers++;
                // 25% chance of to add teacher (NOTE: change if needed)
                } else if (randomNum >= 25 && randomNum < 50){
                    party.add(new Teacher());
                    teachers++;
                } else {
                // 50% chance of to add child (NOTE: change if needed)
                    party.add(new Child());
                    children++;
                }
            } 
    }
    
    // Getter methods for # of each type in party
    public int getChildren(){
        return this.children;
    }
    public int getSoldiers(){
        return this.soldiers;
    }
    public int getTeachers(){
        return this.teachers;
    }
}