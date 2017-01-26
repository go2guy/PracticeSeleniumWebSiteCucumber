Feature: Navigate Menu Links

#  Scenario: As a user I want to be able to navigate the menu page links
#
#    Given Menu link is visible
#    When I click on Menu
#    Then the page title is Menu
#    
#    Given Our Passion link is visible
#    When I click on Our Passion
#    Then the page title is Our Passion
#    
##    Given Let's Talk Tea link is visible
##    When I click on Let's Talk Tea
##    Then the page title is Let's Talk Tea
#    
#    Given Welcome link is visible
#    When I click on Welcome
#    Then the page title is Welcome
    
#    Scenario Outline: click links
#    
#    Given <link> link is visible
#    When I click on <link>
#    Then the page title is <title>
#    
#    Examples:
#    | link | title |
#    | Menu | Menu |
#    | Our Passion | Our Passion |
#    | Welcome | Welcome |
#    | Check Out | Check Out |
    
    Scenario: click links
    
    Given Menu link is visible
    When I click on 
    | linkvalue |
    | Menu |
    | Our Passion | 
    | Welcome | 
    | Check Out | 
    Then the page title is Check Out
 
  