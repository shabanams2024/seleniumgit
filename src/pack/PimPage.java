package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PimPage extends Base
{
@Test
  public void navigateToAddEmployeePage() throws Exception
  {
	System.out.println("waiting to click PIM");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.linkText("PIM")).click();
	System.out.println("PIM is clicked");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	System.out.println("Clicking add employee");
	driver.findElement(By.linkText("Add Employee")).click();
	System.out.println("clicked add employee");
	
  } 
 }