/**
 *
 * @author micheal
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }
    
    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably() {
        double cost = 2.60;
        
        if(this.balance - cost >= 0){
            this.balance = this.balance - cost;
        }
        
    }

    public void eatHeartily() {
        double cost = 4.60;
        
        if(this.balance - cost >= 0){
            this.balance = this.balance - cost;
        }
    }
    
    public void addMoney(double amount){
        double newAmount = this.balance + amount;
        if(amount > 0){
            if(newAmount > 150){
                this.balance = 150;
            }else{
                this.balance = newAmount;
            }
        }   
    }
}
