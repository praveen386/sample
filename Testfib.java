import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class SumOfEvenNumberOfFibonacciNumbersFrom{

    @Test
    public void  TestsumOfEvenNumbersOfFibonacciNumbersUpto(int fibonacciTermsLimt){

        assertEquals(253236, new SumOfEvenTermsOfFibonacciNumbersStartFrom(1,2).sumOfEvenTermsOfFibonacciNumbersUpTo(4000000));
        
    }
}

st
