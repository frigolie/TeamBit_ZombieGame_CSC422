package zombiegame.app.control;

import zombiegame.app.battle.BattleInfo;
import zombiegame.app.party.Party;

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
 * Control class for simulating battle and producing battle info for GameView.
 */
public class BattleControl {
    
    /**
     * Simulates battle and produces BattleInfo for GameView.
     * Initializes BattleInfo.
     * Survivor party attacks zombie party, the zombies attack survivors.
     * Loops until either party has no remaining characters.
     * 
     * @param parties array of Party objects, [SurvivorParty, ZombieParty]
     * @return BattleInfo, a list of attackers and casualties
     */
    public BattleInfo getBattleInfo(Party[] parties) {
        BattleInfo battleInfo = new BattleInfo();
        Party survivorParty = parties[0];
        Party zombieParty = parties[1];
        int remainingSurvivors;
        int remainingZombies;
        
        do {
            survivorParty.attack(zombieParty, battleInfo);
            zombieParty.attack(survivorParty, battleInfo);
            remainingSurvivors = survivorParty.getRemainingCharacters();
            remainingZombies = zombieParty.getRemainingCharacters();
        } while ((remainingSurvivors != 0) && (remainingZombies != 0));
        
        return battleInfo;
    }
    
}
