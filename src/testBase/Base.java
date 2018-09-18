package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

blic class Base {

    public WebDriver driver;
    public WebDriverWait wait;

    //public String chromeDriverPath = "D:/Automation Tools/Chrome_Driver/chromedriver_win32/chromedriver.exe";
    //public String chromeDriverPath = "D:\\AutomationTools\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe";
    public String geckoDriverPath = "D:\\AutomationTools\\Geckodriver\\geckodriver.exe";

    public String url = "http://the-internet.herokuapp.com/";

    @BeforeClass
    public void setup(){
        /*System.out.println("Launching Chrome Browser");
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        driver = new ChromeDriver();*/

        System.setProperty("webdriver.gecko.driver",geckoDriverPath);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterClass
    public void exit(){
        System.out.println("Test Complete");
    }
    
}
