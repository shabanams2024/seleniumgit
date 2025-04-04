package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends Base {

@Test
	public void launch() throws Exception
	{
	
	
		driver.get("http://localhost/orangehrm/orangehrm-5.7/orangehrm-5.7/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("Website is launched");
		
	
//@Test
//public void Login() throws Exception  {
	
	
	
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("username")).sendKeys("Binsa25");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("Binsa@2025");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	System.out.println("Login button clicked");
	
	
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	driver.findElement(By.linkText("Dashboard")).click();
	
}

}
