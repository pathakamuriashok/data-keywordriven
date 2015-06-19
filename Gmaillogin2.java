package FRAMEWORK;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class Gmaillogin2
{
	@Test
	public void logintest() throws IOException, InterruptedException
	{
FileInputStream f1=new FileInputStream("C:\\manasa\\ASHOK\\src\\COM\\KEYWORDS\\keywords(1).xlsx");
XSSFWorkbook wb=new XSSFWorkbook(f1);
XSSFSheet ws=wb.getSheet("Sheet1");

FileInputStream f2=new FileInputStream("C:\\manasa\\ASHOK\\src\\day19\\keywords.properties");
Properties pr=new Properties();
pr.load(f2);

Row r=null;
Cell c=null;

Iterator<Row> row=ws.iterator();
	row.next();
	keyworddriven keys=new keyworddriven();
	while(row.hasNext())
	{
		r=row.next();
		String actions=r.getCell(3).getStringCellValue();
	if(actions.contains("launchBrowser"))
	{
		keys.launchBrowser();
	}
	else if(actions.contains("navigate"))
	{
		keys.navigate();
	}
	else if(actions.contains("enterUsername"))
	{
		keys.enterUsername(pr.getProperty("text_username"));
	}
	else if(actions.contains("clickNext"))
	{
		keys.clickNext(pr.getProperty("text_butns"));
	}
	else if(actions.contains("enterPassword"))
	{
		keys.enterPassword(pr.getProperty("textPassword"));
	}
	else if(actions.contains("clickLogin"))
	{
		keys.clickLogin(pr.getProperty("text_btnsig"));
	}
		
	}

	}
}
