package testScript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import automationCore.Base;
import constant.Constant;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	
	@Test(priority=1,description="user is trying to login with valid credentials",groups= {"smoke"})
	public void verifyUserWithValidCredentials() throws IOException
	{
		String usernamevalue=ExcelUtility.readStringData(0, 0,"login");
		String passwordvalue=ExcelUtility.readStringData(0, 1,"login");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.verifyValidUsernameonUsernamefield(usernamevalue).verifyValidPasswordonPasswordfield(passwordvalue);
		loginpage.clickLoginButton();
		boolean loginButtonStatus = loginpage.isLoginButonClickable();

		Assert.assertTrue(loginButtonStatus,Constant.validcredentialerror);
	}
	@Test(priority=2,description = "user is trying to login with invalid username and valid password",retryAnalyzer=retry.Retry.class)
	public void verifyInvalidusernameandValidPassword() throws IOException
	{
		String usernamevalue=ExcelUtility.readStringData(1, 0,"login");
		String passwordvalue=ExcelUtility.readStringData(1, 1,"login");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.verifyValidUsernameonUsernamefield(usernamevalue).verifyValidPasswordonPasswordfield(passwordvalue);
		loginpage.clickLoginButton();
		String expected="SwagLabs";
		String actual=loginpage.isTitleDisplayed();
		Assert.assertEquals(actual,expected ,Constant.invalidcredentialerror);
}
	@Test(priority=3)
	public void verifyValidusernameandInvalidPassword() throws IOException
	{
		String usernamevalue=ExcelUtility.readStringData(2, 0,"login");
		String passwordvalue=ExcelUtility.readStringData(2, 1,"login");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.verifyValidUsernameonUsernamefield(usernamevalue).verifyValidPasswordonPasswordfield(passwordvalue);
		loginpage.clickLoginButton();
		String expected="SwagLabs";
		String actual=loginpage.isTitleDisplayed();
		Assert.assertEquals(actual,expected ,Constant.invalidcredentialerror);
}
	@Test(priority=4,description="user is trying to login with invalid credentials",groups= {"smoke"},dataProvider = "loginProvider")
	public void verifyInvalidusernameandInvalidPassword() throws IOException
	{
		String usernamevalue=ExcelUtility.readStringData(3, 0,"login");
		String passwordvalue=ExcelUtility.readStringData(3, 1,"login");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.verifyValidUsernameonUsernamefield(usernamevalue).verifyValidPasswordonPasswordfield(passwordvalue);
		loginpage.clickLoginButton();
		String expected="SwagLabs";
		String actual=loginpage.isTitleDisplayed();
		Assert.assertEquals(actual,expected ,Constant.invalidcredentialerror);
}

}
