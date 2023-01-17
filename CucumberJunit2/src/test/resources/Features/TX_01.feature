@tag
Feature: Prompto Portal Add,Open,Search,Edit and Delete a Project

  Scenario: validating the Prompto Portal
    Given user goes to prompto portal
    When user with valid credentials they login
    Then user add new project
    When user fill all the fields with valid data
    Then user add image
    When user check if your project is added
    Then user update the project
    When user Archive a Project
    Then user check the project is Archived or not
    Then user use sort to display the project in ascending and descending order
    Then user upload the file in media
    Then user click action button and perform any method 
    Then user click usp and cancel it edit it and add it and also check the checkbox
    Then verifing turntable
    Then Verify Field builder

    