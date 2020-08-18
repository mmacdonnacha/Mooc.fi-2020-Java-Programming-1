import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author micheal
 */
public class UserInterface {
    private Scanner scanner;
    private Grades gradeList;
    
    
    public UserInterface(Scanner scanner, Grades grades){
        this.scanner = scanner;
        this.gradeList = grades;
    }
    
    
    public void start(){
        System.out.println("Enter point totals, -1 stops: ");
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1){
                break;
            }
            gradeList.add(number);
        }
        
        double average = gradeList.average();
        String averagePass = gradeList.averagePassing();
        double passPercentage = gradeList.passingPercentage();
        
        System.out.println("Point average (all): " + average);
        System.out.println("Point average (passing): " + averagePass);
        System.out.println("Pass percentage: " + passPercentage);
        System.out.println("Grade distribution: ");
        gradeList.printGradeDistribution();
    }    
}
