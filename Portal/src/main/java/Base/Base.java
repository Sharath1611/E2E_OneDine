package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	public WebDriver driver;
	public Properties pr;
public WebDriver browserInvocation() throws IOException
{
	pr =new Properties();
	FileInputStream fil=new FileInputStream("C:\\Users\\SHARATH\\eclipse-workspace\\E2E project\\Portal\\src\\main\\java\\Base\\environment.properties");
    pr.load(fil);
   String browser=pr.getProperty("browser");
   if(browser.equals("chrome"))
   {
	 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	 driver=new ChromeDriver();
   }
   else if(browser.equals("firefox"))
   {
	   System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	   driver=new FirefoxDriver();
   }
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   return driver;
}

}