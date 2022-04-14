@regression

Feature: Validating select and edit add row timesheet functionalities

   # Will run repeated steps that user has in each scenario
  # @Before method will run
  Background: Repeated first steps in each scenario
    Given user navigates to the HRM app
    When user provides credentials username "Admin" and password "admin123"
    And user navigates to "My Timesheets" page

  @MB4-141
  Scenario: Validating select timesheet for week dropdown

    Then user chooses and clicks one of the "weeks" weeks from dropdown
    And user validates the desired "week" week is selected
      # @After method will run

  @MB4-145
  Scenario:  Validating edit add row timesheet functionality

    Then user adds a row to the "week" week
    And user validates the row is added
      # @After method will run