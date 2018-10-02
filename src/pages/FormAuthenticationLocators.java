package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.Base;

public class FormAuthenticationLocators extends Base{

    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[18]/a")
    WebElement FormAuthLink;

    @FindBy(id = "username")
    WebElement FormUsername;

    @FindBy(id = "password")
    WebElement FormPassword;

    @FindBy(xpath = "//*[@id=\"login\"]/button/i")
    WebElement LoginButton;

    public FormAuthenticationLocators(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickFormAuthLink(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(FormAuthLink)).click();
    }

    public void enterUsername(String x){
        FormUsername.sendKeys(x);
    }

    public void enterPassword(String y){
        FormPassword.sendKeys(y);
    }

    public void clickLoginButton(){
        Boolean checkLoginButton = LoginButton.isDisplayed();
        if (checkLoginButton == true){
            new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(LoginButton)).click();
        }
        else{
            System.out.println("Login Button is not displayed");
        }
    }
}
