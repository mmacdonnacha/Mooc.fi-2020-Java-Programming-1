import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author micheal
 */
public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        jokes = new ArrayList<>();
    }
    
    
    
    
    public void addJoke(String joke){
        // adds a joke to the manager.
        jokes.add(joke);
    }
    
    
    
    public String drawJoke(){
        // chooses one joke at random and returns it. 
        // It there are no jokes stored in the joke manager, 
        // the method should return the string "Jokes are in short supply.".
        String output = "";
        if(jokes.isEmpty()){
             output = "Jokes are in short supply.";
        }else{
            Random rand = new Random();
            int index = rand.nextInt(jokes.size());
            
            output = jokes.get(index);
        }
        
        return output;
    }
    
    
    public void printJokes(){
        // prints all the jokes stored in the joke manager.
        for(String s : jokes){
            System.out.println(s);
        }
    }

}
