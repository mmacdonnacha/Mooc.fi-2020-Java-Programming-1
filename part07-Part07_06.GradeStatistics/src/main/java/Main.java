
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades gradeList = new Grades();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        UserInterface ui = new UserInterface(scanner, gradeList);
        ui.start();
    }
}
