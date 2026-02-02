@Admin
Feature: je veux verifier la page Admin 
  en tant qu administrateur je veux acceder a la page admin pour gerer mon les utilisateurs
  Background:
   Given Acceder a la page de login
   When Remplir le champ username "Admin"
   And Remplir le champ password "admin123"
   And Cliquer sur le boutton login
   And Redirection vers la page d acceuil
   And Cliquer sur le boutton Admin
   Then Verifier la redirection vers la page admin


  @AjouterUnUtilisateurCasValide
  Scenario: Etant donnée admin quand je clique sur le bouton add alors redirection vers la page d ajout d un employee
  Given Cliquer sur le boutton Add
  When Redirection vers la page d ajout d utilisateur
  And Choisir un role pour l utilisateur
  And Saisir le nom de l employee "foulen"
  And Choisir un statut pour l utilisateur
  And Saisir un username pour l employee "ellen"
  And Saisir un password valide "foulenBenfoulen1/"
  And Confirmer le password "foulenBenfoulen1"
  Then Cliquer sur le bouton save
  
  @AjouterUnUtilisateurSansRole
  Scenario: Etant donnée admin quand je clique sur le bouton add alors redirection vers la page d ajout d un employee
  Given Cliquer sur le boutton Add
  When Redirection vers la page d ajout d utilisateur
  And Saisir le nom de l employee "foulen"
  And Choisir un statut pour l utilisateur
  And Saisir un username pour l employee "ellen"
  And Saisir un password valide "foulenBenfoulen1/"
  And Confirmer le password "foulenBenfoulen1"
  Then Cliquer sur le bouton save
  
 @AjouterUnUtilisateurSansNom
  Scenario: Etant donnée admin quand je clique sur le bouton add alors redirection vers la page d ajout d un employee
  Given Cliquer sur le boutton Add
  When Redirection vers la page d ajout d utilisateur
  And Choisir un role pour l utilisateur
  And Saisir le nom de l employee "foulen"
  And Choisir un statut pour l utilisateur
  And Saisir un username pour l employee "ellen"
  And Saisir un password valide "foulenBenfoulen1/"
  And Confirmer le password "foulenBenfoulen1"
  Then Cliquer sur le bouton save