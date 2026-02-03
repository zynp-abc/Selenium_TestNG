package freelancer.tests.day14_pom;

import freelancer.pages.AmazonPage;
import freelancer.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class C01_PageKullanımı {


    @Test
    public void test01() {

        Driver.getDriver().get("https://amazon.com");

        AmazonPage amazonPage = new AmazonPage();

        amazonPage.aramaKutusu.sendKeys("selenium", Keys.ENTER);
    }
}
