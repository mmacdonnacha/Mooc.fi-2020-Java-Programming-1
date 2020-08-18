import java.util.ArrayList;

/**
 *
 * @author micheal
 */
public class Grades {
    private ArrayList<Integer> gradeList;
    
    
    public Grades(){
        this.gradeList = new ArrayList<>();
    }
    
    public void add(int number){
        if(0 <= number && number <= 100){
            this.gradeList.add(number);
        }
    }
    
    
    public double average(){
        int sum = 0;
        for(int num : gradeList){
            sum += num;
        }
        
        return (1.0 * sum) / this.gradeList.size();
    }
    
    
    public String averagePassing(){
        int sumPass = 0;
        int countPass = 0;
                
        for(int num : gradeList){
            if(num >= 50){
                sumPass += num;
                countPass += 1;
            }
        }
        
        String avg = "";
        if(countPass == 0){
            avg = "-";
        }else{
            avg = "" + ((1.0 * sumPass) / countPass);
        }
        
        return avg;
    }

    public double passingPercentage(){
        int pass = 0;
        
        for(int num : gradeList){
            if(num >= 50){
                pass += 1;
            }
        }
        
        return 100 * ((1.0 * pass) / this.gradeList.size());
    }
    
    public void printGradeDistribution(){
        for(int i=5; i>=0; i--){
            String output = i + ": ";
            for(int grade : this.gradeList){
                if(checkGrade(grade) == i){
                    output = output + "*";
                }
            }
            
            System.out.println(output);
        }
    }
    
    public int checkGrade(int points){
        int grade = 0;
        
        if(points < 50){
            grade = 0;
        }else if(points < 60){
            grade = 1;
        }else if(points < 70){
            grade = 2;
        }else if(points < 80){
            grade = 3;
        }else if(points < 90){
            grade = 4;
        }else if(points >= 90){
            grade = 5;
        }
        
        return grade;
    }
}
