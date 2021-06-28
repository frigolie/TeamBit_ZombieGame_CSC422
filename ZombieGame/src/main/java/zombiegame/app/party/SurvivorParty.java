package zombiegame.app.party;

import zombiegame.app.character.Child;
import zombiegame.app.character.Soldier;
import zombiegame.app.character.Teacher;
import zombiegame.app.character.Character;
import zombiegame.app.character.Survivor;

/**
 * Creates of Party Object (collection) of the Survivor type
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
public class SurvivorParty extends Party<Survivor> {
    
    // Constructors
    // Default
    public SurvivorParty(){}

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
