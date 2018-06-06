
Feature: Login

  Background:
    Given I open the Videofizz app

    #Test case: To check if user can login successfully with valid credentials
    Scenario: Login with valid credentials
      And I enter valid email id in the "Email Address" field
      And I enter valid password in the "Password" field
      And I tap on the "signin" button on the "Login Screen"
      Then I should be logged in successfully

    # Test case: To check if user can login with invalid credentials (invalid password)
  Scenario: Login with invalid password
    When I tap on the "SignIn" button on the "Welcome Screen"
    And I enter invalid email id in the "Email Address" field
    And I enter valid password in the "Password" field
    And I tap on the "signin" button on the "Login Screen"
    Then I should see a validation message "Email or password is incorrect"

    # Test case: To check if user can login with invalid credentials (invalid email)
  Scenario: Login with invalid email address
    When I tap on the "SignIn" button on the "Welcome Screen"
    And I enter valid email id in the "Email Address" field
    And I enter invalid password in the "Password" field
    And I tap on the "signin" button on the "Login Screen"
    Then I should see a validation message "Email or password is incorrect"


    # Test case: To check if user can login with invalid username format
  Scenario: Login with username of invalid email format
    When I tap on the "SignIn" button on the "Welcome Screen"
    And I enter email id of invalid format in the "Email Address" field
    And I enter valid password in the "Password" field
    And I tap on the "signin" button on the "Login Screen"
    Then I should see a validation message "Wrong email format"

    # Test case: To check if user can login with facebook successfully (using facebook app where user has not logged in the app)
  Scenario: Login with facebook
    When I tap on the "SignIn" button on the "Welcome Screen"
    And I tap on the "Sign in with Facebook" button on the "Login Screen"
    And I enter the facebook account details to login
    And I tap on "Continue" button
    Then I should be logged in successfully with facebook account

    # Test case: To check if user can login with facebook successfully (user has logged in earlier)
  Scenario: Re-Login with facebook
    When I tap on the "SignIn" button on the "Welcome Screen"
    And I tap on the "Sign in with Facebook" button on the "Login Screen"
    #And I enter the facebook account details to login
    #And I tap on "Continue" button
    Then I should be logged in successfully with facebook account