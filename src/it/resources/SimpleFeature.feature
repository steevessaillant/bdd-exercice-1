@language:en
Feature: Login to the system
#Cette fonctionalite couvre la story JIR-0001 sur jira add comments

  Scenario: As a user,I should be able to login
    Given I user "admin" with the password "!23456789*&^%$#@" and the "ADMIN" role
    When I submit my credentials for login as
      | username | password         | role          |
      | admin    | !23456789*&^%$#@ | Administrator |
    Then the system will return an authenticated ADMIN user