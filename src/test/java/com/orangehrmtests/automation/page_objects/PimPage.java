package com.orangehrmtests.automation.page_objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.orangehrmtests.automation.utils.ConfigFileReader;
import com.orangehrmtests.automation.utils.Setup;

public class PimPage {
	private ConfigFileReader configFileReader;
	
	@FindBy(how = How.XPATH , using="//aside[@class='oxd-sidepanel']//li[2]")
	public static WebElement pimButton;
	
	@FindBy(how = How.XPATH , using="//button[normalize-space()='Add']")
	public static WebElement addBtn;
	
	@FindBy(how = How.XPATH , using="//button[normalize-space()='Save']")
	public static WebElement saveBtn;
	
	@FindBy(how = How.XPATH , using="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	public static WebElement loginDetailBtn;
	
	@FindBy(how = How.XPATH , using="//input[@placeholder='First name']")
	public static WebElement firstNameField;
	
	@FindBy(how = How.XPATH , using="//input[@placeholder='Middle name']")
	public static WebElement middleNameField;
	
	@FindBy(how = How.XPATH , using="//input[@placeholder='Last Name']")
	public static WebElement lastNameField;
	
	@FindBy(how = How.XPATH , using="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")
	public static WebElement userNameField;
	
	@FindBy(how = How.XPATH , using="//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	public static WebElement passWordField;
	
	@FindBy(how = How.XPATH , using="//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	public static WebElement confirmPassField;
	
	@FindBy(how = How.CSS , using=".oxd-text.oxd-text--h6.--strong")
	public static WebElement nameToVerif;
	
	@FindBy(how = How.XPATH , using="(//input[@class='oxd-input oxd-input--active'])[2]")
	public static WebElement employeeId;
	
	public PimPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	/* methods */
	
	public void verifAjout () {
		String linkToCheck = Setup.getDriver().getCurrentUrl();
		assertTrue(linkToCheck.contains("web/index.php/pim/viewPersonalDetails/empNumber/"));
	}
	
	public void verifInputFieldType () {
		assertFalse(employeeId.isEnabled());
	}
}
