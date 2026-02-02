package com.orangehrmtests.automation.step_definitions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.orangehrmtests.automation.page_objects.PimPage;
import com.orangehrmtests.automation.utils.UserActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PimPageStepDefinitions {
	private UserActions userActions = new UserActions();
	private PimPage pimPage = new PimPage();

	@When("Cliquer sur le boutton pim")
	public void cliquerSurLeBouttonPim() {
		userActions.btnClick(PimPage.pimButton);
	}
	@Then("Verifier la redirection vers la page pim")
	public void verifierLaRedirectionVersLaPagePim() {

	}
	@Given("Cliquer sur le boutton Add")
	public void cliquerSurLeBouttonAdd() {
		userActions.btnClick(PimPage.addBtn);
	}
	@When("Redirection vers la page d ajout d employee")
	public void redirectionVersLaPageDAjoutDEmployee() {

	}
	@When("Saisir le first name de l employee {string}")
	public void saisirLeFirstNameDeLEmployee(String string) {
		userActions.fillInput(PimPage.firstNameField, string);
	}
	@When("Saisir le middle name de l employee {string}")
	public void saisirLeMiddleNameDeLEmployee(String string) {
		userActions.fillInput(PimPage.middleNameField, string);
	}
	@When("Saisir le last name de l employee {string}")
	public void saisirLeLastNameDeLEmployee(String string) {
		userActions.fillInput(PimPage.lastNameField, string);
	}
	@When("Ajouter un photo de profil")
	public void ajouterUnPhotoDeProfil() {

	}
	@When("Cliquer sur le bouton save")
	public void cliquerSurLeBoutonSave() {
		userActions.btnClick(PimPage.saveBtn);
	}
	@Then("Verifier l ajout d employee")
	public void verifierLAjoutDEmployee() {
		pimPage.verifAjout();
	}

	@When("Cliquer sur le bouton create login details")
	public void cliquerSurLeBoutonCreateLoginDetails() {
		userActions.btnClick(PimPage.loginDetailBtn);
	}
	@When("Saisir le username {string}")
	public void saisirLeUsername(String string) {
		userActions.fillInput(PimPage.userNameField, string);
	}
	@When("Choisir le status {string}")
	public void choisirLeStatus(String string) {

	}
	@When("Saisir un password valide {string}")
	public void saisirUnPasswordValide(String string) {
		userActions.fillInput(PimPage.passWordField, string);
	}
	@When("Confirmer le password {string}")
	public void confirmerLePassword(String string) {
		userActions.fillInput(PimPage.confirmPassField, string);
	}

	@Then("Verifier le message d erreur")
	public void verifierLeMessageDErreur() {

	}

	@When("Verifier le champ id est disabled")
	public void verifierLeChampIdEstDisabled() {
		userActions.wait.until(ExpectedConditions.visibilityOf(PimPage.nameToVerif));
		pimPage.verifInputFieldType();
	}






}
