package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.Base;

public class BaseAuthLocators extends Base{

    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[2]/a")
    WebElement BasicAuthLink;


    public BaseAuthLocators(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickBasicAuthLink(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(BasicAuthLink)).click();
    }

}
