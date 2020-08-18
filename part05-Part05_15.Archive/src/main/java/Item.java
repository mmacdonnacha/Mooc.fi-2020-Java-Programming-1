/**
 *
 * @author micheal
 */
public class Item {
    private String identifier;
    private String name;
    
    public Item(String id, String name){
        this.identifier = id;
        this.name = name;
    }
    
    @Override
    public String toString(){
        return this.identifier + ": " + this.name;
    }
    
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Item)){
            return false;
        }
        
        Item item = (Item) compared;
        
        if(this.identifier.equals(item.identifier)){
            return true;
        }
        
        
        return false;
    }
}
