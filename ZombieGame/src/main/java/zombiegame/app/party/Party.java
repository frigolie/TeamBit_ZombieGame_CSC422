package zombiegame.app.party;

/**
 * Party Class for ZombieGame project - Create collection of Character Objects
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

import zombiegame.app.character.Character;
import zombiegame.app.battle.Fatality;
import zombiegame.app.battle.BattleInfo;
import java.util.ArrayList; // import the ArrayList class
import zombiegame.app.character.Equippable;
import zombiegame.app.weapon.Weapon;

public abstract class Party<E extends Character> extends ArrayList<E> {
    
    // Default Constructor
    public Party(){}
    
    /**
     * Applies each attacker's {@code attack} to each defender's {@code health} 
     * and adds any resulting {@code Fatality} to {@code battleInfo}.
     * Dead attackers do not attack.
     * Attackers do not attack dead defenders.
     * For {@code Equippable} attacker, attempts to use {@code Weapon}.
     * If {@code Weapon} misses, no damage is applied to defender.
     * If {@code Weapon} hits, damage is applied to defender.
     * If {@code Weapon} results in {@code Fatality}, {@code Weapon}'s 
     * {@code name} is stored in new {@code Fatality}.
     * 
     * @param defendingParty {@code Party} to be attacked
     * @param battleInfo used to store resulting {@code Fatalities}
     */
    public void attack(Party<Character> defendingParty, BattleInfo battleInfo) {
        int attack; // attacker's attack
        int health; // defender's health
        String attackerName; // attacker's name
        String casualtyName; // killed defender's name
        String weaponName; // attacker's weapon's name
        boolean weaponUsed; // flags if a weapon is used successfully (damage > 0);
        Weapon weapon = new Weapon(0, 0, null); // attacker's weapon
        
        for (Character attacker : this) {
            if (!attacker.isDead()) {
                for (Character defender : defendingParty) {
                    if (!defender.isDead()) {
                        weaponUsed = false;
                        attack = attacker.getAttack();
                        health = defender.getHealth();
                        health -= attack;
                        if (attacker instanceof Equippable) {
                            weapon = ((Equippable) attacker).getWeapon();
                            int weaponDamage = weapon.useWeapon();
                            if (weaponDamage > 0) {
                                health -= weaponDamage;
                                weaponUsed = true;
                            }
                        }
                        defender.setHealth(health);
                        if (defender.isDead()) {
                            attackerName = attacker.getName();
                            casualtyName = defender.getName();
                            if (weaponUsed) {
                                weaponName = weapon.getName();
                            } else {
                                weaponName = null;
                            }
                            battleInfo.add(new Fatality(attackerName, 
                                    casualtyName, weaponName));
                        }
                    }
                }
            }
        }
    }
    
    /**
     * Gets number of each subtype of {@code E} in this {@code Party}.
     * Length of returned array = number of {@code E} subtypes in {@code Party}.
     * 
     * @return number of each subtype of {@code E} in this {@code Party}
     */
    public abstract int[] getPartyInfo();
    
    /**
     * Gets number of alive {@code Character}s in this {@code Party}.
     * 
     * @return number of alive {@code Character}s in this {@code Party}
     */
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
