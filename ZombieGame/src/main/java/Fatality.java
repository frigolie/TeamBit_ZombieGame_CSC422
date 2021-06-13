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
 * Contains the name of the attacker and casualty.
 * Generated by the Party classes and added to BattleInfo under the direction of BattleControl.
 */
class Fatality {
    private String attacker; // Name of Character that attacked
    private String casualty; // Name of Character killed by attacker
    
    public Fatality(String attacker, String casualty) {
        this.attacker = attacker;
        this.casualty = casualty;
    }
    
    public String getAttacker() {
        return this.attacker;
    }
    public void setAttacker(String attacker) {
        this.attacker = attacker;
    }
    
    public String getCasualty() {
        return this.casualty;
    }
    public void setCasualty(String casualty) {
        this.casualty = casualty;
    }
}
