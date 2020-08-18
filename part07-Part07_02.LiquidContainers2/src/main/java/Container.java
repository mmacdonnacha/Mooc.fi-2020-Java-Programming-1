
/**
 *
 * @author micheal
 */
public class Container {
    private int capacity;
    
    public Container(){
        this.capacity = 0;
    }
    
    public int contains(){
        return this.capacity;
    }
    
    public void add(int amount){
        if(amount < 0){
            // do nothing with negative value
        }else{
            int newAmount = this.capacity + amount;
            if(newAmount > 100){
                this.capacity = 100;
            }else{
                this.capacity = newAmount;
            }
        }
    }
    
    public void remove(int amount){
        if(amount < 0){
            // do nothing with negative value
        }else{
            int newAmount = this.capacity - amount;
            if(newAmount < 0){
                this.capacity = 0;
            }else{
                this.capacity = newAmount;
            }
        }
    }
    
    @Override
    public String toString(){
        return this.capacity + "/100";
    }
}
