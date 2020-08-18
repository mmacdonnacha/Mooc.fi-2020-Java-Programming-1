
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int getSquares(){
        return this.squares;
    }
    
    public int getPricePerSquare(){
        return this.pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.getSquares()){
            return true;
        }else{
            return false;
        }
    }
    
    public int priceDifference(Apartment compared){
        int priceThis = this.squares * this.pricePerSquare;
        int priceCompared = compared.getSquares() * compared.getPricePerSquare();
        return Math.abs(priceThis - priceCompared);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int priceThis = this.squares * this.pricePerSquare;
        int priceCompared = compared.getSquares() * compared.getPricePerSquare();
        
        return priceThis > priceCompared;
    }

}
