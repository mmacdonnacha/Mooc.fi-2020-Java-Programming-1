
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author micheal
 */
public class UserInterface {

    private Scanner scanner;
    private RecipeList recipeList;
    ArrayList<String> inputs;

    public UserInterface(Scanner scanner, RecipeList recipes) {
        this.scanner = scanner;
        this.recipeList = recipes;
        inputs = new ArrayList<>();
    }

    public void start() {
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        processFile(file);

        System.out.println("\nCommands: ");
        System.out.println("list - list the recipes");
        System.out.println("stop - stop the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }     

            if (command.equals("list")) {
                System.out.println("\nRecipes:");
                System.out.println();

                recipeList.printAllRecipes();       
            }            
            
            if(command.equals("find name")){
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                
                System.out.println("\nRecipes:");
                recipeList.findByName(name);
            }
            
            if(command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                
                System.out.println("\nRecipes:");
                recipeList.findByCookingTime(time);
            }
            
            if(command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                
                System.out.println("\nRecipes:");
                recipeList.findByIngredient(ingredient);
            }
            

        }

    }

    public void processFile(String fileName) {
        try (Scanner scan = new Scanner(Paths.get(fileName))) {

            while (scan.hasNextLine()) {

                String line = scan.nextLine();

                if (line.isEmpty()) {
                    addRecipe(inputs);
                    inputs.clear();
                    continue;
                }

                inputs.add(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            addRecipe(inputs);
        }
    }

    public void addRecipe(ArrayList<String> recipe) {
        String name = recipe.get(0);
        int time = Integer.valueOf(recipe.get(1));

        ArrayList<String> ingredients = new ArrayList<>();
        for (int i = 2; i < recipe.size(); i++) {
            ingredients.add(recipe.get(i));
        }

        recipeList.add(new Recipe(name, time, ingredients));
    }

}
