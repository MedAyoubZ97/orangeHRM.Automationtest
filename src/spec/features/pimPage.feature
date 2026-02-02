@PimPage
Feature: je veux verifier la page Pim 
  en tant qu administrateur je veux acceder a la page pim pour gerer les employee
  Background:
   Given Acceder a la page de login
   When Remplir le champ username "Admin"
   And Remplir le champ password "admin123"
   And Cliquer sur le boutton login
   And Redirection vers la page d acceuil
   And Cliquer sur le boutton pim
   Then Verifier la redirection vers la page pim
   
  @TC020
  Scenario: Etant donnée admin quand je clique sur le bouton add alors redirection vers la page d ajout d un employee
  Given Cliquer sur le boutton Add
  When Redirection vers la page d ajout d employee
  And Saisir le first name de l employee "foulen"
  And Saisir le middle name de l employee "ben foulen"
  And Saisir le last name de l employee "elfouleni"
  And Ajouter un photo de profil
  And Cliquer sur le bouton save
  Then Verifier l ajout d employee
  
  @AjouterUnEmployeeSansLastNameSansLoginDetails
  Scenario: Etant donnée admin quand je clique sur le bouton add alors redirection vers la page d ajout d un employee
  Given Cliquer sur le boutton Add
  When Redirection vers la page d ajout d employee
  And Saisir le first name de l employee "foulen"
  And Saisir le middle name de l employee "ben foulen"
  And Ajouter un photo de profil
  And Cliquer sur le bouton save
  Then Verifier le message d erreur
  
   @AjouterUnEmployeeSansFirstNameSansLoginDetails
  Scenario: Etant donnée admin quand je clique sur le bouton add alors redirection vers la page d ajout d un employee
  Given Cliquer sur le boutton Add
  When Redirection vers la page d ajout d employee
  And Saisir le middle name de l employee "ben foulen"
  And Saisir le last name de l employee "elfouleni"
  And Ajouter un photo de profil
  And Cliquer sur le bouton save
  Then Verifier le message d erreur
  
   @AjouterUnEmployeeSansPhotoSansLoginDetails
  Scenario: Etant donnée admin quand je clique sur le bouton add alors redirection vers la page d ajout d un employee
  Given Cliquer sur le boutton Add
  When Redirection vers la page d ajout d employee
  And Saisir le first name de l employee "foulen"
  And Saisir le middle name de l employee "ben foulen"
  And Saisir le last name de l employee "elfouleni"
  And Cliquer sur le bouton save
  Then Verifier l ajout d employee
  
  @AjouterUnEmployeeModifierLidSansLoginDetails
  Scenario: Etant donnée admin quand je clique sur le bouton add alors redirection vers la page d ajout d un employee
  Given Cliquer sur le boutton Add
  When Redirection vers la page d ajout d employee
  And Saisir le first name de l employee "foulen"
  And Saisir le middle name de l employee "ben foulen"
  And Saisir le last name de l employee "elfouleni"
  And Verifier le champ id est disabled
  And Cliquer sur le bouton save
  Then Verifier l ajout d employee
  
  @TC021
  Scenario: Etant donnée admin quand je clique sur le bouton add alors redirection vers la page d ajout d un employee avec login details
  Given Cliquer sur le boutton Add
  When Redirection vers la page d ajout d employee
  And Saisir le first name de l employee "ala"
  And Saisir le middle name de l employee "ben ali"
  And Saisir le last name de l employee "elelleni"
  And Ajouter un photo de profil
  And Cliquer sur le bouton create login details
  And Saisir le username "AAelleni"
  And Choisir le status "disabled"
  And Saisir un password valide "alaBAE1/987*"
  And Confirmer le password "alaBAE1/987*"
  And Cliquer sur le bouton save
  Then Verifier l ajout d employee
  
  @TC023
  Scenario: Etant donnée admin quand je clique sur le bouton add alors redirection vers la page d ajout d un employee avec login details
  Given Cliquer sur le boutton Add
  When Redirection vers la page d ajout d employee
  And Saisir le first name de l employee "ala"
  And Saisir le middle name de l employee "ben ali"
  And Saisir le last name de l employee "elelleni"
  And Ajouter un photo de profil
  And Cliquer sur le bouton create login details
  And Choisir le status "disabled"
  And Saisir un password valide "alaBAE1/987*"
  And Confirmer le password "alaBAE1/987*"
  And Cliquer sur le bouton save
  Then Verifier l ajout d employee
  
   @TC022
  Scenario: Etant donnée admin quand je clique sur le bouton add alors redirection vers la page d ajout d un employee avec login details
  Given Cliquer sur le boutton Add
  When Redirection vers la page d ajout d employee
  And Saisir le first name de l employee "ala"
  And Saisir le middle name de l employee "ben ali"
  And Saisir le last name de l employee "elelleni"
  And Ajouter un photo de profil
  And Cliquer sur le bouton create login details
  And Saisir le username "AAelleni"
  And Choisir le status "disabled"
  And Confirmer le password "alaBAE1/987*"
  And Cliquer sur le bouton save
  Then Verifier le message d erreur
  
  @AjouterUnEmployeeSansConfirmationPasswordAvecLoginDetails
  Scenario: Etant donnée admin quand je clique sur le bouton add alors redirection vers la page d ajout d un employee avec login details
  Given Cliquer sur le boutton Add
  When Redirection vers la page d ajout d employee
  And Saisir le first name de l employee "ala"
  And Saisir le middle name de l employee "ben ali"
  And Saisir le last name de l employee "elelleni"
  And Ajouter un photo de profil
  And Cliquer sur le bouton create login details
  And Saisir le username "AAelleni"
  And Choisir le status "disabled"
  And Saisir un password valide "alaBAE1/987*"
  And Confirmer le password "alaBAE1/987*"
  And Cliquer sur le bouton save
  Then Verifier le message d erreur
  
  @AjouterUnEmployeeAvecunPasswordInvalideAvecLoginDetails
  Scenario: Etant donnée admin quand je clique sur le bouton add alors redirection vers la page d ajout d un employee avec login details
  Given Cliquer sur le boutton Add
  When Redirection vers la page d ajout d employee
  And Saisir le first name de l employee "ala"
  And Saisir le middle name de l employee "ben ali"
  And Saisir le last name de l employee "elelleni"
  And Ajouter un photo de profil
  And Cliquer sur le bouton create login details
  And Saisir le username "AAelleni"
  And Choisir le status "disabled"
  And Saisir un password valide "alaBAE"
  And Confirmer le password "alaBAE"
  And Cliquer sur le bouton save
  Then Verifier le message d erreur
  
  
  