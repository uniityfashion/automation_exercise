package Testing_xperts.Pages.Utils;

import Testing_xperts.Pages.BaseTest.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtils extends BaseTest {
    public static String takeScreenshot(WebDriver driver, String testName) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = "screenshots/" + testName + ".png";
        FileUtils.copyFile(src, new File(path));
        return path;
    }

}
