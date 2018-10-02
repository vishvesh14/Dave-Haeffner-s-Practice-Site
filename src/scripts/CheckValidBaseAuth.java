package scripts;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseAuthLocators;
import sun.rmi.runtime.Log;
import testBase.Base;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;


public class CheckValidBaseAuth extends Base{

    @Test
    public void BaseAuthSuccess() throws IOException, InterruptedException {

        String expectedURL = "http://the-internet.herokuapp.com/basic_auth";
        String actualURL;

        BaseAuthLocators BaseAuthObj = new BaseAuthLocators(driver);
        String parent=driver.getWindowHandle();
        System.out.println(parent);
        BaseAuthObj.clickBasicAuthLink();
        System.out.println("Clicked Auth Button from webpage");
        Runtime.getRuntime().exec("C:\\Users\\vishvesh.sawant\\Desktop\\AutoIT Scripts\\HandleAuthenicationWindow.exe").getInputStream();
        String parent1=driver.getWindowHandle();
        System.out.println(parent1);
        String pageSource = driver.getPageSource();
        boolean isTheTextPresent = driver.getPageSource().contains("A/B Testing");
        System.out.println(isTheTextPresent);

        //actualURL = driver.getCurrentUrl();
        //System.out.println(actualURL);
/*
        try
        {
            Assert.assertEquals(actualURL,expectedURL);
            System.out.println(actualURL);
            Screenshot();
        }
        catch (AssertionError e){
            Log error;
            System.out.println(actualURL);
            Screenshot();
        }*/

    }
}
