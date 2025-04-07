package aginSebastian;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base {
	public static WebDriver driver = null;
//	public static ExtentReports reports;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest test;
	public static ExtentReports extent;
	
	@BeforeTest
	public void initialize() throws Exception {
		System.out.println("driver initialised");
		String driverPath = "/home/agin/eclipse-workspace/geckodriver-v0.30.0-linux64/geckodriver";
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
	}
	
	@BeforeSuite
	public void reportGenerate() {
		String reportPath = System.getProperty("user.dir");
		htmlReporter = new ExtentHtmlReporter(reportPath + "ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		test = extent.createTest("Accessing Contact Details Page");
//		test = reports.startTest("ExtentDemo");
//		reports = new ExtentReports(reportPath + "ExtentReportResults.html");
//		extentSparkReporter  = new ExtentSparkReporter(System.getProperty("user.dir") + "extentReport.html");
//		extent = new ExtentReports();
//		extent.attachReporter(reports);
		
//		reports = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
//		test = reports.startTest("ExtentDemo");
	}
//	
	@AfterSuite
	public void endTest() {
//		extent.endTest(test);
		extent.flush();
	}
}
