#Autor: Jean Sousa
  @stories
  Feature: Register an user
    As an user, i want to register on Utest
  @scenario
  Scenario: Register an user
    Given I enter to utest
    When I type my personal information on the form
      |firstName|lastName|email            |month|day|year|language |city    |postal|country   |computer|version  |mobil|model   |system    |password     |question|
      |Maria    |Loren   |M.Loren@gmail.com|June |10 |1999|Arabic   |Veracruz|507   |Colombia  |Windows |Vista    |Apple|iPhone 4|iOS 11.1.1|Choucair2021*|Complete Setup|
    Then Successfully registered

