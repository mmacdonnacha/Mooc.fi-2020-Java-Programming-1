/**
 *
 * @author miche
 */
public class Door {
    private String sound;
    
    public Door() {
        this.sound = "Who's there?";
    }
    
    public void knock(){
        System.out.println(this.sound);
    }
}
