package aginSebastian;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmployeePage extends Base{
	@Test
	public void createNewEmployee() throws Exception {
        String firstName = "firstName01";
        String lastName = "lastName01";
        
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("Entered FirstName");
		driver.findElement(By.name("firstName")).sendKeys(firstName);
		System.out.println("Entered LastName");
		driver.findElement(By.name("lastName")).sendKeys(lastName);
		String SaveBtn = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]";
		driver.findElement(By.xpath(SaveBtn)).click();
		System.out.println("Clicked Save Button");		
	}

}
