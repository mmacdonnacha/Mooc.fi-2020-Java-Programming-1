import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeList recipeList = new RecipeList();
        
        
        UserInterface ui = new UserInterface(scanner, recipeList);
        ui.start();
    }

}
