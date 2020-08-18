
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ArrayList<> list = new ArrayList<>();
        
        System.out.println("File: ");
        String fileName = scan.nextLine();
        
        System.out.println("Team: ");
        String teamName = scan.nextLine();

        int games = 0;
        int wins = 0;
        int lose = 0;
        
        try(Scanner scanner = new Scanner(Paths.get(fileName))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] array = line.split(",");
                
                String homeTeam = array[0];
                String awayTeam = array[1];
                int homePoints = Integer.valueOf(array[2]);
                int awayPoints = Integer.valueOf(array[3]);
                
                if(teamName.equals(homeTeam) || teamName.equals(awayTeam)){
                    games++;
                }
                
                if(teamName.equals(homeTeam)){
                    if(homePoints > awayPoints){
                        wins++;
                    }else{
                        lose++;
                    }
                }
                
                if(teamName.equals(awayTeam)){
                    if(homePoints < awayPoints){
                        wins++;
                    }else{
                        lose++;
                    }
                }
                
                
            }
        }catch(Exception e){
            System.out.println("Error: " + fileName);
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + lose);
    }

}
