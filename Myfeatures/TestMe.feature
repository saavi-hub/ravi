Feature: my registration on Test Me application

Background: launch testme app website
    Given application is launched
    
  @Sanity
  Scenario: user access to signup tab on website
    Given testme app website is launched
    And user clicks on signup btn
    When user enter proper data
    Then clicks on register btn

  @Sanity
  Scenario Outline: user access to login for registered member
    Given Registered user clicks on Signin link
    And he provides valid  username"<uname>"
    And he provides valid password for login"<pwd>"
    When clicks on login btn for the login validation

    Examples: 
      | uname    | pwd       |
      | NamrataS | pass123   |
      | saavi1   | saavi@123 |
      
      
  @Sanity
  Scenario: user access to search item
    Given user searches for item
    And types the item name on search tab
    When user clicks on search tab
    Then page with item information is displayed
    
    @Sanity
  Scenario: user access to add cart
    Given user searches for required item
    And  clicks on add to cart
    When user clicks on add to cart btn
    Then product is succesfully added
      
      
     