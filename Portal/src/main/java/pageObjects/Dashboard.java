package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard 
{
	WebDriver driver;
By logo=By.xpath("//span[normalize-space()='onedine']");
By company_dropdown=By.xpath("//input[@type='text']");
By company_settingIcon=By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div/div[2]/div/ul/ul/li/div/div/div/div/div[1]/div[1]/span");
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
	public List<WebElement> CompanySettingIconS()
	{
		return driver.findElements(company_settingIcon);
	}
}
