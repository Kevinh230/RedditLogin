package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/header/div/div[2]/div/div[1]/a[1]")
    private WebElement btn_login;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    public void firstClickLogIn(){
        btn_login.click();
        driver.switchTo().frame(0);
    }
}
