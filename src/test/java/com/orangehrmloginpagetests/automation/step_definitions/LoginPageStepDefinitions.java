package com.orangehrmloginpagetests.automation.step_definitions;

import com.orangehrmloginpagetests.automation.page_objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinitions {
	private LoginPage loginPage = new LoginPage();
	

	@Given("Acceder a la page de login")
	public void accederALaPageDeLogin() {
		loginPage.goToUrl();
	}
	@When("Remplir le champ username {string}")
	public void remplirLeChampUsername(String username){
		loginPage.fillUsername(username);

	}
	@When("Remplir le champ password {string}")
	public void remplirLeChampPassword(String password){
		loginPage.fillPassword(password);

	}
	@When("Cliquer sur le boutton login")
	public void cliquerSurLeBouttonLogin(){
		loginPage.clicLoginBtn();
	}
	@Then("verifier le message d erreur s affiche")
	public void verifierLeMessageDErreurSAffiche()  {
		loginPage.verifyErrMsg();

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
		loginPage.clickHyperlink();

	}
	@Then("Remplir le champ username avec username {string}")
	public void remplirLeChampUsernameAvecUsername(String username) {
		loginPage.fillResetUsername(username);
	}
	@Then("Cliquer sur le boutton reset password")
	public void cliquerSurLeBouttonResetPassword() {
		loginPage.resetPasswordClick();

	}
	@Then("Un pop up s affiche {string}")
	public void unPopUpSAffiche(String string) {
		loginPage.verifyReset(string);

	}
	

}
