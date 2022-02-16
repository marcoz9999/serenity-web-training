@APITesting
Feature: Book Store API Testing
  @AuthTokenGeneration
  Scenario: AUTH create token using POST
    When  sending a POST request as ""
    Then a new AUTH Token will be created
  @Post
  Scenario: Add information for Booking Id
    When  sending a Post request with Json as ""
    Then  successful addition should happen
  @Get
  Scenario: Request information for Booking Id
    When  sending a Get request for booking Id as 1
    Then  the result booking should be shown
  @Put
  Scenario: Update information for Booking Id
    When  sending a Update request for booking Id as 1
    Then  successful update should happen
  @Patch
  Scenario: Partially Update information for Booking Id
    When  sending a Patch request for booking Id as 1
    Then  successful partial update should happen
  @Delete
  Scenario: Delete information for Booking Id
    When  sending a Delete request for booking Id as 10
    Then  successful delete should happen