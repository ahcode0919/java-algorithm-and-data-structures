package algorithmtests;

import com.nns.algorithms.Fibonacci;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by kase on 12/13/15.
 */
public class FibonacciTests {
    @Test
    public void fibonacciTest() {
        Fibonacci f = new Fibonacci();
        Assert.assertTrue(f.getFibonacci(4, 6, 3) == 26);
    }

    @Test
    public void recursiveFibonacciTest(){
        Fibonacci f = new Fibonacci();
        int fnum = f.recursiveFibonacci(4,6,3);
        System.out.println(fnum);
        Assert.assertTrue(fnum == 26);
    }
}
