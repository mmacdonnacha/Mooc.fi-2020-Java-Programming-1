
import java.util.ArrayList;

/**
 *
 * @author micheal
 */
public class BirdDB {

    private ArrayList<Bird> database;

    public BirdDB() {
        database = new ArrayList<>();
    }

    public void add(Bird bird) {
        this.database.add(bird);
    }

    public void observation(String name) {
        // Observation - adds an observation 
        for (Bird b : this.database) {
            if (b.getName().equals(name)) {
                b.observed();
            }
        }
    }

    public void printAllBirds() {
        // All - prints all birds
        for (Bird b : this.database) {
            System.out.println(b);
        }

    }

    public void printOneBird(String name) {
        // One - prints one bird
        for (Bird b : this.database) {
            if (b.getName().equals(name)) {
                System.out.println(b);
            }
        }

    }

}
