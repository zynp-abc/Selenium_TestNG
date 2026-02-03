package freelancer.tests.day15_dataprovider;

import freelancer.pages.AmazonPage;
import freelancer.pages.CarRentalPage;
import freelancer.utilities.ConfigReader;
import freelancer.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C01_DataProviderTest {

    @DataProvider
    public static Object[][] products() {
        return new Object[][]{

                {"mouse"}, {"keyboard"}, {"testng"}
        };
    }


    @Test(dataProvider = "products")
    public void test01(String data) {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(data, Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(data));
    }


    @DataProvider
    public static Object[][] credentials() {
        return new Object[][]{

                {"ayhancan@cars.com", "Aa1234567!"},
                {"beyhancan@cars.com", "Aa1234567!"},
                {"ceyhancan@cars.com", "Aa1234567!"},
        };
    }

    @Test(dataProvider = "credentials")
    public void test02(String email, String password) {

        Driver.getDriver().get(ConfigReader.getProperty("carRentalUrl"));
        CarRentalPage carRentalPage = new CarRentalPage();
        carRentalPage.loginButton.click();
        carRentalPage.email.sendKeys(email);
        carRentalPage.password.sendKeys(password);
        carRentalPage.buttonOkey.click();
    }
}
