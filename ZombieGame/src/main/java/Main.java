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

    public static void main(String[] args) {

        int charaterNum = (int) (Math.random() * 30);
        Character[] characters = generate(charaterNum);
        int survivorNum = getSurvivorNum(characters);
        int zombieNum = getZombieNum(characters);
        System.out.printf("We have %d survivors "
                + "trying to make it to safety\n", survivorNum);
        System.out.printf("But there are %d zombie waiting for them.\n",
                zombieNum);
        fight(characters);

        survivorNum = getSurvivorNum(characters);

        if (survivorNum > 0) {
            System.out.printf("It seems %d have made it to safety\n",
                    survivorNum);
        } else {
            System.out.println("None of survivors made it");
        }
    }

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

    private static int getZombieNum(Character[] characters) {
        int counter = 0;
        for (Character character : characters) {
            if (character instanceof Zombie && character.getHealth() > 0) {
                counter++;
            }
        }
        return counter;
    }

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

    private static Character[] generate(int charaterNum) {
        // program randomly generate an array of survior and soombies
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

