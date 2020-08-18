import java.util.ArrayList;
/**
 *
 * @author micheal
 */
public class Suitcase {
    private ArrayList<Item> itemList;
    private int maxWeight;
    
    public Suitcase(int weight){
        itemList = new ArrayList<>();
        this.maxWeight = weight;
    }
    
    public void addItem(Item item){
        if(maxWeight - item.getWeight() >= 0){
           itemList.add(item);
           maxWeight = maxWeight - item.getWeight();
        }
    }
    
    @Override
    public String toString(){
        int weight = 0;
        String output = "";
        
        if(itemList.isEmpty()){
            output = "no items (0 kg)";
        }else if(itemList.size() == 1){
            output = "1 item (" + itemList.get(0).getWeight() + " kg)";
        }else{
            for(Item item : itemList){
                weight = weight + item.getWeight();
            }
            
            output = itemList.size() + " items (" + weight + " kg)";
        }

        // x items (y kg)
        return output;
    }
    
    
    public void printItems(){
        for(Item item : itemList){
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public int totalWeight(){
        int weight = 0;
        for(Item item : this.itemList){
            weight = weight + item.getWeight();
        }
        
        return weight;
    }


    public Item heaviestItem(){
        
        if(itemList.isEmpty()){
            return null;
        }
        
        Item heavyItem = itemList.get(0);
        
        for(Item item : itemList){
            if(heavyItem.getWeight() < item.getWeight()){
                heavyItem = item;
            }
        }
        
        return heavyItem;
    }
}
