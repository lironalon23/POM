package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(65));
    }

    public void click(By elementLoction) {
        driver.findElement(elementLoction).click();

    }

    public void writeText(By elementLoction, String text) {
        driver.findElement(elementLoction).click();
        driver.findElement(elementLoction).sendKeys(text);

    }


    public void waitVisibility(By by) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


}




