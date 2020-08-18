
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameLongest = "";
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] array = input.split(",");
            String name = array[0];
            int year = Integer.valueOf(array[1]);
            
            if(name.length() > nameLongest.length()){
                nameLongest = name;
            }
            
            sum += year;
            count++;
            
        }
        
        double averageYear = (1.0 * sum) / count;
        System.out.println("Longest name: " + nameLongest);
        System.out.println("Average of the birth years: " + averageYear);
    }
}
