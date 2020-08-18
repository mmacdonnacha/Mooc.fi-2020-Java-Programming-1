import java.util.ArrayList;
/**
 *
 * @author micheal
 */
public class Hold {
    private ArrayList<Suitcase> hold;
    private int maximumWeight;
    
    public Hold(int maxWeight){
        this.maximumWeight = maxWeight;
        this.hold = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(maximumWeight - suitcase.totalWeight() >= 0){
           hold.add(suitcase);
           maximumWeight = maximumWeight - suitcase.totalWeight();
        }
    }
    
    @Override
    public String toString(){ 
        //"x suitcases (y kg)"
        int weight = 0;
        String output = "";
        
        if(hold.isEmpty()){
            output = "no suitcases (0 kg)";
        }else if(hold.size() == 1){
            output = "1 suitcase (" + hold.get(0).totalWeight() + " kg)";
        }else{
            for(Suitcase suitcase : hold){
                weight = weight + suitcase.totalWeight();
            }
            
            output = hold.size() + " suitcases (" + weight + " kg)";
        }

        return output;
    }
    
    
    public void printItems(){
        for(Suitcase s : hold){
            s.printItems();
        }
    }
}
