
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());
        
        if(number < 1){
            System.out.println("The number is not positive.");
        } else {
            System.out.println("the number is positive.");
        }
    }
}
