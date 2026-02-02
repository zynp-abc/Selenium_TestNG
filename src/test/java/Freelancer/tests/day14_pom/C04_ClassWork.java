package Freelancer.tests.day14_pom;

import Freelancer.pages.TestCenterPage;
import Freelancer.utilities.ConfigReader;
import Freelancer.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C04_ClassWork {


    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("testCenterUrl"));

        TestCenterPage testCenterPage = new TestCenterPage();

        testCenterPage.userName.sendKeys(ConfigReader.getProperty("testCenterUserName"));
        testCenterPage.password.sendKeys(ConfigReader.getProperty("testCenterPassword"));
        testCenterPage.submit.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(testCenterPage.logout.isDisplayed());
        softAssert.assertAll();

        testCenterPage.logout.click();
    }


}
