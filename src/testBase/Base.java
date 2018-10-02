package testBase;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

public class Base {

    public WebDriver driver;
    public WebDriverWait wait;

    //Website URL
    public String url = "http://the-internet.herokuapp.com/";

    //Chrome Path for Home and Office
    //public String chromeDriverPath = "D:/Automation Tools/Chrome_Driver/chromedriver_win32/chromedriver.exe";
    //public String chromeDriverPath = "D:\\AutomationTools\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe";

    //Geckodriver path for Mozilla Browser
    public String geckoDriverPath = "D:\\AutomationTools\\Geckodriver\\geckodriver.exe";


    public void Screenshot() throws IOException {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("D:\\workspace\\Dave-Haeffner-s-Practice-Site\\src\\testUtility\\"+System.currentTimeMillis()+".jpg"));
    }

    @BeforeClass
    public void setup(){
        //Launching Chrome Browser
        /*System.out.println("Launching Chrome Browser");
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        driver = new ChromeDriver();*/

        //Launching Mozilla Browser
        System.setProperty("webdriver.gecko.driver",geckoDriverPath);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        System.out.println("Launching Mozilla Browser");
        driver.manage().deleteAllCookies();
        driver.get(url);
    }

    @AfterClass
    public void exit(){
        System.out.println("Test Completed");
    }
    
}
