package mydata;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class PostmanData {

	@Test
	public void localTest() {
		/**
		 * Get Json and Access
		 */
		RestAssured.baseURI = "http://localhost:3000/";
		String response = given().log().all().header("Content-Type", "application/json")
				.body("[\n"
						+ "    {\n"
						+ "        \"id\": 2,\n"
						+ "        \"Name\": \"Anish\",\n"
						+ "        \"Age\": 25,\n"
						+ "        \"CourseCompleted\": \"MCA\",\n"
						+ "        \"CourseCurrentlyGoing\": \"Photoshop\",\n"
						+ "        \"Skills\": [\n"
						+ "            \"Programming : Java\",\n"
						+ "            \"Automation Tool : Selenium\",\n"
						+ "            \"Frameworks : selenium frameworks\"\n"
						+ "        ],\n"
						+ "        \"SelfProjects\": [\n"
						+ "            \"Project 1 : joystick App\",\n"
						+ "            \"Project 2 : abandant cart recovery app\"\n"
						+ "        ]\n"
						+ "    }\n"
						+ "]")
				.when().get("/Detail2").then().log().all().assertThat().statusCode(200).extract().response().asString();
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
					  String POST_CREATE = "{\n"
					  		+ "    \"id\": 5,\n"
					  		+ "    \"Name\": \"Kumaresan Laksh\",\n"
					  		+ "    \"Age\": 15,\n"
					  		+ "    \"CourseCompleted\": \"MCA\",\n"
					  		+ "    \"CourseCurrentlyGoing\": \"Java Selenium\",\n"
					  		+ "    \"Skills\": [\n"
					  		+ "        \"Programming : Java\",\n"
					  		+ "        \"Automationtool : Selenium\",\n"
					  		+ "        \"Frameworks : selenium frameworks\"\n"
					  		+ "    ],\n"
					  		+ "    \"SelfProjects\": [\n"
					  		+ "        \"Project 1 : XYZ\",\n"
					  		+ "        \"Project 2 : ABC\"\n"
					  		+ "    ]\n"
					  		+ "}";
					  
					
					  given() .header("Content-Type","application/json") // Set the content type to
					  .body(POST_CREATE).when().post("/Detail2")
					  .then().log().all().assertThat().statusCode(200)
					  .extract().response().asString();
					  
					   System.out.println(POST_CREATE);
					 

		// update

		String nameUpdated = "Anish";
		given().log().all().header("Content-Type", "application/json")
		.body("[\n"
				+ "    {\n"
				+ "        \"id\": 2,\n"
				+ "        \"Name\": \""+nameUpdated+"\",\n"
				+ "        \"Age\": 25,\n"
				+ "        \"CourseCompleted\": \"MCA\",\n"
				+ "        \"CourseCurrentlyGoing\": \"Photoshop\",\n"
				+ "        \"Skills\": [\n"
				+ "            \"Programming : Java\",\n"
				+ "            \"Automation Tool : Selenium\",\n"
				+ "            \"Frameworks : selenium frameworks\"\n"
				+ "        ],\n"
				+ "        \"SelfProjects\": [\n"
				+ "            \"Project 1 : joystick App\",\n"
				+ "            \"Project 2 : abandant cart recovery app\"\n"
				+ "        ]\n"
				+ "    }\n"
				+ "]")
		.when()
		.put("/Detail2/2")
		.then()
		.log().all().assertThat().statusCode(200);

	}

}
