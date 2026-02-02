package Freelancer.tests.day14_pom;

import Freelancer.pages.OpenSourcePage;
import Freelancer.utilities.ConfigReader;
import Freelancer.utilities.Driver;
import Freelancer.utilities.ReusableMethods;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_PropertiesTest {

    WebDriver driver;

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("opensourceUrl"));

        OpenSourcePage openSourcePage = new OpenSourcePage();
        openSourcePage.userName.sendKeys(ConfigReader.getProperty("openSourceUserName"));
        openSourcePage.password.sendKeys(ConfigReader.getProperty("openSourceUserPassword"));
        openSourcePage.login.click();

        Assert.assertTrue(openSourcePage.dashboard.isDisplayed());


        ReusableMethods.getScreenshot("OpenSource");


    }
}
