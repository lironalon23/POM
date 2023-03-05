package pageObject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage extends BasePage {

    public SignupPage(WebDriver driver) {
        super(driver);
    }


        By firstNameFiled = By.cssSelector("[placeholder='שם פרטי']");
        By mailFiled=By.cssSelector("[placeholder='מייל']");
        By  passwordFiled = By.cssSelector("[placeholder='סיסמה']");
        By validationPasswordFiled=By.cssSelector("[placeholder='אימות סיסמה']");
        By interButton = By.cssSelector("[gtm='הרשמה ל-BUYME']");
        By agreeButton = By.cssSelector("[action='register'] div:nth-of-type(5) .fill");
        By agreeButton2=By.cssSelector("[action='register'] div:nth-of-type(6) .fill");
        By facebookButton = By.cssSelector("[class='social-btn facebook']");
        By googleButton = By.cssSelector("[class='social-btn google']");
        By goToLoginButton = By.cssSelector("[class='text-link theme']");


    public SignupPage setFirstNameFiled(String firstName){
            writeText(firstNameFiled,firstName);
            return this;
    }

    public SignupPage setMailFiled(String mail){
            writeText(mailFiled,mail);
        return this;
    }


    public SignupPage setPasswordFiled(String password){
            writeText(passwordFiled, password);
        return this;
    }

    public SignupPage setValidationPasswordFiled(String validationPassword){
            writeText(validationPasswordFiled,validationPassword);
        return this;
    }

    public SignupPage interButton(String inter){
            click(interButton);
        return this;

    }
    public SignupPage agreeButton(String agree){
            click(agreeButton);
        return this;
    }
    public SignupPage agreeButton2(String agree2){
        click(agreeButton2);
        return this;
    }
    public SignupPage facebookButton(String facebook){
            click(facebookButton);
        return this;
    }
    public SignupPage googleButton(String google){
            click(googleButton);
        return this;
    }
    public SignupPage goToLoginButton(String goToLogin){
            click(goToLoginButton);
        return this;
    }

}

