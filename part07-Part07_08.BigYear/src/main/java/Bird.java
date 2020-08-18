/**
 *
 * @author micheal
 */
public class Bird {
    private String name;
    private String nameLatin;
    private int observed;
    
    public Bird(String name, String latin){
        this.name = name;
        this.nameLatin = latin;
        this.observed = 0;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public void observed(){
        this.observed += 1;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.nameLatin + "): " + this.observed + " observations";
    }
    
    
}
