package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormAuthenticationLocators;
import testBase.Base;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class CheckFormAuthentication extends Base{

    @Test
    public void FormAuthSuccess() throws IOException {
        try{
            FormAuthenticationLocators FormAuthObj = new FormAuthenticationLocators(driver);
            FormAuthObj.clickFormAuthLink();
            FormAuthObj.enterUsername("tomsmith");
            FormAuthObj.enterPassword("SuperSecretPassword!");
            FormAuthObj.clickLoginButton();
            String actualURL = driver.getCurrentUrl();

            if (actualURL.contains("http://the-internet.herokuapp.com/secure")) {

                System.out.println("Form Authentication Successfull");
                Screenshot();
            } else {
                System.out.println("Form Authentication Fail.");
                Screenshot();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
