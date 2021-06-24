package zombiegame.ui;


import zombiegame.app.battle.Fatality;
import zombiegame.app.battle.BattleInfo;
import java.util.Scanner;

/**
 * GameView Class for ZombieGame project - Implements UI for game
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

/**
 * Displays info to user and turns user input into information the system can use.
 */
public final class GameView {
    
    private final Scanner input = new Scanner(System.in);
    
    public GameView() {}
    
    /**
     * Displays the name of each attacker-casualty pair from a battle.
     * 
     * @param battleInfo ArrayList of Fatality objects generated during battle
     */
    public void displayBattleInfo(BattleInfo battleInfo) {
        for (Fatality fatality : battleInfo) {
            String attacker = fatality.getAttacker();
            String casualty = fatality.getCasualty();
            System.out.printf("%s killed %s\n", attacker, casualty);
        }
    }
    
    /**
     * Displays the Party counts after they are first initialized.
     * 
     * @param survivorPartyInfo [numberOfChildren, numberOfTeachers, numberOfSoldiers]
     * @param zombiePartyInfo [numberOfCommonInfected, numberOfTanks]
     */
    public void displayPartyInfo(int[] survivorPartyInfo, int[] zombiePartyInfo) {
        int numberOfChildren = survivorPartyInfo[0];
        int numberOfTeachers = survivorPartyInfo[1];
        int numberOfSoldiers = survivorPartyInfo[2];
        int numberOfSurvivors = numberOfChildren + numberOfTeachers + numberOfSoldiers;
        
        int numberOfCommonInfected = zombiePartyInfo[0];
        int numberOfTanks = zombiePartyInfo[1];
        int numberOfZombies = numberOfCommonInfected + numberOfTanks;
        
        System.out.printf("We have %d survivors trying to make it to safety. "
                + "(%d children, %d teachers, and %d soldiers)\n", 
                numberOfSurvivors, numberOfChildren, numberOfTeachers, 
                numberOfSoldiers);
        System.out.printf("But there are %d zombies waiting for them. (%d "
                + "common infected, %d tanks)\n", numberOfZombies, 
                numberOfCommonInfected, numberOfTanks);
    }
    
    /**
     * Prints a message about how many survivors remain after a battle is completed.
     * 
     * @param remainingSurvivors the number of remaining survivors
     */
    public void displayRemainingSurvivors(int remainingSurvivors) {
        if (remainingSurvivors == 0) {
            System.out.println("None of the survivors made it.");
        } else {
            System.out.printf("It seems %d have made it to safety.\n", 
                    remainingSurvivors);
        }
    }
    
    /**
     * Asks player if they would like to play again.
     * Loops until player enters "y" or "n" (ignore case).
     * 
     * @return true if "y", false if "n"
     */
    public boolean playAgain() {
        do {
            System.out.print("Play again? (y/n) ");
            String selection = input.nextLine();

            if (selection.equalsIgnoreCase("y")) {
                return true;
            } else if (selection.equalsIgnoreCase("n")) {
                return false;
            }
        } while (true);
    }
    
}

