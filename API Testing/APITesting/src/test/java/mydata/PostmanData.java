package mydata;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import  io.restassured.path.json.JsonPath;

public class PostmanData {

	@Test
	public void localTest() {
		/**
		 * Get Json and Access
		 */
		RestAssured.baseURI = "http://localhost:3000/";
		String response  = given().log().all().header("Content-Type","application/json")
				.body("[\n"
						+ "    {\n"
						+ "        \"Name\": \"Kumaresan\",\n"
						+ "        \"Age\": 25,\n"
						+ "        \"CourseCompleted\": \"MCA\",\n"
						+ "        \"CourseCurrentlyGoing\": \"Java Selenium\",\n"
						+ "        \"Skills\": [\n"
						+ "            \"Programming : Java\",\n"
						+ "            \"Automationtool : Selenium\",\n"
						+ "            \"Frameworks : Junit,TestNG,Cucumber\"\n"
						+ "        ],\n"
						+ "        \"SelfProjects\": [\n"
						+ "            \"Project 1 : Automating Forms Validation\",\n"
						+ "            \"Project 2 : Web Scrapping tool for Instagram Insights\"\n"
						+ "        ]\n"
						+ "    }\n"
						+ "]").when().get("/Detail1").then().log().all()
				.assertThat().statusCode(200).extract().response().asString();
		  		System.out.println(response);
		  		/**
		  		 * To get json key and value
		  		 */
		  		JsonPath jp = new JsonPath(response);
		  		
		  		String string = jp.getString("CourseCompleted");
		  		System.out.println(string);
		  		/**
		  		 * POST method
		  		 */
		  		RestAssured.baseURI = "http://localhost:3000";
		  		 String requestBody = "[\n" +
		                 "    {\n" +
		                 "        \"Name\": \"Rakul\",\n" +
		                 "        \"Age\": 25,\n" +
		                 "        \"CourseCompleted\": \"MCA\",\n" +
		                 "        \"CourseCurrentlyGoing\": \"Flutter\",\n" +
		                 "        \"Skills\": [\n" +
		                 "            \"Programming : React\",\n" +
		                 "            \"Automationtool : TypeScript\",\n" +
		                 "            \"Frameworks : Grapejs\"\n" +
		                 "        ],\n" +
		                 "        \"SelfProjects\": [\n" +
		                 "            \"Project 1 : E-commerce app\",\n" +
		                 "            \"Project 2 : Flutter app\"\n" +
		                 "        ]\n" +
		                 "    }\n" +
		                 "]";

		         // Send the POST request and capture the response
		         String POST_CREATE = given()
		                 .header("Content-Type","application/json") // Set the content type to JSON
		                 .body(requestBody)             // Set the request body
		                 .when().post("/Detail2")
		 				.then().log().all().assertThat().statusCode(200)
		 				.extract().response().asString();

		         // Print the response
		         System.out.println(POST_CREATE);
		     
	}

}
