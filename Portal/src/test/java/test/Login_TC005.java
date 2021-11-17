//To check that manager is able to login to application
package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.Dashboard;
import pageObjects.Login_screen;

public class Login_TC005 extends Base 
{
	Dashboard d;
	@BeforeTest
	public void intialization() throws IOException
	{
		driver=browserInvocation();
		driver.get(pr.getProperty("base_URL"));
	}

	
	
@Test
	public void managerLogin() throws IOException, InterruptedException
	{
		 d=new Dashboard(driver);
		Login_screen l=new Login_screen(driver);
		l.userName().sendKeys(pr.getProperty("user_storemanager(id_5)"));
		l.password().sendKeys(pr.getProperty("storemanager_password(id_5)"));
		l.loginButton().click();
		Thread.sleep(5000);
		Assert.assertEquals(pr.getProperty("dash_board_URL"), driver.getCurrentUrl());
		int count = d.CompanyDropDownS().size();
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

