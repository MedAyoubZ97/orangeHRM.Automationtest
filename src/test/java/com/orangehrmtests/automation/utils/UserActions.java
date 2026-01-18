package com.orangehrmtests.automation.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserActions {
	public WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));

	public void btnClick(WebElement btnElement) {
		wait.until(ExpectedConditions.visibilityOf(btnElement));
		btnElement.click();
	}

	public void fillInput(WebElement inputToFill, String textToFill) {
		wait.until(ExpectedConditions.visibilityOf(inputToFill));
		inputToFill.clear();
		inputToFill.sendKeys(textToFill);
	}

	public void textVerification(WebElement elementToVerify, String txtToVerify) {

		wait.until(ExpectedConditions.visibilityOf(elementToVerify));
		assertEquals(elementToVerify.getText(), txtToVerify);

	}

}
