Feature: New User creation

  Scenario Outline: Test the functionality to test new user creation.
    Given User opens the application and navigate to sign up page
    When User enters Salutation "<Salutation>",First Name"<FirstName>",Last Name"<LastName>"
    And User Enters Email id"<EmailId>",Contact Number"<ContactNumber>",UserName"<UserName>",Password"<Password>"
    And User clicks on submit button
    Then New user should be created with given details
    Examples:
      | Salutation | FirstName     | LastName     | EmailId        | ContactNumber | UserName     | Password          |
      | Mr         | TestFirstName | TestLastName | test@gmail.com | 789456387     | testUserName | testPassword@2024 |