import java.util.ArrayList;
/**
 *
 * @author micheal
 */
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int time, ArrayList<String> ingredients){
        this.name = name;
        this.cookingTime = time;
        this.ingredients = ingredients;
                
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public int getCookingTime(){
        return this.cookingTime;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    @Override
    public String toString(){
        return this.name + ", cooking time: " + this.cookingTime ;
    }
}
