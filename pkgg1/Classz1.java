package pkgg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classz1 {

	public static void main(String[] args) throws InterruptedException  {

		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.get("https:/www.flipkart.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement mail= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		  mail.sendKeys("9049221706");
		  WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
		  pass.sendKeys("amazon@123");
		  WebElement btn= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		  btn.click();
		  Thread.sleep(2000);
		  JavascriptExecutor js= (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,500)");
		  Thread.sleep(2000);
		  //WebElement eletop= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[1]/div/img"));
		  //js.executeScript("arguments[0].scrollIntoView();",eletop );
		  //Thread.sleep(2000);
		  //eletop.click();
		  WebElement kk= driver.findElement(By.xpath("//div[text()='vitthal' or class='exehdJ']"));

		  System.out.println(kk.getText());

		  Actions act= new Actions(driver);
		  WebElement userprofilename =driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div"));
		  act.moveToElement(userprofilename).perform();
		  Thread.sleep(2000);
		  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		  WebElement profilename=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='ZEl_b_ _1J9ow0 _2ogGYG _23xUYh _3pAV4E']/div/div/ul/li/a/*)[2]")));

		  if(profilename.isDisplayed())
		  	{
			  System.out.println(profilename.getText());
		  	profilename.click();
		  	}

		  WebElement logout=driver.findElement(By.xpath("//span[text()='Logout']"));
		  String expectedvalue =logout.getText();
		  System.out.println(expectedvalue);
		  if(expectedvalue.equals("Logout"))
		  {
		  	System.out.println("login page test case verified");
		  	}
		  logout.click();
		  Thread.sleep(3000);

		  //driver.close();

		 }



	}


