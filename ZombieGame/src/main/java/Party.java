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

import java.util.ArrayList; // import the ArrayList class
import java.util.Iterator;

public class Party implements Iterable<Character>{
    
    // Default Constructor
    public Party(){}
    
    // Create Arraylist of the Character Class to hold party
    protected ArrayList<Character> party = new ArrayList<Character>();

    
    // Allows party class to be iterable
    @Override
    public Iterator<Character> iterator() {
        return party.iterator();
    }
    
    // Methods add add,get,remove,size functionality to Party classes
    public void add(Character c){
        party.add(c);
    }
    public Character get(int i){
        return party.get(i);
    }
    public void remove(int index){
        party.remove(index);
    }
    public int size(){
        return party.size();
    }
        
}
