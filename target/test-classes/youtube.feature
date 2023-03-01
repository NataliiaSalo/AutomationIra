Feature: Youtube
  Background:
  Scenario: Hello Youtube
    Given Log in to Youtube
    When Fill out word 'Xpath'
    And Click on Search button
    Then Verify that 'Xpath' word contains in title video

#  @selenium
#  Scenario Outline:
#    Given Log in to Youtube as <user>
#    When Fill out word 'xpath'
#    And Click on Search button
#    Then Verify that xpath word contains in title video
#
#    Examples:
#      |user      |
#      |guest     |
#      |"Nataliia"|