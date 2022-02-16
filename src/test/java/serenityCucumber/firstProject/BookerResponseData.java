package serenityCucumber.firstProject;

import org.json.JSONObject;

public class BookerResponseData {
        //Creating a JSON Object
        /*JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", "admin");
        jsonObject.put("password", "password123");
        //Converting JSON Object using toString() method
        String jsonPostAuthToken = jsonObject.toString();*/


        //Post Request Data
        String jsonPostAuthToken = "{\"username\": \"admin\"," +
              "\"password\": \"password123\"}";

        String authToken = "token=da111c106f9cb50";
        //Get
        Integer bookingId = 1;
        //Post
        String jsonPostData = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        //Put
        String jsonPutData = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        //Patch
        String jsonPatchData = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        //Delete
        Integer deleteBookingId = 10;
}