Feature: Facebook login page

  @Regression
  Scenario: verify login page
    Given Open facebook website
    Then Verify email textbox is display
    And Verify password textbox is display
    And Close browser

  @datatable_step
  Scenario Outline: Create new Customer with email <Username>
    Given Open facebook website
    When Input to Username and Password
      | Username   | Password   | Address   |
      | <Username> | <Password> | <Address> |
    And Click to Submit button
    And Use multi input to Username and Password
      | Username     | Password | Address      |
      | a1@gmail.com | 12132123 | Cong Hoa     |
      | a2@gmail.com | 45514554 | Truong Chinh |
      | a3@gmail.com | 12132123 | Ut Tich      |
    And Close browser

    Examples: 
      | Username        | Password | Address   | City |
      | auto1@gmail.com |   123123 | 31 Le loi | HCM  |

  @datatable_scenario @data_driven_testing
  Scenario Outline: Data Table in Scenario
    Given Open facebook website
    When Input to Username textbox with "<Username>"
    And Input to Password textbox with "<Password>"
    And Click to Submit button
    And Close browser

    Examples: 
      | Username        | Password |
      | auto1@gmail.com |   123456 |
      | auto2@gmail.com |   654321 |
