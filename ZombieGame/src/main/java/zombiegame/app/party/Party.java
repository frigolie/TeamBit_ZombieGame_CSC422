package zombiegame.app.party;

/**
 * Party Class for ZombieGame project - Create collection of Character Objects
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

import zombiegame.app.character.Character;
import zombiegame.app.battle.Fatality;
import zombiegame.app.battle.BattleInfo;
import java.util.ArrayList; // import the ArrayList class

public abstract class Party extends ArrayList<Character> {
    
    // Default Constructor
    public Party(){}
    
    public void attack(Party defendingParty, BattleInfo battleInfo) {
        int attack;
        int health;
        String attackerName;
        String casualtyName;
        
        for (Character attacker : this) {
            if (!attacker.isDead()) {
                for (Character defender : defendingParty) {
                    if (!defender.isDead()) {
                        attack = attacker.getAttack();
                        health = defender.getHealth();
                        health -= attack;
                        defender.setHealth(health);
                        if (defender.isDead()) {
                            attackerName = attacker.getName();
                            casualtyName = defender.getName();
                            battleInfo.add(new Fatality(attackerName, casualtyName));
                        }
                    }
                }
            }
        }
    }
    
    public abstract int[] getPartyInfo();
    
    public int getRemainingCharacters() {
        int remainingCharacters = 0;
        
        for (Character character : this) {
            if (!character.isDead()) {
                remainingCharacters++;
            }
        }
        return remainingCharacters;
    }
}
