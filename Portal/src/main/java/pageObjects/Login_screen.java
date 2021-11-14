package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_screen 
{
public WebDriver driver;
	By user=By.xpath("//input[@name='username']");
	By psw=By.xpath("//input[@name='password']");
	By log=By.xpath("//button[.='Login']");
	
	public Login_screen(WebDriver driver)
	{
		 this.driver=driver;
	}
	
	public WebElement userName()
	{
		return driver.findElement(user);
	}
	public WebElement password()
	{
		return driver.findElement(psw);
	}
	public WebElement loginButton()
	{
		return driver.findElement(log);
	}
	
	
	
	
	
}
