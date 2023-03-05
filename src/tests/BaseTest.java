package tests;

import com.relevantcodes.extentreports.ExtentReports;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class BaseTest {
    public static WebDriver driver ;
    public static WebDriverWait wait;


    public static String raedFromFile(String keyDate) throws Exception {
        File xmlFile = new File("C://dd/config.html");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFile);
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(keyDate).item(0).getTextContent();

    }

    public static void settingBrowser(String browser) {

        switch (browser) {
            case "firefox":
                FirefoxOptions options = new FirefoxOptions();
                options.setCapability("marionette", false);
                System.setProperty("webdriver.gecko.driver", "C:/selenium/geckodriver.exe");
                driver = new FirefoxDriver(options);
                break;

            case "chrome":
                ChromeOptions chromeOption = new ChromeOptions();
                chromeOption.addArguments("--start-maximized");
                chromeOption.addArguments("-incognito");
                chromeOption.addArguments("--disable-popup-blocking");
                System.setProperty("webdriver.chrome.driver", "C:/Users/שדרות/Desktop/selenium/chromedriver.exe");
                driver = new ChromeDriver(chromeOption);
                break;
        }

        @BeforeClass
        public static void SetUp() throws Exception {
            extent = new ExtentReports(reportFilePath);
            String browser = raedFromFile("browser");
            settingBrowser(browser);


        @Before
        public void openBrowser () {
            driver.get("https://www.buyme.co.il/");

        }


    }


}


    //driver
    //file path
    //object for each page class except basePage






    //@before class
    //@after class
    //read from file
    //screenshot


}
