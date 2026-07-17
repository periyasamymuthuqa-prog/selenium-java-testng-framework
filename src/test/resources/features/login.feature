Feature: User Login Validation


Scenario: Validate successful login


Given user opens the application

When user enters valid username and password

And clicks on login button

Then user should navigate to inventory page
