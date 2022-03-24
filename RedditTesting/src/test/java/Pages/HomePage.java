package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/header/div/div[1]/div[2]/button")
    WebElement link;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void inHomePage()
    {

        link.isDisplayed();
    }
}
