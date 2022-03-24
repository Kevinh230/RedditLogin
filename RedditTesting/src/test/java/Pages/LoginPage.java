package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
     WebDriver driver;


    @FindBy(css = "a[href^='https://www.reddit.com/login']")
     WebElement btn_login;


    @FindBy(id ="loginUsername")
    private WebElement txt_username;

    @FindBy(id = "loginPassword")
    private WebElement txt_password;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickLogIn(){
        btn_login.click();
    }

    public void enterUsername(String username){
        txt_username.sendKeys(username);
    }
    public void enterPassword(String password) {txt_password.sendKeys(password);
    }




}
