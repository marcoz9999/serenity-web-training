package serenityCucumber.firstProject.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import io.restassured.RestAssured;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import serenityCucumber.firstProject.BookStoreAPI;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class BookStore {
    @Before
    public void before(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
    }

    @Steps
    BookStoreAPI bookStoreAPI;

    //Post Request
    @When("sending a POST request as {}")
    public void bookerPostRequest(String jsonPostAuthToken) {
        bookStoreAPI.postRequestForAuthToken(jsonPostAuthToken);
    }

    @Then("a new AUTH Token will be created")
    public void authTokenValidation() {
        restAssuredThat(response -> response.statusCode(200));
        restAssuredThat(response -> response.toString());
        System.out.println(lastResponse());
    }

    //Post
    @When("sending a Post request with Json as {}")
    public void bookerIdPostRequest(String jsonPostData) {
        bookStoreAPI.postRequestBookingId(jsonPostData);
    }
    @Then("successful addition should happen")
    public void postResultBookingInformation() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Get Request
    @When("sending a Get request for booking Id as {int}")
    public void bookerAllIdGetRequest(Integer bookingId) {
        bookStoreAPI.getRequestBookingId(bookingId);
    }
    @Then("the result booking should be shown")
    public void getResultBookingInformation() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Put
    @When("sending a Update request for booking Id as {int}")
    public void bookerIdPutRequest(Integer bookingId) {
        bookStoreAPI.putRequestBookingId(bookingId);
    }
    @Then("successful update should happen")
    public void putResultBookingInformation() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Patch
    @When("sending a Patch request for booking Id as {int}")
    public void bookerIdPatchRequest(Integer bookingId) {
        bookStoreAPI.patchRequestBookingId(bookingId);
    }
    @Then("successful partial update should happen")
    public void patchResultBookingInformation() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Delete
    @When("sending a Delete request for booking Id as {int}")
    public void bookerIdDeleteRequest(Integer deleteBookingId) {
        bookStoreAPI.deleteRequestBookingId(deleteBookingId);
    }
    @Then("successful delete should happen")
    public void deleteResultBookingInformation() {
        restAssuredThat(response -> response.statusCode(201));
    }
}