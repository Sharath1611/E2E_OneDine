// To check all the users are able to log_in to onedine application (dev,superAdmin,Admin,manager,storeUser)
package test;
import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.Base;
import pageObjects.Dashboard;
import pageObjects.Login_screen;

public class Login_TC001 extends Base
{
	Dashboard d ;
	/*@BeforeTest
	public void intialization() throws IOException
	{
		driver=browserInvocation();
		driver.get(pr.getProperty("base_URL"));
	}*/
@Test(dataProvider="getData")
public void Login_flow(String username, String password) throws IOException, InterruptedException
{
	driver=browserInvocation();
	driver.get(pr.getProperty("base_URL"));
	Login_screen l=new Login_screen(driver);
	 d=new Dashboard(driver);
	l.userName().sendKeys(username);
	Thread.sleep(1000);
	l.password().sendKeys(password);
	Thread.sleep(1000);
	l.loginButton().click();
	Assert.assertTrue(d.HeaderLOGO().isDisplayed());
	
	d.HamburgerMenu().click();
	d.SignOut().click();
	driver.close();
}
@DataProvider
public Object[][] getData()
{
	Object[][] data= new Object[5][2];
	data[0][0]="onedinedev1";
	data[0][1]="OneDine123!";
	data[1][0]="onedinesuper";
	data[1][1]="OneDine123!";
	data[2][0]="onedinemanager";
	data[2][1]="OneDine123!";
	data[3][0]="onedineadmin";
	data[3][1]="OneDine123!";
	data[4][0]="onedinesupport";
	data[4][1]="OneDine123!";
	return data;
}
/*@AfterTest
public void tearDown()
{
	d.HamburgerMenu().click();
	d.SignOut().click();
	driver.close();
}*/
}

