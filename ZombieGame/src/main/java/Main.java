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
public class Main {
    
    private static GameControl gameControl;
    
    public static void main(String[] args) {
        
        // Starts the main control sequence.
        // gameControl will construct the GameView
        gameControl = new GameControl();
        
        // ****************  NOTE TEST CODE delete when not needed ***************
        ZombieParty party = new ZombieParty(10);
        
        for(Character i : party){
            System.out.println(i.getName());
        }
        
        Party party2 = new SurvivorParty(10);
        
        for(Character i : party2){
            System.out.println(i.getName());
            
        }
        System.out.println(party.size());
        party.remove(2);
        
        System.out.println(party.size());
        
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        ZombieParty party3 = new ZombieParty();
        party3.add(t1);
        party3.add(t2);
        
        for(int i = 0; i < party3.size(); i++){
            System.out.println(party3.get(i).getName());
            
        }
        
        Tank t3 = new Tank();
        System.out.println(t3.getName() + "  H:" +  t3.getHealth());
        System.out.println(t3.isDead());
        t3.takeDamage(40);
        System.out.println(t3.getName() + "  H:" +  t3.getHealth());
        t3.takeDamage(400);
        System.out.println(t3.getName() + "  H:" +  t3.getHealth());
        System.out.println(t3.isDead());
        // NOTE END OF TEST CODE
        
    }
}

