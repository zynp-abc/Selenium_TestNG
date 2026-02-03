package freelancer.tests.day14_pom;

import freelancer.utilities.Driver;
import org.testng.annotations.Test;

public class C05_ClassWork {

    @Test
    public void test01() {

        Driver.getDriver().get("https://www.bluerentalcars.com");
    }
}
