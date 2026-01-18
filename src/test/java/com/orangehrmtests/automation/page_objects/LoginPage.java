package com.orangehrmtests.automation.page_objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrmtests.automation.utils.ConfigFileReader;
import com.orangehrmtests.automation.utils.Setup;

public class LoginPage {
	private ConfigFileReader configFileReader;
	public WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
	/* Find By */
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	public static WebElement usernameField;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	public static WebElement passwordField;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public static WebElement loginBtn;

	@FindBy(how = How.XPATH, using = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	public static WebElement forgotPasswordLink;

	@FindBy(how = How.XPATH, using = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	public static WebElement errorMsgLogin;

	@FindBy(how = How.CSS, using = "button[type='submit']")
	public static WebElement resetPassBtn;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Username']")
	public static WebElement resetUsernameField;

	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='Reset Password link sent successfully']")
	public static WebElement resetText;

	@FindBy(how = How.XPATH, using = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	public static WebElement requiredText;

	public LoginPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	/* methods */

	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("orangehrm.url"));
	}

	public void verifChampCssValue(WebElement element) {
		String champColor = Color.fromString(element.getCssValue("border-color")).asHex();
		assertEquals(champColor, "#eb0910");
	}

	public void verifyRedirection() {
		String url = Setup.getDriver().getCurrentUrl();
		assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}

}
