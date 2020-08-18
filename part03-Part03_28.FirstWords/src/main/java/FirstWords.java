
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "NOTHING";
        
        while(!text.equals("")){
            text = scanner.nextLine();
            String[] arrayStr = text.split(" ");
            
            System.out.println(arrayStr[0]);
        }
    }
}
