package dsgnalgjavatests.chapter1tests;

import com.nns.dsgnalgjava.Chapter1;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by kase on 12/13/15.
 */
public class Chapter1Tests {
    @Test
    public void testInputAllBaseTypes() {
        testInputAllBaseTypes();
    }

    @Test
    public void testGameObjects() {
        Chapter1 c1 = new Chapter1();
        c1.gameObjects();
    }

    @Test
    public void isMultiple() {
        Chapter1 c1 = new Chapter1();
        Assert.assertTrue(c1.isMultiple(1000,10));
        Assert.assertFalse(c1.isMultiple(6, 5));
    }
}
