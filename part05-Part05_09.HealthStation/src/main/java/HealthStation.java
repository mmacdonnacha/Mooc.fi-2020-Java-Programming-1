
public class HealthStation {
    private int amountOfWeighing;

    public HealthStation(){
        this.amountOfWeighing = 0;
    }
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.amountOfWeighing = this.amountOfWeighing + 1;
        return person.getWeight();
    }
    
    public void feed(Person person){
        int newWeight = person.getWeight() + 1;
        person.setWeight(newWeight);
    }
    
    public int weighings(){
        return this.amountOfWeighing;
    }

}
