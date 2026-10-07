package org.reuse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	 protected static WebDriver driver;
	public static void browserLaunch() {
		 driver = new ChromeDriver();
		
	}
	public static void closeBrowser() {
		driver.quit();

	}
	
     public static void maxBrowser() {
    	 driver.manage().window().maximize();
     }
	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}
	public static void launchurl(String url) {
		driver.get(url);
		
	}
	public static void takesnap(String name) throws IOException {
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File f = t.getScreenshotAs(OutputType.FILE);
		File fi = new File("C:\\Users\\acer\\youtube-workspace\\Maven\\ScreenShot\\"+name+".png");
		FileUtils.copyFile(f, fi);
	}
	public static void maxbrowser() {
		driver.manage().window().maximize();
	}
	
	public static void passtxt(WebElement element,String text) {
		element.sendKeys(text);
	}
	public static void userName(String user) {
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys(user);	

	}
	public static void password(String pass) {
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(pass);
	}
	public static void prsTab() throws AWTException {
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);	
	}
	public static void backbtn() {
		driver.navigate().back();
	}
	public static void forwardbtn() {
		driver.navigate().forward();	
	}
	public static void refrs() {
		driver.navigate().refresh();
	}
	public static void searchproduct(String product) throws InterruptedException, AWTException {
		WebElement prdt = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		Thread.sleep(3000);
		prdt.sendKeys(product);
	
		prdt.sendKeys(Keys.ENTER);
		Robot p = new Robot();	
	}
	public static String getData(String sheetName,int rowNum,int cellNum) throws IOException {
		
		File f = new File("C:\\Users\\acer\\youtube-workspace\\Maven\\Excel\\Datas.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook book = new XSSFWorkbook(fin);
		
		Sheet sh = book.getSheet(sheetName);
		
		Row r = sh.getRow(rowNum);
		
		Cell c = r.getCell(cellNum);
		
		int type = c.getCellType();
		
		String name;
		if (type==1) {
			
			 name = c.getStringCellValue();
				
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			
			SimpleDateFormat sim = new SimpleDateFormat("dd/MMM/yyyy");
			
			 name = sim.format(d);
			
		}
		else {
			double da = c.getNumericCellValue();
			long l = (long) da;
			
			 name = String.valueOf(1);
			
		}
		return name;
		
		
		
		
		
		
		
		
	}
	
	

}
