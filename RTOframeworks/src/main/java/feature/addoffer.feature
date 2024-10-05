Feature: Add offer Successfully

  Scenario: Add offer Successfully
    Given I want to login with <Email> as "vonor31297@qiradio.com" and <password> as "Shah@123"
    And Click on offer text
    When Click on add button
    And Add Personal Information
    And Address Information
    Then Specific Information
    And Course Information
    And Service Information
