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
        int earlyEnemyAttackDamage = 5;
        int mediumEnemyAttackDamage = 15;
        int lateEnemyAttackDamage = 25;
        int enemyDamageTaken = 15;

        // Player variables
        int playerHealth = 50;
        int playerAttackDamage = 10;

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
            System.out.println("\tYou see a large ruined wooden door in front of you.\n\t You proceed to " +
                    "end through the decaying door. Inside you find rubble exterior that once would of looked " +
                    "exquisite had not the ravages of time taken its toil on it.\n\t There was only one path that laid head " +
                    "with blue water candles dimly lit on either side of the wall to illuminate the path people once took in this dungeon.\n\t " +
                    "You contemplate on what to do next.");

            while(true) {

                System.out.println("\n\t 1. Proceed further into the dungeon");
                System.out.println("\t 2. Turn back");

                input = sc.nextLine();

                if(input.equals("1")) {

                    break;

                } else if (input.equals("2")) {

                    System.out.println("\tIt's took dark. You realised you wont be able to see anything so you turn back into the dungeon.");

                }

            }

            System.out.println("\tYou cautiously proceed forward into the dungeon, alone, unarmed and unaware of the dangers that lie ahead...");

            System.out.println("-------------------------------------------");
            System.out.println("\n--[ WELCOME TO THE BLUE DUNGEON ARC ]--\n");
            System.out.println("-------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = earlyEnemies[rand.nextInt(earlyEnemies.length)];

            System.out.println("\tYou continue to walk.\n\t And walk.. and walk...\n\t and walk.\n\t" +
                    " Suddenly, you hear groaning coming from the darkness in front of you. You take a deep break and " +
                    "continue onwards. A " + enemy + " appears before you!\n\t " +
                    "Stricken with the flight or fight response, you decide to fight. You look around for any objects lying around that " +
                    "you could use to defend yourself with.");

            while(true) {

                System.out.println("\n\t1. Pick up stick");
                System.out.println("\t 2. Pick up pebbles");
                System.out.println("\t 3. Use your fists");

                input = sc.nextLine();

                if(input.equals("1")) {

                    System.out.println("\tYou pick up the stick lying on the ground.\n\t Armed with the stick you " +
                            "decide to get the jump on the enemy.");
                    break;

                } else if (input.equals("2")) {

                    System.out.println("\tYou begin to quickly gather a handful of pebbles from the ground.\n\t Armed with the pebbles" +
                            "you begin to throw them at the enemy.");
                    break;

                } else if (input.equals("3")) {

                    System.out.println("\tYou decide your fists would be the best option against the enemy at hand.\n\t " +
                            "You charge in roaring like a battle frenzied viking (at least in your mind).");
                    break;

                }

            }

            System.out.println("\tThe enemy releases a weird sound. You seemed to have damaged it.\n\t" +
                    "You continue with your attacks.");

            while(enemyHealth > 0) {

                System.out.println("\tEnemy's Health: " + (enemyHealth - 2));
                System.out.println("\tPlayer's Health: " + playerHealth);
                System.out.println("\tAction: ");
                System.out.println("\t 1. Attack");
                System.out.println("\t 2. Drink health potion");

                input = sc.nextLine();

                if(input.equals("1")) {

                    int damageDealt = rand.nextInt(playerAttackDamage);
                    int damageTaken = rand.nextInt(earlyEnemyAttackDamage);

                    enemyHealth -= damageDealt;
                    playerHealth -= damageTaken;

                    System.out.println("\t You strike the " + enemy + " for " + damageDealt + " damage." );
                    System.out.println("\t You took " + damageTaken + " damage from the " + enemy + ".");

                } else if (input.equals("2")) {

                    System.out.println("\tYou don't have any potions on you!");

                }

            }

            System.out.println("\tThe enemy has been defeated!");

        }

    }

}
