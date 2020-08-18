
import java.util.ArrayList;

/**
 *
 * @author micheal
 */
public class RecipeList {

    private ArrayList<Recipe> list;

    public RecipeList() {
        this.list = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        this.list.add(recipe);
    }

    public void printAllRecipes() {
        for (Recipe r : this.list) {
            System.out.println(r);
        }
    }

    public void findByName(String name) {
        ArrayList<Recipe> found = new ArrayList<>();

        for (Recipe r : list) {
            if (r.getName().contains(name)) {
                found.add(r);
            }
        }

        printSpecificRecipes(found);

    }

    public void findByCookingTime(int time) {
        ArrayList<Recipe> found = new ArrayList<>();

        for (Recipe r : list) {
            if (time >= r.getCookingTime()) {
                found.add(r);
            }
        }

        printSpecificRecipes(found);

    }

    public void findByIngredient(String ingredient) {
        ArrayList<Recipe> found = new ArrayList<>();

        for (Recipe r : list) {
            if (r.getIngredients().contains(ingredient)) {
                found.add(r);
            }
        }

        printSpecificRecipes(found);

    }
    
    public void printSpecificRecipes(ArrayList<Recipe> list){
        for (Recipe r : list) {
            System.out.println(r);
        }
    }

}
