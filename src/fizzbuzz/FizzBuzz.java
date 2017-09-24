
package fizzbuzz;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {

    Integer number;
    Integer FIZZ_NUMBER = 3;
    Integer BUZZ_NUMBER = 5;
    
    public FizzBuzz(Integer number) {
        this.number = number;
    }

    public String evaluate() {
        Map evaluation = new HashMap() {{
            String FIZZ = "Fizz";
            String BUZZ = "Buzz";

            put(isFizz(), FIZZ);
            put(isBuzz(), BUZZ);
            put(isFizzBuzz(), FIZZ + BUZZ);
            put(isNonFizzBuzz(), nonFizzBuzzNumber());
        }};
        
        return (String) evaluation.get(true);
    }
    
    private String nonFizzBuzzNumber() {
        return this.number.toString();
    }
    
    private Boolean isNonFizzBuzz() {
        return !isFizz() && !isBuzz();
    }

    private Boolean isFizzBuzz() {
        return isFizz() && isBuzz();
    }
    
    private Boolean isFizz() {
        return ((this.number % this.FIZZ_NUMBER) == 0);
    }
    
    private Boolean isBuzz() {
        return ((this.number % this.BUZZ_NUMBER) == 0);
    }
}
