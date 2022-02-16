package serenityCucumber.firstProject;

import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class BookStoreAPI{
    @Steps
    BookerResponseData bookerResponseData = new BookerResponseData();
    String postAuthBody = bookerResponseData.jsonPostAuthToken;
    String postAuthResponse;
    Response response;

    //@Step("Post Valid Credentials to Generate a valid Auth Token")
    public String postRequestForAuthToken(String jsonPostAuthToken) {
        response =
        SerenityRest.given().contentType("application/json")
                .body(postAuthBody)
                .post("/auth")
                .then().contentType(ContentType.JSON).extract().response();
        postAuthResponse = response.asString();
        String responseToken = postAuthResponse.substring(10,25);
        return responseToken;
    }

    @Step("Post a Booking information using the Booking ID")
    public void postRequestBookingId(String jsonPostData) {
        String body = bookerResponseData.jsonPostData;
        System.out.println("Object: "+ body);
        SerenityRest.given().contentType("application/json")
                .body(body)
                .post("/booking");
    }

    @Step("Get a Booking information using the Booking ID")
    public void getRequestBookingId(Integer bookingId) {
        SerenityRest.given().contentType("application/json")
                .get("/booking/"+ bookingId);
    }

    @Step("Put a Booking information using the Booking ID")
    public void putRequestBookingId(Integer bookingId) {
        String token = postRequestForAuthToken(postAuthBody);
        Cookie authCookie = new Cookie.Builder("token", token).build();
        String body = bookerResponseData.jsonPutData;
        SerenityRest.given().contentType("application/json").cookie(authCookie)
                .body(body)
                .put("/booking/"+ bookingId);
    }

    @Step("Patch a Booking information using the Booking ID")
    public void patchRequestBookingId(Integer bookingId) {
        String token = postRequestForAuthToken(postAuthBody);
        Cookie authCookie = new Cookie.Builder("token", token).build();
        String body = bookerResponseData.jsonPatchData;
        SerenityRest.given().contentType("application/json").cookie(authCookie)
                .body(body)
                .patch("/booking/"+ bookingId);
    }

    @Step("Delete a Booking information using the Booking ID")
    public void deleteRequestBookingId(Integer deleteBookingId) {
        String token = postRequestForAuthToken(postAuthBody);
        Cookie authCookie = new Cookie.Builder("token", token).build();
        SerenityRest.given().contentType("application/json").cookie(authCookie)
                .delete("/booking/"+ deleteBookingId);
    }
}