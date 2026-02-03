package freelancer.tests.day15_dataprovider;

import freelancer.pages.DataProviderPage;
import freelancer.utilities.DataProviderTest;
import freelancer.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_DataProviderTestUsage {

    @Test(dataProvider = "positiveTestData", dataProviderClass = DataProviderTest.class)
    public void test01(String age) {

        Driver.getDriver().get("https://mehmetualatas.github.io/dataprovider/");

        DataProviderPage dataProviderPage = new DataProviderPage();
        dataProviderPage.textbox.sendKeys(age, Keys.TAB, Keys.ENTER);
        Assert.assertTrue(dataProviderPage.pozitiveVerifyMessage.isDisplayed());


    }
}
