import java.util.ArrayList;
/**
 *
 * @author micheal
 */
public class Room {
    private ArrayList<Person> personList;
    
    public Room(){
        this.personList = new ArrayList<Person>();
    }
    
    public void add(Person person){
        personList.add(person);
    }
    
    public boolean isEmpty(){
        return this.personList.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.personList;
    }
    
    public Person shortest(){
        if (this.personList.isEmpty()) {
            return null;
        }

        Person shortest = this.personList.get(0);

        for (Person prs: this.personList) {
            if (shortest.getHeight() > prs.getHeight()) {
                shortest = prs;
            }
        }

        return shortest;
    }
    
    
    public Person take(){
        if (this.personList.isEmpty()) {
            return null;
        }
        
        Person p = shortest();
        this.personList.remove(p);
        
        return p;
    }
}
