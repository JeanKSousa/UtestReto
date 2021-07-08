#Autor: Jean Sousa
  @stories
  Feature: Register an user
    As an user, i want to register on Utest
  @scenario
  Scenario: Register an user
    Given I enter to utest
    When I type my personal information on the form
      |firstName|lastName|email            |month|day|year|language |city    |postal|country|computer|version  |mobil|model   |system    |password     |question|
      |Juan     |Arias   |j.arias@gmail.com|June |12 |1992|Albanian |Veracruz|507   |Panama |Windows |Windows 8|Apple|iPhone 4|iOS 11.1.1|Choucair2021*|Complete Setup|
    Then Successfully registered

