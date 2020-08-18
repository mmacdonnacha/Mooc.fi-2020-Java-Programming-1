/**
 *
 * @author micheal
 */
public class Cube {
    private int side;
    
    public Cube (int edgeLength){
        this.side = edgeLength;
    }
    
    public int volume(){
        return side * side * side;
    }
    
    @Override
    public String toString(){
        return "The length of the edge is " + side + " and the volume " + volume();
    }
    
}
