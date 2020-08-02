import java.util.Random;
import java.util.Scanner;

public class BlueDungeonArc {

    public static String replace(String oldStr, String newStr) {

        if(oldStr != newStr) {

            oldStr = newStr;

        }

        return oldStr;

    }

    public static void main(String[] args) {

        // System objects
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Game variables
        String[] earlyEnemies = {"Naked Skeleton", "Cursed Page", "Decaying Bone Soldier"};
        String[] mediumEnemies = {"Bone Wizard", "Bone Footman", "Bone Pikeman", "Cursed Book"};
        String[] lateEnemies = {"Bone Legionnaire", "Bone Assassin", "Cursed Bible"};
        int maxEnemyHealth = 20;
        int earlyEnemyAttackDamage = 5;
        int mediumEnemyAttackDamage = 15;
        int lateEnemyAttackDamage = 25;
        int enemyDamageTaken = 15;
        int enemyHealth = rand.nextInt(maxEnemyHealth);
        String enemy = earlyEnemies[rand.nextInt(earlyEnemies.length)];

        // Player variables
        int playerHealth = 50;
        int playerAttackDamage = 10;
        int healthPotion = 0;

        boolean running = true;
        String input;

        GAME:
        while(running) {

            System.out.println("\tYou wake up in a deep, dimly lit underground cavern.");

            while(true) {

                System.out.println("\n\tAction: ");
                System.out.println("\t1. You look around");
                System.out.println("\t2. You yell out for help");

                input = sc.nextLine();

                if(input.equals("1")) {

                    break;

                } else if (input.equals("2")) {


                    System.out.println("\tYour voice echoes into the endless dark void...");
                    System.out.println("\tNo one responds..");
                    System.out.println("\tYou seem to be alone.");

                }

            }

            System.out.println("\tYou look left.. then right.\n");
            System.out.println("\tYou see a large ruined wooden door in front of you.");
            System.out.println("\tYou proceed to enter through the decaying door.");
            System.out.println("\tInside you find a stony exterior that once would of looked exquisite " +
                    "had not the ravages of time taken its toil on it");
            System.out.println("\tThere was only one path that laid ahead with blue candles dimly lit on either side " +
                    "of the wall to illuminate the path people once took in this dungeon.");
            System.out.println("\tYou contemplate on what to do next.");

            while(true) {

                System.out.println("\n\tAction: ");
                System.out.println("\n\t1. Proceed further into the dungeon");
                System.out.println("\t2. Turn back");

                input = sc.nextLine();

                if(input.equals("1")) {

                    break;

                } else if (input.equals("2")) {

                    System.out.println("\tIt's took dark. You realised you wont be able to see anything so you turn back into the dungeon.");

                }

            }

            System.out.println("\tYou cautiously proceed forward into the dungeon, alone, unarmed and unaware of the dangers that lie ahead...");

            System.out.println("\t-------------------------------------------");
            System.out.println("\n\t----[ WELCOME TO THE BLUE DUNGEON ARC ]----\n");
            System.out.println("\t-------------------------------------------");

            System.out.println();
            System.out.println("\tYou continue to walk.");
            System.out.println("\tAnd walk.. and walk..");
            System.out.println("\tSuddenly, you hear groaning coming from the darkness before you.");
            System.out.println("\tYou take a deep breath and continue onwards.");

            System.out.println(("\n\t# A " + enemy + " has appeared! #\n"));

            System.out.println("\tOvercome with the fight or flight response.");
            System.out.println("\tYou look around for anything you could use to defend yourself with.");

            while(true) {

                System.out.println("\n\tAction: ");
                System.out.println("\t1. Pick up stick");
                System.out.println("\t2. Pick up pebbles");
                System.out.println("\t3. Use your fists");

                input = sc.nextLine();

                if(input.equals("1")) {

                    System.out.println("\tYou pick up the stick lying on the ground.\n");
                    System.out.println("\tArmed with the stick, you decide to get the jump on the enemy.");
                    break;

                } else if (input.equals("2")) {

                    System.out.println("\tYou begin to quickly gather a handful of pebbles from the ground.\n");
                    System.out.println("\tArmed with the pebbles, you begin to throw them at the enemy.");
                    break;

                } else if (input.equals("3")) {

                    System.out.println("\tYou decide your fists would be the best option against the enemy at hand.\n");
                    System.out.println("\tYou charge in roaring like a battle frenzied viking (at least in your mind).");
                    break;

                }

            }

            System.out.println("\tThe enemy releases a weird sound. You seemed to have damaged it.");
            System.out.println("\tYou continue with your attacks.");

            while(enemyHealth > 0) {

                System.out.println("\n\tEnemy's Health: " + (enemyHealth - 2));
                System.out.println("\tPlayer's Health: " + playerHealth);

                System.out.println("\n\t-[Inventory]-");
                System.out.println("\tHealth potions: " + healthPotion + " left.");

                System.out.println("\n\tAction: ");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");

                input = sc.nextLine();

                if(input.equals("1")) {

                    int damageDealt = rand.nextInt(playerAttackDamage);
                    int damageTaken = rand.nextInt(earlyEnemyAttackDamage);

                    enemyHealth -= damageDealt;
                    playerHealth -= damageTaken;

                    System.out.println("\tYou strike the " + enemy + " for " + damageDealt + " damage." );
                    System.out.println("\tYou took " + damageTaken + " damage from the " + enemy + ".");

                } else if (input.equals("2")) {

                    System.out.println("\tYou don't have any potions on you!");

                }

            }

            System.out.println("\n\tThe enemy has been defeated!\n");

            System.out.println("\tYou continue onwards.");

            THREEPATHS:
            while(true) {

                System.out.println("\n\tYou come upon a three way split in the dungeon path.");

                System.out.println("\n\tAction: ");
                System.out.println("\t1. Continue forward");
                System.out.println("\t2. Turn left");
                System.out.println("\t3. Turn right");
                input = sc.nextLine();

                if(input.equals("1")) {



                } else if(input.equals("2")) {

                    System.out.println("\n\tYou decide to turn left.");
                    System.out.println("\tYou begin to cautiously make your way down the path unknown.");
                    System.out.println("\tYou hear something...");
                    System.out.println("\n\t# A " + enemy + " has appeared! #");

                    while(enemyHealth > 0) {

                        System.out.println("\n\tEnemy's Health: " + (enemyHealth - 2));
                        System.out.println("\tPlayer's Health: " + playerHealth);

                        System.out.println("\n\t-[Inventory]-");
                        System.out.println("\tHealth potions: " + healthPotion + " left.");

                        System.out.println("\n\tAction: ");
                        System.out.println("\t1. Attack");
                        System.out.println("\t2. Drink health potion");

                        input = sc.nextLine();

                        if(input.equals("1")) {

                            int damageDealt = rand.nextInt(playerAttackDamage);
                            int damageTaken = rand.nextInt(earlyEnemyAttackDamage);

                            enemyHealth -= damageDealt;
                            playerHealth -= damageTaken;

                            System.out.println("\tYou strike the " + enemy + " for " + damageDealt + " damage." );
                            System.out.println("\tYou took " + damageTaken + " damage from the " + enemy + ".");

                        } else if (input.equals("2")) {

                            healthPotion -= 1;
                            System.out.println("You drank a health potion!");
                            playerHealth += 10;

                        }

                    }

                } else if(input.equals("3")) {

                    System.out.println("\n\tYou decide to turn right.");
                    System.out.println("\tYou walk for awhile, only to be met with a small room that seems to be a dead end.");
                    System.out.println("\tYou enter.");
                    System.out.println("\tThere is a dust riddled, cobweb coated chest in the center of the room.");

                    while(true) {

                        System.out.println("\n\tAction: ");
                        System.out.println("\t1. You open the chest");
                        System.out.println("\t2. You survey the room");
                        System.out.println("\t3. You turn back\n");
                        input = sc.nextLine();

                        if(input.equals("1")) {

                            System.out.println("\tYou cautiously pry open the chest.");
                            System.out.println("\n\t# You obtained a 3 health potions! #\n");

                            healthPotion += 3;

                            System.out.println("\tYou hurry back out so you can take another path.");

                            continue THREEPATHS;

                        } else if(input.equals("2")) {

                            System.out.println("\tYou notice nothing out of the ordinary.");

                        } else if(input.equals("3")) {

                            continue THREEPATHS;

                        }

                    }

                }


            }



        }

    }

}
