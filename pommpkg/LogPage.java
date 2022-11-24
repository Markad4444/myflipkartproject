package pommpkg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Utilclass;

public class LogPage extends Utilclass {
	static WebDriver gdriver;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	private WebElement email;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement btn;

	public LogPage(WebDriver ldriver) {
		PageFactory.initElements(ldriver, this);
		LogPage.gdriver = ldriver;

	}

	public void entermail() {
		explicitwait(gdriver, email);
		email.sendKeys("9049221706");
	}

	public void enterpass() throws EncryptedDocumentException, IOException {
		explicitwait(gdriver, pass);

		pass.sendKeys("amazon@123");

	}

	public void clickaction() {
		explicitwait(gdriver, btn);
		btn.click();
	}
}
