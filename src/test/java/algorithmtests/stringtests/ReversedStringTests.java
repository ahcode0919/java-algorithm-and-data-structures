package algorithmtests.stringtests;

import com.nns.algorithms.strings.Reverse;
import com.nns.helpers.HelperFunctions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.xml.dom.Reflect;

import java.lang.reflect.Method;

/**
 * Created by Aaron H. on 4/5/16.
 */
public class ReversedStringTests {
    String testString;
    long startTime;

    @BeforeMethod
    public void beforeMethod() {
        testString = new String(HelperFunctions.generateRandomCharArray(10000000));
        startTime = System.currentTimeMillis();
    }

    @AfterMethod
    public void afterMethod(Method method) {
        System.out.println(method.getName() + " Test time: " + (System.currentTimeMillis() - startTime) + " ms");
    }

    @Test
    public void reverseCharArrayTest() {
        String reversed = Reverse.reverseCharArray(testString);
        String reversedTest = Reverse.reverseStringBuilderReverse(testString);
        Assert.assertEquals(reversed,reversedTest);
    }

    @Test
    public void reverseInPlaceTest() {
        String reversed = Reverse.reverseInPlace(testString);
        String reversedTest = Reverse.reverseStringBuilderReverse(testString);
        Assert.assertEquals(reversed,reversedTest);
    }

    @Test
    public void reverseInPlaceNoSwapTest() {
        String reversed = Reverse.reverseInPlaceNoSwap(testString);
        String reversedTest = Reverse.reverseStringBuilderReverse(testString);
        Assert.assertEquals(reversed,reversedTest);
    }

    @Test
    public void reverseStringBuilder() {
        String reversed = Reverse.reverseStringBuilder(testString);
        String reversedTest = Reverse.reverseStringBuilderReverse(testString);
        Assert.assertEquals(reversed,reversedTest);
    }

    @Test
    public void reverseStringBuilderReverseTest() {
        String reversed = Reverse.reverseStringBuilderReverse(testString);
        String reversedTest = Reverse.reverseStringBuilderReverse(testString);
        Assert.assertEquals(reversed,reversedTest);
    }
}
