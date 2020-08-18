
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author micheal
 */
public class UserInterface {

    private Scanner scanner;
    private BirdDB database;

    public UserInterface(Scanner scanner, BirdDB database) {
        this.scanner = scanner;
        this.database = database;

    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            // Quit - ends the program
            if (command.equals("Quit")) {
                break;
            }

            // Add - adds a bird
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                
                System.out.print("Name in Latin: ");
                String latin = scanner.nextLine();
                
                this.database.add(new Bird(name, latin));
            }

            // Observation - adds an observation
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                this.database.observation(name);
            }

            // All - prints all birds
            if (command.equals("All")) {
                this.database.printAllBirds();
            }

            // One - prints one bird
            if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                this.database.printOneBird(name);
            }

        }

    }

}
