package Testing_xperts;

import Testing_xperts.Pages.BaseTest.BaseTest;
import Testing_xperts.Pages.Page.SignInPage;
import Testing_xperts.Pages.Utils.ConfigReader;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {
    ConfigReader config;
    @Test
    public void validLogin(){
        SignInPage obj = new SignInPage(driver);

        obj.convenientMethod(config.getProperty("username"), ConfigReader.getProperty("email"),config.getProperty("password"),config.getProperty("fname"),config.getProperty("lname"),config.getProperty("company"),config.getProperty("add1"),config.getProperty("add2"),config.getProperty("state"),config.getProperty("city"),config.getProperty("zip"),config.getProperty("mNumber"));



    }
}