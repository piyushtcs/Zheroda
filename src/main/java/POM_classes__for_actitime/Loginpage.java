package POM_classes__for_actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy (xpath="//input[@id='username']") private WebElement UN;
	@FindBy (xpath="//input[@name='pwd']") private WebElement PSW;
	@FindBy (xpath="//div[text()='Login ']") private WebElement loginBtn;

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterPSW(String password) {
		PSW.sendKeys(password);
	}
	public void clickloginBtn() {
		loginBtn.click();
	}
}
