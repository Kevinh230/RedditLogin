package Steps;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    WebDriver driver;
    LoginPage login;
    HomePage home;
    MainPage main;

    @Before
    public void driverSetup()
    {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/Drivers/chromedriver.exe");

        driver = new ChromeDriver();
    }
    @After
    public void driverClose()
    {
        driver.close();
        driver.quit();
    }

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        driver.navigate().to("https://www.reddit.com/");
    }

    @And("user clicks the login button")
    public void clicks_the_login_button(){
        main = new MainPage(driver);
        main.firstClickLogIn();
    }

    @Then("user enters username and password")
    public void user_enters_username_and_password() {
        login = new LoginPage(driver);

        login.enterUsername("username");
        login.enterPassword("password");


    }

    @And("user clicks on login button")
    public void user_clicks_on_login_button()    {
        login.clickLogIn();
    }

    @Then("user is redirected to home page")
    public void user_is_redirected_to_home_page() {
        home = new HomePage(driver);
        home.inHomePage();


    }

}
