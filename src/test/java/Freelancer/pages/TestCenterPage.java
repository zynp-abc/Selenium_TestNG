package Freelancer.pages;

import Freelancer.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCenterPage {


    public TestCenterPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#exampleInputEmail1")
    public WebElement userName;

    @FindBy(css = "#exampleInputPassword1")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//i[.=' Logout']")
    public WebElement logout;



}
