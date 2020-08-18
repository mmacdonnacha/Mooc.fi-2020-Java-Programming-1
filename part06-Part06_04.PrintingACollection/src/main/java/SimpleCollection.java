
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    
    @Override
    public String toString(){
        String output = "";
        String word = "elements";
        
        if(this.elements.isEmpty()){
            output = "The collection " + this.name + " is empty.";
        }else{
            if(this.elements.size() == 1){
                word = "element";
            }
            
            output = "The collection " + this.name
                    + " has " + this.elements.size() + " " + word + ":";
            
            for(String s : this.elements){
                output = output + "\n" + s;
            }
        }
        
        
        
        return output;
    }
    
}
