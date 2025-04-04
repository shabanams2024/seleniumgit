package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmployeePage extends Base
{
   @Test
   public void createNewEmployee() throws Exception
   {
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   driver.findElement(By.name("firstName")).sendKeys("Jincy");
	   System.out.println("first name is entered");
	   
	   driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	   driver.findElement(By.name("middleName")).sendKeys("S");
	   System.out.println("middle name is entered");
	   
	   driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	   driver.findElement(By.name("lastName")).sendKeys("Francis");
	   System.out.println("last name is entered");
	   
	   driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("0024");
	   System.out.println("Employee Id is entered");
	   
	   driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	   System.out.println("Employee details is saved");
	   driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	   
	   driver.findElement(By.linkText("Personal Details"));
	   System.out.println("personal details page is displayed");
	   
	   driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("5382144");
	   System.out.println("driving license number is entered");
	   driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]")).sendKeys("India");
	   
	   
	   driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();
	   System.out.println("Employee details is saved");
   }
}

	   
	   	
	   
	   
	   
	   
	   
	   
	   
  
	   
	   
	   
	   
	   
	   
   

