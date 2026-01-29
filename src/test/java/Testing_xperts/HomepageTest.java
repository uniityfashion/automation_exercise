package Testing_xperts;

import Testing_xperts.Pages.BaseTest.BaseTest;
import Testing_xperts.Pages.Page.Homepage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest {

    @Test
    public void homeTest(){
        Homepage obj = new Homepage(driver);
        obj.homePage();
    }
}