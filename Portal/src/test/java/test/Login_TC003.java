//To check that administrator is able to log_in into the application 
package test;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.Base;
import pageObjects.Dashboard;
import pageObjects.Login_screen;

public class Login_TC003 extends Base 
{
	Dashboard d;
	@BeforeTest
	public void intialization() throws IOException
	{
		driver=browserInvocation();
		driver.get(pr.getProperty("base_URL"));
	}
	
	
	@Test
	public void AdminLogin() throws IOException, InterruptedException
	{
	
Login_screen l=new Login_screen(driver);
d=new Dashboard(driver);
l.userName().sendKeys(pr.getProperty("administrator_user(id_10)"));
l.password().sendKeys(pr.getProperty("administrator_password(id_10)"));
l.loginButton().click();
Thread.sleep(5000);
Assert.assertEquals(driver.getCurrentUrl(), pr.getProperty("dash_board_URL"));
	List<WebElement> list = d.CompanySettingIconS();
	int count = list.size();
	Assert.assertEquals(count, 0);
	}
	@AfterTest
	public void tearDown()
	{
		d.HamburgerMenu().click();
		d.SignOut().click();
		driver.close();
	}


}
