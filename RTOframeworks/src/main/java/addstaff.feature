Feature: Add staff

  Scenario: Add staff successfully
    Given I want to login witth <email> as "vonor31297@qiradio.com" and <password> as "Shah@123"
    And CLick on staff text
    When Add personal information
    And Add Employment information
    And Add System Access Information