package freelancer.tests.day16_paralleltest_listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

@Listeners(freelancer.utilities.Listeners.class)

public class C03_ListenersTest {

    @Test
    public void test01() {
        System.out.println("test01 PASS");
        Assert.assertTrue(true);
    }

    @Test
    public void test02() {
        System.out.println("test02 FAIL");
        Assert.assertTrue(false);
    }

    @Test
    public void test03() {
        System.out.println("test03 SKIP");
        throw new SkipException("Test atlandı");
    }

    @Test
    public void test04() {
        System.out.println("test04 EXCEPTION");
        throw new NoSuchElementException("No Such Element");
    }


}
