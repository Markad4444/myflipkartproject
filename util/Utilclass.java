package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityModelProvider;

public class Utilclass {
	public static WebElement explicitwait(WebDriver ldriver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(20));
		WebElement element1 = wait.until(ExpectedConditions.visibilityOf(element));
		return element1;
	}

	public static String getdatafromexcel(String sheetname, int row, int cell)
			throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\Admin\\Desktop\\Eclipse_workspace\\Nov1922\\xcel\\fordatadriven.xlsx");

		String data = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell)
				.getStringCellValue();
		return data;

	}

	public static String getScreenshot(WebDriver ldriver, String testname) throws IOException {
		File source = ((TakesScreenshot) ldriver).getScreenshotAs(OutputType.FILE);
		String path = "testname.png";
		File dest = new File(path);
		FileHandler.copy(source, dest);
		return path;

	}

	public static String getdatafromproperty(String key) throws IOException {
		FileInputStream file = new FileInputStream("configuration\\config.properties");

		Properties prop = new Properties();
		prop.load(file);
		return prop.getProperty(key);
	}

	public static void movebyoffset(WebDriver ldriver) {
		Actions act = new Actions(ldriver);
		act.moveByOffset(200, 0).release().build().perform();

	}

	public static void movetoelement(WebDriver ldriver,WebElement moveele ) {
		Actions act = new Actions(ldriver);
		 act.moveToElement(moveele).pause(2000).build().perform();
		

	}
	public static void scrolltoelement(WebDriver ldriver, WebElement moveele) {
		Actions act = new Actions(ldriver);
		 act.scrollToElement(moveele).build().perform();
}
	
}