
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;


public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {
                
                String row = scanFile.nextLine();
                list.add(row);
            }
        } catch (Exception e) {
            System.out.println("Reading the file nonexistent.txt failed.");
        }  
        
        boolean found = false;
        for(String s : list){
            if(s.contains(searchedFor)){
                found = true;
            }
        }
        
        if(found){
            System.out.println("Found!");
        }else{
            System.out.println("Not found.");
        }

    }
}
