package Testing_xperts;

import Testing_xperts.Pages.BaseTest.BaseTest;
import Testing_xperts.Pages.Page.Checkout;
import Testing_xperts.Pages.Page.Homepage;
import org.testng.annotations.Test;

public class CheckOutTest extends BaseTest {
    @Test
    public void CheckOutTest(){
        Checkout obj = new Checkout(driver);
        obj.checkout();
    }
}
