 import Testing_xperts.Pages.BaseTest.BaseTest;
 import Testing_xperts.Pages.Utils.ExtentManager;
 import Testing_xperts.Pages.Utils.ScreenshotUtils;
 import com.aventstack.extentreports.*;
import org.testng.*;

 import java.io.IOException;

 public class ExtentTestListener extends BaseTest implements ITestListener {

        ExtentReports extent = ExtentManager.createInstance();
        ThreadLocal<ExtentTest> test = new ThreadLocal<>();

        @Override
        public void onTestStart(ITestResult result) {
            ExtentTest extentTest =
                    extent.createTest(result.getMethod().getMethodName());
            test.set(extentTest);
        }

        @Override
        public void onTestSuccess(ITestResult result) {
            test.get().pass("Test Passed");
        }

        @Override
        public void onTestFailure(ITestResult result) {
            test.get().fail(result.getThrowable());

            // Take screenshot
            String screenshotPath = null;
            try {
                screenshotPath = ScreenshotUtils.takeScreenshot(driver, result.getMethod().getMethodName());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // Add screenshot to Extent Report
            test.get().addScreenCaptureFromPath(screenshotPath);
        }

        @Override
        public void onTestSkipped(ITestResult result) {
            test.get().skip("Test Skipped");
        }

        @Override
        public void onFinish(ITestContext context) {
            extent.flush(); // very important
        }
    }


