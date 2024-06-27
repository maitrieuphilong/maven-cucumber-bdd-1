Feature: Facebook login page

  @Regression
  Scenario: verify login page
    Given Open facebook website
    Then Verify email textbox is display
    And Verify password textbox is display
		And Close browser
