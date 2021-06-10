
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
     * Will display info about which Characters are killed during a battle.
     * 
     * @param battleInfo 
     */
    public void displayBattleInfo(BattleInfo battleInfo) {
        //Implement in release 2.0
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
        
        System.out.println("We have " + numberOfSurvivors + " survivors trying "
                + "to make it to safety.");
        System.out.println("But there are " + numberOfZombies + " zombies "
                + "waiting for them.");
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
            System.out.println("It seems " + remainingSurvivors + " have made it to safety.");
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

