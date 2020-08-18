import java.util.ArrayList;
/**
 *
 * @author micheal
 */
public class TodoList {
    private ArrayList<String> todo;
    
    public TodoList(){
        todo = new ArrayList<>();
    }
    
    public void add(String task){
        todo.add(task);
    }
    
    public void print(){
        for(int i=0; i<todo.size(); i++){
            System.out.println((i+1) + ": " + todo.get(i));
        }
    }
    
    public void remove(int number){
        todo.remove(number-1);
    }
}
