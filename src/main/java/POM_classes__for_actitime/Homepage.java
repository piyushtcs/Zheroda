package POM_classes__for_actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy (xpath="//td[text()='Enter Time-Track']")private WebElement text;
	@FindBy (xpath="//a[@id='logoutLink']") private WebElement logout;

	public  Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String verifyText() {
		String actText=text.getText();
		return actText;
		System.out.println("should i verifyText");
	}
	public void clicklogout() {
		logout.click();
	}
}
