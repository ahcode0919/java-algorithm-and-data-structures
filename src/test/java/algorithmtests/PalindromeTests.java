package algorithmtests;

import com.nns.algorithms.Palindrome;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Aaron H. on 3/29/16.
 */
public class PalindromeTests {
    @Test
    public void isPalindromeTest() {
        Assert.assertTrue(Palindrome.isPalindrome("I"));
        Assert.assertTrue(Palindrome.isPalindrome("ada"));
        Assert.assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void isAltPalindromeTest() {
        Assert.assertTrue(Palindrome.altIsPalindrome("I"));
        Assert.assertTrue(Palindrome.altIsPalindrome("ada"));
        Assert.assertFalse(Palindrome.altIsPalindrome("hello"));
    }
}
