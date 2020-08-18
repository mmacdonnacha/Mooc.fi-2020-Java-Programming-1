
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.Test;



/**
 *
 * @author miche
 */
public class ExerciseTest {
    
    private Exercise exercise;
  
    @Before
    public void initialize(){
        exercise = new Exercise("Testing");
    }
    
    @Test
    public void exerciseNameIsTesting(){
        assertEquals(exercise.getName(), "Testing");
    }
    
    @Test
    public void exerciseNameIsNotWalking(){
        assertNotEquals(exercise.getName(), "Walking");
    }

    @Test
    public void exerciseIsNotCompletedAtStart(){
        assertFalse(exercise.isCompleted());
    }
    
    
    @Test
    public void setCompletedToTrue(){
        exercise.setCompleted(true);
        assertTrue(exercise.isCompleted());
    }
    
}
