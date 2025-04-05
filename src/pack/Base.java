package pack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class Base
{
   public static WebDriver driver=null;  
   @BeforeTest
   public void initialise()
   {
	   System.out.println("Driver is initialised");
	   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	   driver=new ChromeDriver();
   }
   @AfterSuite
   public void tearDown() 
   {
	   
     driver.quit();
   
    }
   
}