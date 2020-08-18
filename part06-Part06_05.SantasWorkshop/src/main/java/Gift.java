
/**
 *
 * @author micheal
 */
public class Gift {
    private String name;
    private int weight;
    
    public Gift(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return "Gift's name: " + this.name 
             + "\nGift's weight: " + this.weight
             + "\nGift: " + this.name + "(" + this.weight + " kg)";
    }
}
