package pommpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Utilclass;

public class Homepge extends Utilclass {
	static WebDriver gdriver;////div[text()='vitthal' or class='exehdJ']
	@FindBy(xpath = "//div[text()='vitthal' or class='exehdJ']")
	private WebElement profilename;
	@FindBy(xpath = "//div[text()='My Profile' or class='_3vhnxf']")
	private WebElement subprofile;
	@FindBy(xpath = "//span[text()='Logout']")
	private WebElement logout;
	@FindBy(xpath="//div[text()='More' or @class='exehdJ']")
	private WebElement moretab;
	@FindBy(xpath="//span[text()='Cart']")
	private WebElement carttab;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/div[1]/div/a[2]")
	private WebElement exporeplustext;
	@FindBy(xpath="//div[text()='24x7 Customer Care' ]")
	private WebElement wholedayservice;
	

	public Homepge(WebDriver ldriver) {
		PageFactory.initElements(ldriver, this);
		Homepge.gdriver = ldriver;

	}


public void tomovetowordsprofilename() {
		explicitwait(gdriver, profilename);
movetoelement(gdriver, profilename);
	}
	public String togetprofilename() {
		explicitwait(gdriver, profilename);
		return profilename.getText();
	}


	public void tomovesubsubprofile() {
		explicitwait(gdriver, subprofile);
		movetoelement(gdriver, subprofile);
	}
	public void toclicksubprofile() {
		if(subprofile.isDisplayed())
		{
			subprofile.click();
		
		}

	}
	

	public String togetlogouttext() {
		explicitwait(gdriver, logout);
		//movetoelement(gdriver, logout);
		return logout.getText();
	}

	public void tockicklogout() {
		explicitwait(gdriver, logout);
		logout.click();
	}
	public String togetmoretext() throws InterruptedException {
		explicitwait(gdriver, moretab);
		Thread.sleep(2000);
		movetoelement(gdriver, moretab);
		movetoelement(gdriver, wholedayservice);
		return wholedayservice.getText();
		
	}
	
	public String togetcarttext() {
		explicitwait(gdriver, carttab);
		return carttab.getText();
	}
	public String togetexploretext() {
		explicitwait(gdriver, exporeplustext);
		return exporeplustext.getText();
	}
}
