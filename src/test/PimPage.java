package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PimPage extends Base {
	@Test
	public void navigateToAddEmployeePage() throws Exception {
		System.out.println("Task: Input New Employee Data");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("PIM")).click();
		System.out.println("Clicked PIM Menu");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Clicked Add Employee");
	}

}
