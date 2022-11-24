package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasClass {
	static WebDriver gdriver;
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports report;
	static ExtentTest test;

	public static WebDriver getwebdriver() {
		WebDriverManager.chromiumdriver().setup();
		gdriver = new ChromeDriver();
		gdriver.get("https://www.flipkart.com/");
		gdriver.manage().window().maximize();
		return gdriver;

	}
	public static ExtentTest getTestForReporter(String useCase)
	{
		
		return test = report.createTest(useCase);
	}
	public static ExtentHtmlReporter getHtmlReporter()
	{
		if(htmlReporter == null)
		{
			htmlReporter = new ExtentHtmlReporter("ExtentReporter.html");
			
		}
		
		return htmlReporter;
	}
	public static ExtentReports getExtentReport()
	{
		if(report == null)
		{
			report = new ExtentReports();
			report.attachReporter(htmlReporter);
		}
		
		return report;
	}
}
