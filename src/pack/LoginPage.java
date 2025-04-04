package pack;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage  extends Base
{
   @Test
   public void Lauch() throws Exception
   {
	   driver.get("http://localhost:8080/orangehrm/orangehrm-5.7/orangehrm-5.7/web/index.php/auth/login");
	   driver.manage().window().maximize();
	   System.out.println("Orangehrm is launched");
	   
   }
@Test
public void Login() throws Exception
  {
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("jincyfs1");
	driver.findElement(By.name("password")).sendKeys("Jincyfs778@");
	driver.findElement(By.xpath("//html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	System.out.println("User is Successfully loggedin");
	
	System.out.println("Loginbutton clicked");
	


	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	driver.findElement(By.linkText("Dashboard"));
	System.out.println("Dashboard displayed");
  }
}

	
	

	
	

