//To check that super admin is able to log_in into the application 
package test;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;
import pageObjects.Dashboard;
import pageObjects.Login_screen;

public class Login_TC003 extends Base 
{
	@Test
	public void superAdminLogin() throws IOException, InterruptedException
	{
		driver=browserInvocation();
Login_screen l=new Login_screen(driver);
Dashboard d=new Dashboard(driver);
driver.get(pr.getProperty("base_URL"));
l.userName().sendKeys(pr.getProperty("administrator_user(id_10)"));
l.password().sendKeys(pr.getProperty("administrator_password(id_10)"));
l.loginButton().click();
Thread.sleep(5000);
Assert.assertEquals(driver.getCurrentUrl(), pr.getProperty("dash_board_URL"));
	List<WebElement> list = d.CompanySettingIconS();
	int count = list.size();
	Assert.assertEquals(count, 0);
	}
	

}
