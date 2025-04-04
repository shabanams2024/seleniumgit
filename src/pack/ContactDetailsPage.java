package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ContactDetailsPage extends Base  {

	@Test
	public void Addcontact() throws Exception,AssertionError{
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS);
		
		String x=driver.getCurrentUrl();
		System.out.println("Current url: "+x);
		Thread.sleep(2000);
		Assert.assertTrue(x.contains("contactDetails"));
	    //Assert.assertTrue(true,"Contact Details");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("abcd");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("xyz");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")).sendKeys("695005");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("04712536747");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input")).sendKeys("def@gmail.com");
		
		System.out.println("contact details is entered");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();
		
		
		
		System.out.println("contact details is saved");
	
	
	}	
	
	
	
}
