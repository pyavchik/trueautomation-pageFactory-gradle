package pages;

import io.trueautomation.client.driver.FindByTA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    String baseURL = "https://trueautomation.io";

    @FindByTA(taName="ta:homePage:loginBtn", css = "a.login-btn")
    public WebElement loginBtn;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToHomePage (){
        driver.get(baseURL);
    }

    public void signInBtnPress() {
        loginBtn.click();
    }
}
