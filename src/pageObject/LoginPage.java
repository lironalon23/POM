package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    By UserNameField=By.cssSelector("[placeholder='מייל']");
    By passwordField=By.cssSelector("[placeholder='סיסמה']");
    By LoginButton =By.cssSelector("[gtm='כניסה ל-BUYME']");
    By forgetPasswordButton = By.cssSelector("[class='bm-body-2 text-link theme db']");
    By loginWithFaceBookButton = By.cssSelector("[class='social-btn facebook']");
    By loginWithGoogleButton = By.cssSelector("[class='social-btn google']");
    By toGoSingUPButton =By.cssSelector("[class='text-link theme']");
    By rememberMeButton =By.cssSelector("//div[@class='ember-view bm-checkbox checked']/div/span[1]");

    public LoginPage setUserName(String userName) {
        writeText(UserNameField, userName);
        return this;
    }
    public LoginPage setPassword(String password) {
        writeText(passwordField, password);
        return this;
    }
    public LoginPage LoginButton(String login) {
        click(LoginButton);
        return this;
    }

    public LoginPage forgetPasswordButton(String forgetPassword) {
        click(forgetPasswordButton);
        return this;
    }

    public LoginPage loginWithFaceBookButton(String loginWithFaceBook) {
        click(loginWithFaceBookButton );
        return this;
    }
    public LoginPage loginWithGoogleButton(String loginWithGoogle) {
        click(loginWithGoogleButton );
        return this;
    }

    public LoginPage rememberMeButton(String rememberMe) {
        click(rememberMeButton);
        return this;
    }
    public LoginPage toGoSingUPButton(String toGoSingUP) {
        click(toGoSingUPButton);
        return this;
    }


    }
