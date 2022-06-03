#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login Action

 Scenario: Successful Login with Valid Credentials
    
    Given User is on Login Page
    When User Enters Valid Username and Password
    Then Display Message Credentials Entered
    When Username and Password fields cleared
    Then Display Message Fields cleared
    When User Enters New Username and Password
    Then Display Message Login Successfull with New Credentials