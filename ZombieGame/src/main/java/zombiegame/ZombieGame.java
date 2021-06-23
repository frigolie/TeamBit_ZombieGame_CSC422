package zombiegame;

import zombiegame.app.control.GameControl;



/**
 * Main Class for ZombieGame project
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
public class ZombieGame {
    
    private static GameControl gameControl;
    
    public static void main(String[] args) {
        
        // Starts the main control sequence.
        // gameControl will construct the GameView
        gameControl = new GameControl();
        
    }
}

