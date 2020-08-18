
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Name: ");
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            Item item = new Item(input);
            items.add(item);
        }
        
        for(int i=0; i<items.size(); i++){
            System.out.println(items.get(i));
        }

    }
}
