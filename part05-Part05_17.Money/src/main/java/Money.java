
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    
    public Money plus(Money addition){
        int euro = this.euros + addition.euros();
        int cent = this.cents + addition.cents();
        
        return new Money(euro, cent);
    }
    
    public boolean lessThan(Money compared){
        if(this.euros < compared.euros()){
            return true;
        }else if(this.euros == compared.euros() && this.cents < compared.cents()){
            return true;
        }else{
            return false;
        }   
    }
    
    public Money minus(Money decreaser){
        Money newMoney;
        
        int euro = this.euros - decreaser.euros();
        int cent = this.cents - decreaser.cents();
        int money = (100 * euro) + cent;
        
        if(money < 0){
            newMoney = new Money(0, 0);
        }else{
            newMoney = new Money(0, money);
        }
        
        return newMoney;
    }

}
