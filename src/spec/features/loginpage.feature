@login
Feature: je veux verifier la page login 
  en tant qu utilisateur je veux acceder au compt pour gerer mon profile

  @loginValideInvalide
  Scenario: Etant donnée utilisateur quand je saisit un usarname existe et un password inexistant 
   Given Acceder a la page de login
   When Remplir le champ username "Admin"
   And Remplir le champ password "987654"
   And Cliquer sur le boutton login
   Then verifier le message d erreur s affiche
  @loginInvalideValide
  Scenario: Etant donnée utilisateur quand je saisit un usarname inexistant et un password existe
   Given Acceder a la page de login
   When Remplir le champ username "ayoub"
   And Remplir le champ password "admin123"
   And Cliquer sur le boutton login
   Then verifier le message d erreur s affiche
  @loginInvalideInvalide
  Scenario: Etant donnée utilisateur quand je saisit un usarname inexistant et password inexistant
   Given Acceder a la page de login
   When Remplir le champ username "ayoub"
   And Remplir le champ password "987654"
   And Cliquer sur le boutton login
   Then verifier le message d erreur s affiche
  @loginCredVide
  Scenario: Etant donnée utilisateur quand je saisit un usarname et password vide
   Given Acceder a la page de login
   When Remplir le champ username ""
   And Remplir le champ password ""
   And Cliquer sur le boutton login
   Then verifier les champs vide affiche un erreur
  @loginValideVide
  Scenario: Etant donnée utilisateur quand je saisit un usarname valide et password vide
   Given Acceder a la page de login
   When Remplir le champ username "Admin"
   And Remplir le champ password ""
   And Cliquer sur le boutton login
   Then verifier le champ password vide affiche un erreur
  @loginVideValide
  Scenario: Etant donnée utilisateur quand je saisit un usarname vide et password valide
   Given Acceder a la page de login
   When Remplir le champ username ""
   And Remplir le champ password "admin123"
   And Cliquer sur le boutton login
   Then verifier le champ username vide affiche un erreur
   @loginInvalideCaseSenstive
  Scenario: Etant donnée utilisateur quand je saisit un usarname casesenstive et password casesenstive
   Given Acceder a la page de login
   When Remplir le champ username "admin"
   And Remplir le champ password "Admin123"
   And Cliquer sur le boutton login
   Then verifier le message d erreur s affiche
  @loginValide
  Scenario: Etant donnée utilisateur quand je saisit un usarname valide existe et password valide existe 
   Given Acceder a la page de login
   When Remplir le champ username "Admin"
   And Remplir le champ password "admin123"
   And Cliquer sur le boutton login
   Then Redirection vers la page d acceuil
  @resetPasswordValide
  Scenario: Etant donnée utilisateur quand je clique sur forgot password je veut reinisialiser mon mot de passe avec username existant
   Given Acceder a la page de login
   Then Cliquer sur le lien hypertext Forgot Password
   And Remplir le champ username avec username "Admin"
   And Cliquer sur le boutton reset password
   Then Un pop up s affiche "Reset Password link sent successfully"
  @resetPasswordInvalide
  Scenario: Etant donnée utilisateur quand je clique sur forgot password je veut reinisialiser mot de passe avec username inexistant
   Given Acceder a la page de login
   Then Cliquer sur le lien hypertext Forgot Password
   And Remplir le champ username avec username "ayoub"
   And Cliquer sur le boutton reset password
   Then Un pop up s affiche "Username inexistant"
   
