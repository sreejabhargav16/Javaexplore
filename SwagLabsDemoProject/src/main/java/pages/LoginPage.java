package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {

	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="user-name")WebElement username;
	@FindBy(name="password")WebElement password;
	@FindBy(xpath="//input[@id='login-button']")WebElement login;
	@FindBy(xpath="//div[@class='login_logo']")WebElement text;
	@FindBy(xpath="//span[@class='title']")WebElement header;
	
	public LoginPage verifyValidUsernameonUsernamefield(String usernamevalue)

	{
		username.sendKeys(usernamevalue);
		return this;
	}
	public LoginPage verifyValidPasswordonPasswordfield(String passwordvalue)
	{
		password.sendKeys(passwordvalue);
		return this;
	}
public void clickLoginButton()
{
	WaitUtility wait=new WaitUtility();
wait.waitUntilElementToBeClickable(driver, login);
	login.click();
	}
public boolean isLoginButonClickable()
{
	return login.isEnabled();
}
public String isTitleDisplayed() {
	return text.getText();
}
}
