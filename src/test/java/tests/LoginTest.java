package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void exampleTest() {
        homePage.goToHomePage();
        homePage.signInBtnPress();
        signinPage.goToSignUpPage();
        signupPage.setEmail("your@mail.com");
    }

}