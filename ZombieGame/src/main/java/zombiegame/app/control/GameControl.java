package zombiegame.app.control;


import zombiegame.app.battle.BattleInfo;
import zombiegame.app.party.Party;
import zombiegame.ui.GameView;

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
 * Main control class that separates GameView from the rest of the classes.
 */
public final class GameControl {
    
    private Party[] parties; // [SurvivorParty, ZombieParty]
    private int[] survivorPartyInfo; // [numberOfChildren, numberOfTeachers, numberOfSoldiers]
    private int[] zombiePartyInfo; // [numberOfCommonInfected, numberOfTanks]
    private BattleInfo battleInfo;
    private int remainingSurvivors;
    
    /**
     * Constructor contains the main program loop.
     * This is constructed by Main and controls the program until player exits.
     * Directs BuildControl to build parties.
     * Directs BattleControl to start the battle sequence.
     * Requests user input from GameView.
     * Sends data to GameView for display to the player.
     */
    public GameControl() {
        GameView gameView = new GameView();
        do {
            this.parties = buildParties();
            this.survivorPartyInfo = parties[0].getPartyInfo();
            this.zombiePartyInfo = parties[1].getPartyInfo();
            gameView.displayPartyInfo(survivorPartyInfo, zombiePartyInfo);
            this.battleInfo = battle();
            gameView.displayBattleInfo(battleInfo);
            this.remainingSurvivors = parties[0].getRemainingCharacters();
            gameView.displayRemainingSurvivors(remainingSurvivors);
        } while (gameView.playAgain());
    }
    
    /**
     * Constructs BuildControl and starts the build() operation.
     * 
     * @return an array containing the two parties [SurvivorParty, ZombieParty]
     */
    public Party[] buildParties() {
        BuildControl buildControl = new BuildControl();
        return buildControl.build();
    }
    
    /**
     * Contructs BattleControl and starts the getBattleInfo() operation.
     * 
     * @return battleInfo
     */
    public BattleInfo battle() {
        BattleControl battleControl = new BattleControl();
        return battleControl.getBattleInfo(this.parties);
    }
    
}