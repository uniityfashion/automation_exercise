package Testing_xperts;

import Testing_xperts.Pages.BaseTest.BaseTest;
import Testing_xperts.Pages.Page.Checkout;
import Testing_xperts.Pages.Page.Homepage;
import Testing_xperts.Pages.Page.Payment;
import Testing_xperts.Pages.Utils.ConfigReader;
import org.testng.annotations.Test;

public class CheckOutTest extends BaseTest {
    ConfigReader config;
    @Test
    public void CheckOutTest(){
        Checkout obj = new Checkout(driver);
        obj.checkout();
    }
    @Test
    public void payment() throws InterruptedException {
        Payment obj = new Payment(driver);
        obj.makePayment(config.getProperty("Cname"), ConfigReader.getProperty("cNumber"),config.getProperty("cvv"), ConfigReader.getProperty("Emonth"),ConfigReader.getProperty("Eyear"));
    }
}
