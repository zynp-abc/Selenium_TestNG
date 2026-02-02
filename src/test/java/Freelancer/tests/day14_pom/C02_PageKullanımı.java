package Freelancer.tests.day14_pom;

import Freelancer.pages.OpenSourcePage;
import Freelancer.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_PageKullanımı {

    @Test
    public void test01() {

        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        OpenSourcePage openSourcePage = new OpenSourcePage();
        openSourcePage.userName.sendKeys("Admin");
        openSourcePage.password.sendKeys("admin123");
        openSourcePage.login.click();
        Assert.assertTrue(openSourcePage.dashboard.isDisplayed());
    }
}
