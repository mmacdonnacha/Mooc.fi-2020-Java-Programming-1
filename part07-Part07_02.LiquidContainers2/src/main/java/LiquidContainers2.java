
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
                


        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] array = input.split(" ");
            String command = array[0];
            int amount = Integer.valueOf(array[1]);

            // add
            if (command.equals("add")) {
                first.add(amount);
                
            // move    
            }else if(command.equals("move")){     
                int amountToBeAdded = 0;
                if(first.contains() == amount){
                    amountToBeAdded = amount;                    
                }else if(amount > first.contains()){
                    amountToBeAdded = first.contains();
                }else{
                    amountToBeAdded = amount;
                }
                
                first.remove(amount);
                second.add(amountToBeAdded);
                
            // remove    
            }else if(command.equals("remove")){
                second.remove(amount);
            }
        }
    }

}
