package Testing_xperts.Pages.Utils;
    import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

    public class ExtentManager {

        static ExtentReports extent;

        public static ExtentReports createInstance() {
            ExtentSparkReporter spark =
                    new ExtentSparkReporter("test-output/ExtentReport.html");

            spark.config().setReportName("AutomationExercise Test Report");
            spark.config().setDocumentTitle("Selenium Test Results");

            extent = new ExtentReports();
            extent.attachReporter(spark);
            extent.setSystemInfo("Tester", "BugX");
            extent.setSystemInfo("Browser", "Chrome");

            return extent;
        }
    }


