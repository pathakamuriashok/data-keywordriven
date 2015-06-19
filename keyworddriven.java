package FRAMEWORK;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keyworddriven
{
	FirefoxDriver driver;
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
	}
	public void navigate()
	{
driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");		
	}
	public void enterUsername(String locater)
	{
driver.findElement(By.id(locater)).sendKeys("pathakamuriashok");
	}
	public void clickNext(String locater)
	{
driver.findElement(By.id(locater)).click();
	}
	public void enterPassword(String locater)
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name(locater)).sendKeys("1234567zasd");		
	}
	public void clickLogin(String locater)
	{  
		driver.findElement(By.id(locater)).click();		
	}
}
