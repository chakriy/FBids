Feature: Capturing IdButtons In Facebook Login Page
  Scenario: IdButtons In Facebook
    Given I Have a Chrome Browser Opened
    When Open Facebook Login Page
    And Capture all Id's in loginPage
    Then Quit the Chrome Browser

