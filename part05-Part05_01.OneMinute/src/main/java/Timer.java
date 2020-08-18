/**
 *
 * @author micheal
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand secondsHundred;
            
    public Timer(){
        seconds = new ClockHand(60);
        secondsHundred = new ClockHand(100);
    }
    
    public void advance(){
        if(secondsHundred.value() == 99){
           secondsHundred.advance();
           seconds.advance();
        }else{
            secondsHundred.advance();
        }
    }
    
    @Override
    public String toString(){
        return seconds + ":" + secondsHundred;
    }
}
