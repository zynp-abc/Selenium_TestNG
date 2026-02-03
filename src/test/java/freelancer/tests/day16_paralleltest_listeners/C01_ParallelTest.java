package freelancer.tests.day16_paralleltest_listeners;

import freelancer.utilities.ConfigReader;
import freelancer.utilities.Driver;
import org.testng.annotations.Test;

public class C01_ParallelTest {

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("techproedUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("carRentalUrl"));
        Driver.quitDriver();
    }

    @Test
    public void test02() {

        Driver.getDriver().get(ConfigReader.getProperty("techproedUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("carRentalUrl"));
        Driver.quitDriver();


    }
}
