@language:en
Feature: Login to the system
#Cette fonctionalite couvre la story JIR-0001 sur jira
  Scenario: As a user,I should be able to login
    Given I user "admin" with the password "!23456789*&^%$#@" and the "Administrator" role
    When I submit my credentials as
      | username | password         | role          |
      | admin    | !23456789*&^%$#@ | Administrator |
    Then "Login succeeded" as "Administrator"