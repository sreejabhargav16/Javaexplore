package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectDropDownWithValue(WebElement element, String value) {
		Select object = new Select(element);
		object.selectByValue(value);
	}

	public void selectDropDownByvisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText("Admin");
	}
	public void selectDropDownByIndex(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText("Admin");
	}
}
