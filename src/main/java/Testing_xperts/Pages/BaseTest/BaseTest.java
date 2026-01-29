package BaseTest;

import Testing_xperts.Pages.Utils.ConfigReader;
import Testing_xperts.Pages.Utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = DriverFactory.initDriver();
        driver.get(ConfigReader.getProperty("url"));

    }
//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }
}
