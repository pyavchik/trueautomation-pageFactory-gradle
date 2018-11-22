package tests;

import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import pages.SigninPage;
import pages.SignupPage;

public class BaseTest {
    public WebDriver driver;

    public HomePage homePage;
    public SigninPage signinPage;
    public SignupPage signupPage;

    @BeforeMethod
    public void setup () {
        driver = new TrueAutomationDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        signinPage = new SigninPage(driver);
        signupPage = new SignupPage(driver);
    }

    @AfterMethod
    public void teardown () {
        driver.quit();
    }
}
