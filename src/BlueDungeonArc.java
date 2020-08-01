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

        // Player variables
        int playerHealth = 50;
        int playerAttackDamage = 1;

        boolean running = true;
        String input;

        GAME:
        while(running) {

            System.out.println("Welcome to Odo's Journey: Blue Dungeon Arc!");

            System.out.println("--------------------------------------------");

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

        }

    }

}
