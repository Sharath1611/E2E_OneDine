package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard 
{
	WebDriver driver;
By logo=By.xpath("//span[normalize-space()='onedine']");
By company_dropdown=By.xpath("(//input[@id='react-select-2-input'])[1]");
By company_settingIcon=By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div/div[2]/div/ul/ul/li/div/div/div/div/div[1]/div[1]/span");
By hamburger_Menu=By.xpath("//img[@alt='menu']");
By sign_out=By.xpath("//span[normalize-space()='Sign Out']");
public Dashboard(WebDriver driver)
{
	this.driver=driver;
}
	
	public WebElement HeaderLOGO()
	{
		return driver.findElement(logo);
	}
	public WebElement CompanyDropDown()
	{
		return driver.findElement(company_dropdown);
	}
	public WebElement CompanySettingIcon()
	{
		return driver.findElement(company_settingIcon);
	}
	public WebElement HamburgerMenu()
	{
		return driver.findElement(hamburger_Menu);
	}
	public WebElement SignOut()
	{
		return driver.findElement(sign_out);
	}
	public List<WebElement> CompanySettingIconS()
	{
		return driver.findElements(company_settingIcon);
	}
	public List<WebElement> CompanyDropDownS()
	{
		return driver.findElements(company_dropdown);
	}
}
