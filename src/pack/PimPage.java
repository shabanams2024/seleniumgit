package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PimPage extends Base{
	
	@Test
	public void navigateToAddEmployee() throws Exception
	{

		System.out.println("Waiting to click pim");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.linkText("PIM")).click();
		System.out.println("pim clicked");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		System.out.println("click add employee");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Add employee clicked");
		
		
		
	}

}
