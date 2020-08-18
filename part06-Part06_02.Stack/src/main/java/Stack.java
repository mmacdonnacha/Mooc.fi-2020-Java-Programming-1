import java.util.ArrayList;
/**
 *
 * @author micheal
 */
public class Stack {
    private ArrayList<String> stack;
    
    public Stack(){
        stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.stack.isEmpty();
    }
    
    public void add(String value){
        stack.add(0, value);
    }
    
    public ArrayList<String> values(){
        return this.stack;
    }
    
    public String take(){
        String top = stack.get(0);
        stack.remove(0);
        
        return top;
    }
}
