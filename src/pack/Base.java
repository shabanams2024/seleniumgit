package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {

	public static WebDriver driver=null;
	//public static ExtentReports reports;
	
@BeforeTest

public void initialise() throws Exception

{
	System.out.println("Driver is initialised");
	System.setProperty("webdriver.gecko.driver","C:\\Selenium files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	//System.setProperty("webdriver.chrome.driver","C:\\Selenium files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//driver=new ChromeDriver();
			
}
@AfterTest
public void tearDown() throws Exception
{
	driver.quit();
	System.out.println("End!");
}

}
