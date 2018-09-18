package scripts;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.BaseAuthLocators;
import testBase.Base;
import org.openqa.selenium.Alert;

import java.io.IOException;


public class CheckValidBaseAuth extends Base{

    @Test
    public void BaseAuthSuccess() throws IOException {

        BaseAuthLocators BaseAuthObj = new BaseAuthLocators(driver);

        BaseAuthObj.clickBasicAuthLink();
        Runtime.getRuntime().exec("C:\\Users\\vishvesh.sawant\\Desktop\\AutoIT Scripts\\HandleAuthenicationWindow.exe");
    }
}