package freelancer.pages;

import freelancer.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataProviderPage {

    public DataProviderPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "age")
    public WebElement textbox;

    @FindBy(xpath = "//*[.='Yas dogrulandi!']")
    public WebElement pozitiveVerifyMessage;




}
