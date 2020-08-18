
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        boolean alexLogin = name.equals("alex") && password.equals("sunshine");
        boolean emmaLogin = name.equals("emma") && password.equals("haskell");
        if(alexLogin || emmaLogin){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }
                
    }
}
