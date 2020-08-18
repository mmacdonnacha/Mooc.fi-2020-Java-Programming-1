import java.util.ArrayList;
/**
 *
 * @author micheal
 */
public class Package {
    private ArrayList<Gift> giftList;
    
    public Package(){
        this.giftList = new ArrayList<>();
    }
    
    
    public void addGift(Gift gift){
        giftList.add(gift);
    }
    
    public int totalWeight(){
        int weight = 0;
        
        for(Gift g : giftList){
            weight = weight + g.getWeight();
        }
        
        return weight;
    }
}
