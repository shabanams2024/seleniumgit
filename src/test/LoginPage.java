package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

public class LoginPage extends Base {
	@Test(priority=1)
	public void launchURL() throws Exception {
		System.out.println("Task: Access Login Page");
		driver.get("http://172.17.0.3/web/index.php/auth/login");
		System.out.println("Login Page Launched");		
	}
	
	@Test(priority=2)
	public void Login() throws Exception {
		System.out.println("Task: input value for login form");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Sincere1588");
		driver.findElement(By.name("password")).sendKeys("aDU7Buv^YdW!");
		
//		Clicking Login Button
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		System.out.println("Login Button Clicked");
		test.log(Status.INFO, "Dashboard successfully loaded");
		
	}
}
