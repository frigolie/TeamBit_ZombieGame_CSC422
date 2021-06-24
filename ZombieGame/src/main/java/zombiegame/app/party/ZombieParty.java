<<<<<<< Updated upstream:ZombieGame/src/main/java/zombiegame/app/party/ZombieParty.java
package zombiegame.app.party;

import zombiegame.app.character.Tank;
import zombiegame.app.character.Character;
import zombiegame.app.character.CommonInfected;
=======
>>>>>>> Stashed changes:ZombieGame/src/main/java/ZombieParty.java

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
public class ZombieParty extends Party {

    // Constructors
    // Default
<<<<<<< Updated upstream:ZombieGame/src/main/java/zombiegame/app/party/ZombieParty.java
    public ZombieParty(){}
    
=======
    public ZombieParty() {
    }

>>>>>>> Stashed changes:ZombieGame/src/main/java/ZombieParty.java
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
