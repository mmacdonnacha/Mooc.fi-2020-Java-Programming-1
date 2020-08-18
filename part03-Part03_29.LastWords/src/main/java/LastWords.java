
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "NOTHING";
        
        while(!text.equals("")){
            text = scanner.nextLine();
            String[] arrayStr = text.split(" ");
            
            int lastIndex = arrayStr.length-1;
            System.out.println(arrayStr[lastIndex]);
        }
    }
}
