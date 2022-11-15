package Testclasses;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclass.Base_for_Actitime;
import POM_classes__for_actitime.Homepage;
import POM_classes__for_actitime.Loginpage;
import Util.Utility;

public class TC1 extends Base_for_Actitime {
Loginpage l;
Homepage h;
@BeforeClass
public void openBrowser() throws Throwable {
	initializeBrowser();
	l=new Loginpage(driver);
	h=new Homepage(driver);
}
@BeforeMethod
public void openApp() throws Throwable{
	l.enterUN(Utility.getTD(1, 0));
	l.enterPSW(Utility.getTD(1, 1));
	l.clickloginBtn();
	
	}
@Test
public void VerifyText() throws Throwable {
	Reporter.log("running verify text",true);
	String actText=h.verifyText();
	String expText=Utility.getTD(1, 2);
	System.out.println("Hello Git");
}
@AfterMethod
public void logout() {
	h.clicklogout();
	Reporter.log("logout from application",true);
}
@AfterClass 
public void closeBrowser() {
	Reporter.log("close the browser",true);
}

}
