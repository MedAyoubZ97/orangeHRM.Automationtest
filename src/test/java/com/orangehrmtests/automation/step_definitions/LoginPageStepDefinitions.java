package com.orangehrmtests.automation.step_definitions;

import com.orangehrmtests.automation.page_objects.LoginPage;
import com.orangehrmtests.automation.utils.UserActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinitions {
	private LoginPage loginPage = new LoginPage();
	private UserActions userActions = new UserActions();

	@Given("Acceder a la page de login")
	public void accederALaPageDeLogin() {
		loginPage.goToUrl();
	}

	@When("Remplir le champ username {string}")
	public void remplirLeChampUsername(String username) {
		userActions.fillInput(LoginPage.usernameField, username);

	}

	@When("Remplir le champ password {string}")
	public void remplirLeChampPassword(String password) {
		userActions.fillInput(LoginPage.passwordField, password);

	}

	@When("Cliquer sur le boutton login")
	public void cliquerSurLeBouttonLogin() {
		userActions.btnClick(LoginPage.loginBtn);
	}

	@Then("verifier le message d erreur s affiche")
	public void verifierLeMessageDErreurSAffiche() {
		userActions.textVerification(LoginPage.errorMsgLogin, "Invalid credentials");

	}

	@Then("verifier les champs vide affiche un erreur")
	public void verifierLesChampsVideAfficheUnErreur() {
		loginPage.verifChampCssValue(LoginPage.usernameField);
		loginPage.verifChampCssValue(LoginPage.passwordField);
	}

	@Then("verifier le champ password vide affiche un erreur")
	public void verifierLeChampPasswordVideAfficheUnErreur() {
		loginPage.verifChampCssValue(LoginPage.passwordField);

	}

	@Then("verifier le champ username vide affiche un erreur")
	public void verifierLeChampUsernameVideAfficheUnErreur() {
		loginPage.verifChampCssValue(LoginPage.usernameField);
	}

	@Then("Redirection vers la page d acceuil")
	public void redirectionVersLaPageDAcceuil() {
		loginPage.verifyRedirection();

	}

	@Then("Cliquer sur le lien hypertext Forgot Password")
	public void cliquerSurLeLienHypertextForgotPassword() {
		userActions.btnClick(LoginPage.forgotPasswordLink);

	}

	@Then("Remplir le champ username avec username {string}")
	public void remplirLeChampUsernameAvecUsername(String username) {
		userActions.fillInput(LoginPage.resetUsernameField, username);
	}

	@Then("Cliquer sur le boutton reset password")
	public void cliquerSurLeBouttonResetPassword() {
		userActions.btnClick(LoginPage.resetPassBtn);

	}

	@Then("Un pop up s affiche {string}")
	public void unPopUpSAffiche(String text) {
		userActions.textVerification(LoginPage.requiredText, text);

	}

}
