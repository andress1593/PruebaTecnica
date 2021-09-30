#Autor: Andres
@stories
Feature: uTest
    As a user, I want to enter the uTest page www.utest.com to create an account

  @scenario1:
  Scenario: Create an account
    Given that Andres wants to create an account in uTest
    When he fills out the registration form
      | strName | strLastName | strEmail                | strCity | strPostal | strCountry | strSystem | strSystemVersion | strLanguage | strMobile | strModel         | strMobileOS | strPassword     |
      | Mariela  | Quintero   | marielasuarez@gmail.com | Itagüi  |  055412   | Colombia   | Windows   | Windows 10       | Spanish     | Xiaomi    | Redmi Note 9 Pro | Android 11  | Screenplay2021* |
    Then he enters the home page
      | strTitle |
      | Welcome to the world's largest community of freelance software testers!|















