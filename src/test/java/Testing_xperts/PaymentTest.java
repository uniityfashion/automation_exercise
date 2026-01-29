package Testing_xperts;

import Testing_xperts.Pages.BaseTest.BaseTest;
import Testing_xperts.Pages.Page.Payment;
import Testing_xperts.Pages.Page.SignInPage;
import Testing_xperts.Pages.Utils.ConfigReader;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest {
    ConfigReader config;

    @Test
    public void payment() throws InterruptedException {
        Payment obj = new Payment(driver);
        obj.makePayment(config.getProperty("Cname"), ConfigReader.getProperty("cNumber"),config.getProperty("cvv"), ConfigReader.getProperty("Emonth"),ConfigReader.getProperty("Eyear"));
    }
}
