
/**
 * Main Class for ZombieGame project
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
public class Main {

    /**
     * main function
     *
     * @param args
     */
    public static void main(String[] args) {

        // randomize number of character 
        int charaterNum = (int) (Math.random() * 30);

        // get all random charaters 
        Character[] characters = generate(charaterNum);

        // count each kind of character in the array
        int survivorNum = getSurvivorNum(characters);
        int zombieNum = getZombieNum(characters);

        int childNum = getCharacterNum(characters, new Child());
        int commonInfectedNum = getCharacterNum(characters,
                new CommonInfected());
        int soldierNum = getCharacterNum(characters, new Soldier());
        int tankNum = getCharacterNum(characters, new Tank());
        int teacherNum = getCharacterNum(characters, new Teacher());

        System.out.printf("We have %d survivors "
                + "trying to make it to safety"
                + " (%d children, %d teachers, %d soliders)\n",
                survivorNum, childNum, teacherNum, soldierNum);
        System.out.printf("But there are %d zombies waiting for them"
                + "(%d common infected, %d tanks)\n",
                zombieNum, commonInfectedNum, tankNum);

        // let them fight
        fight(characters);

        // count number of survivor 
        survivorNum = getSurvivorNum(characters);

        // show result
        if (survivorNum > 0) {
            System.out.printf("It seems %d have made it to safety\n",
                    survivorNum);
        } else {
            System.out.println("None of survivor made it");
        }
    }

    /**
     * count number of a certain class in the array which are alive
     *
     * @param characters the array
     * @param sample a sample object of a certain class
     * @return number of object which is the same class to the sample object
     */
    private static int getCharacterNum(Character[] characters,
            Character sample) {
        int counter = 0;
        for (Character character : characters) {
            if (character.getClass() == sample.getClass()
                    && character.getHealth() > 0) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * get number of alive object which is an instance of Survivor class
     *
     * @param characters
     * @return number of matched object
     */
    private static int getSurvivorNum(Character[] characters) {
        int counter = 0;
        for (Character character : characters) {
            if (character instanceof Survivor
                    && character.getHealth() > 0) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * get number of alive object which is an instance of Zombie class
     *
     * @param characters the array
     * @return number of matched object
     */
    private static int getZombieNum(Character[] characters) {
        int counter = 0;
        for (Character character : characters) {
            if (character instanceof Zombie && character.getHealth() > 0) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * fighting
     *
     * @param characters the array of object
     */
    private static void fight(Character[] characters) {
        while (runOutOfSurvivor(characters) == false
                && runOutOfZombie(characters) == false) {
            // survior attack first
            for (Character character : characters) {
                if (character instanceof Survivor) {
                    character.attack(characters);
                }
            }

            /// zombie attacks
            for (Character character : characters) {
                if (character instanceof Zombie) {
                    character.attack(characters);
                }
            }
        }

    }

    /**
     *
     * @param characters
     * @return true if all zombies are out of the fight
     */
    private static boolean runOutOfZombie(Character[] characters) {
        for (Character character : characters) {
            if (character instanceof Zombie) {
                if (character.getHealth() > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     *
     * @param characters
     * @return true if all survivors are out of the fight
     */
    private static boolean runOutOfSurvivor(Character[] characters) {
        for (Character character : characters) {
            if (character instanceof Survivor) {
                if (character.getHealth() > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * generate an array of random objects
     *
     * @param charaterNum size of the array
     * @return the array
     */
    private static Character[] generate(int charaterNum) {
        // program randomly generate an array of survior and zombies
        Character[] characters = new Character[charaterNum];

        for (int i = 0; i < characters.length; i++) {
            //Character character = characters[i];
            int type = (int) (Math.random() * 5);
            switch (type) {
                case 0:
                    characters[i] = new Child();
                    break;
                case 1:
                    characters[i] = new CommonInfected();
                    break;
                case 2:
                    characters[i] = new Soldier();
                    break;
                case 3:
                    characters[i] = new Tank();
                    break;
                default:
                    characters[i] = new Teacher();
                    break;
            }
        }
        return characters;
    }
}
