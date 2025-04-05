package pack;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDetailsPage extends Base
{
  @Test
  public void AddContactDetails() throws Exception
  {
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")).click();
	  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	  
	  String y = driver.getCurrentUrl();
	  System.out.println("current url: "+y);
	  Assert.assertTrue(y.contains("contactDetails"));
	  
	  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Karunya");
	  driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("Vazhuthoor");
	 
	  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")).sendKeys("Trivandrum");
	  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Kerala");
	 
	  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")).sendKeys("695121");
	 
	  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("996131132");
	
	  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();
	  
	  System.out.println("contactDetails is saved");  
	  

     
  
  }
  
}