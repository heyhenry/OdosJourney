import java.util.Random;
import java.util.Scanner;

public class BlueDungeonArc {

    public static void main(String[] args) {

        // System objects
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Game variables
        String[] earlyEnemies = {"Naked Skeleton", "Cursed Pages", "Decaying Bone Soldier"};
        String[] mediumEnemies = {"Bone Wizard", "Bone Footman", "Bone Pikeman", "Cursed Book"};
        String[] lateEnemies = {"Bone Legionnaire", "Bone Assassin", "Cursed Bible"};
        int maxEnemyHealth = 20;
        int enemyAttackDamage = 5;
        int enemyDamageTaken = 15;

        // Player variables
        int playerHealth = 50;
        int playerAttackDamage = 1;

        boolean running = true;
        String input;

        GAME:
        while(running) {

            System.out.println("\t You wake up in a deep, dimly lit underground cavern.");

            while(true) {

                System.out.println("\n\t 1. You look around");
                System.out.println("\t 2. You yell out for help");

                input = sc.nextLine();

                if(input.equals("1")) {

                    break;

                } else if (input.equals("2")) {


                    System.out.println("\tYour voice echoes into the endless dark void...");
                    System.out.println("\tNo one responds..");
                    System.out.println("\tYou seem to be alone.");

                }

            }

            System.out.println("\tYou look left.. then right.");
            System.out.println("\tYou see a large ruined wooden door in front of you. \n You proceed to " +
                    "end through the decaying door. Inside you find rubble exterior that once would of looked " +
                    "exquisite had not the ravages of time taken its toil on it.\n There was only one path that laid head " +
                    "with blue water candles dimly lit on either side of the wall to illuminate the path people once took in this dungeon.\n " +
                    "You contemplate on what to do next.");

            while(true) {

                System.out.println("\n\t 1. Proceed further into the dungeon");
                System.out.println("\t 2. Turn back");

                input = sc.nextLine();

                if(input.equals("1")) {

                    break;

                } else if (input.equals("2")) {

                    System.out.println("It's took dark. You realised you wont be able to see anything so you turn back into the dungeon.");

                }

            }

            System.out.println("You cautiously proceed forward into the dungeon, alone, unarmed and unaware of the dangers that lie ahead...");

            System.out.println("\n--[ WELCOME TO THE BLUE DUNGEON ARC ]--\n");

            System.out.println("You continue to walk.\n And walk.. and walk...\n and walk.\n" +
                    " Suddenly, you hear groaning coming from the darkness in front of you. You take a deep break and " +
                    "continue onwards. A " + earlyEnemies[rand.nextInt(earlyEnemies.length)] + " appears before you!\n " +
                    "Stricken with the flight or fight response, you decide to fight. You look around for any objects lying around that " +
                    "you could use to defend yourself with.");

            while(true) {

                System.out.println("\n\t1. Pick up stick");
                System.out.println("\t 2. Pick up pebbles");
                System.out.println("\t 3. Use your fists");

                input = sc.nextLine();

                if(input.equals("1")) {

                    System.out.println("You pick up the stick lying on the ground.\nArmed with the stick you " +
                            "decide to get the jump on the enemy.");
                    break;

                } else if (input.equals("2")) {

                    System.out.println("You begin to quickly gather a handful of pebbles from the ground.\n Armed with the pebbles" +
                            "you begin to throw them at the enemy.");
                    break;

                } else if (input.equals("3")) {

                    System.out.println("You decide your fists would be the best option against the enemy at hand.\n " +
                            "You charge in roaring like a battle frenzied viking (at least in your mind).");
                    break;

                }

            }

            System.out.println("The enemy releases a weird sound. You seemed to have damaged it.\n" +
                    "You continue with your attacks.");

        }

    }

}
