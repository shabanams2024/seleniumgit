package aginSebastian;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDetailsPage extends Base{
	@Test
	public void AddContactDetails() throws Exception {
		System.out.println("Task: Insert data in Contact Details Page");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		String BtnContactDetails = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a";
		driver.findElement(By.xpath(BtnContactDetails)).click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		String resultURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + resultURL);
		Assert.assertTrue(resultURL.contains("contactDetails"));
		
	}

}
