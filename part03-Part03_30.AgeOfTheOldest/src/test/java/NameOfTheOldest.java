
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOldest = "";
        int ageOldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] array = input.split(",");
            String name = array[0];
            int age = Integer.valueOf(array[1]);
            
            if(age > ageOldest){
                nameOldest = name;
                ageOldest = age;
            }
            
        }
        
        System.out.println("Name of the oldest: " + nameOldest);
    }
}
