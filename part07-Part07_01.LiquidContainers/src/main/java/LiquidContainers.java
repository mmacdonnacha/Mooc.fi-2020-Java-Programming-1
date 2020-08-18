
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int fullCapacity = 100;

        while (true) {
            System.out.println("First: " + first + "/" + fullCapacity);
            System.out.println("Second: " + second + "/" + fullCapacity);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] array = input.split(" ");
            String command = array[0];
            int amount = Integer.valueOf(array[1]);

            // add
            if (command.equals("add")) {
                if (amount < 0) {
                    // do nothing, cannot have negative liquid
                } else {
                    int newAmount = first + amount;
                    if (newAmount > fullCapacity) {
                        first = fullCapacity;
                    } else {
                        first = newAmount;
                    }
                }
                
            // move    
            }else if(command.equals("move")){
                if (amount < 0) {
                    // do nothing, cannot have negative liquid
                } else {
                                        
                    // second container
                    if(amount > first){
                        amount = first;
                    }
                    
                    int newSecondAmount = second + amount;
                    
                    if (newSecondAmount > fullCapacity) {
                        second = fullCapacity;
                    } else {
                        second = newSecondAmount;
                    }
                    
                      
                    // first container                
                    if (amount > first) {
                        first = 0;
                    } else {
                        first = first - amount;
                    }
                }
                
            // remove    
            }else if(command.equals("remove")){
                if (amount < 0) {
                    // do nothing, cannot have negative liquid
                } else {
                    int newAmount = second - amount;
                    if (newAmount < 0) {
                        second = 0;
                    } else {
                        second = newAmount;
                    }
                }
            }

        }
    }

}
