package FRAMEWORK;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmaillogin 
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream f1=new FileInputStream("C:\\manasa\\ASHOK\\src\\day19\\keywords.properties");
		Properties pr=new Properties();
		pr.load(f1);
			               FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?rli%3D3zow4h3cf76x%26rld%3D1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		driver.findElement(By.id(pr.getProperty("text_username"))).sendKeys("pathakamuriashok");
		driver.findElement(By.id(pr.getProperty("text_butns"))).click();
		driver.findElement(By.id(pr.getProperty("textPassword"))).sendKeys("dssaviwfksdbisiab");
		driver.findElement(By.id(pr.getProperty("text_btnsig"))).click();

	}

}
