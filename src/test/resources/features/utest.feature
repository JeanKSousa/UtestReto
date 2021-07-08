#Autor: Jean Sousa
  @stories
  Feature: Register an user
    As an user, i want to register on Utest
  @scenario
  Scenario: Register an user
    Given I enter to utest
    When I type my personal information on the form
      |firstName|lastName|email            |month|day|year|language |
      |Juan     |Arias   |j.arias@gmail.com|June |12 |1992|Albanian |
    Then Successfully registered

