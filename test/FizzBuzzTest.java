
import fizzbuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }
    
    @Test
    public void returnsTheNumberForANonFizzBuzzNumber() {
        Integer nonFizzBuzzNumber = 1;
        FizzBuzz fizzBuzz = new FizzBuzz(nonFizzBuzzNumber);
        
        String evaluation = fizzBuzz.evaluate();
        
        assertEquals("1", evaluation);
    }
    
    @Test
    public void returnsFizzForAFizzNumber() {
        Integer fizzNumber = 3;
        FizzBuzz fizzBuzz = new FizzBuzz(fizzNumber);
        
        String evaluation = fizzBuzz.evaluate();
        
        assertEquals("Fizz", evaluation);
    }
    
    @Test
    public void returnsBuzzForABuzzNumber() {
        Integer buzzNumber = 5;
        FizzBuzz fizzBuzz = new FizzBuzz(buzzNumber);
        
        String evaluation = fizzBuzz.evaluate();
        
        assertEquals("Buzz", evaluation);
    }
    
    @Test
    public void returnsFizzBuzzForAFizzBuzzNumber() {
        Integer fizzBuzzNumber = 15;
        FizzBuzz fizzBuzz = new FizzBuzz(fizzBuzzNumber);
        
        String evaluation = fizzBuzz.evaluate();
        
        assertEquals("FizzBuzz", evaluation);
    }
}
