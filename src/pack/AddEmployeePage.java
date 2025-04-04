package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmployeePage extends Base {
	
	@Test
	public void createNewEmployee() throws Exception
	{   
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Binsa");
		System.out.println("first name is entered");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("middleName")).sendKeys("Ann");
		System.out.println("Middle name is entered");
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Ab");
		System.out.println("Last name is entered");
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).click();
		System.out.println("Employee id is generated");
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		System.out.println("Employee details is saved");
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Personal Details"));
		Thread.sleep(2000);
		System.out.println("Personal Details page is displayed");
		
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS);
		
		
		
	}

}
