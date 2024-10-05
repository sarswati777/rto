Feature: Edit Staff

  Scenario: Edit Stf
    Given I want to login with <Username> as "vonor31297@qiradio.com" and <password> as "Shah@123"
    And Click on staff text
    When CLick on edit icon
    And Edit personal information
    And Edit employment information
    Then Edit System Access Information