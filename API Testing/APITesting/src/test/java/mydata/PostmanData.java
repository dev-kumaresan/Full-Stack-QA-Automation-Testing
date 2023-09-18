package mydata;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostmanData {

	@Test
	public void get(String uri, String resource) {
		/**
		 * Get Json and Access
		 */
		RestAssured.baseURI = uri;
		String response = given().log().all().header("Content-Type", "application/json").when().get(resource).then()
				.log().all().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response);
		/**
		 * To get json key and value
		 */
		/*
		 * JsonPath jp = new JsonPath(response);
		 * 
		 * String string = jp.getString("CourseCompleted"); System.out.println(string);
		 */

	}

	@Test
	public void post() {
		RestAssured.baseURI = "http://localhost:3000/";
		String POST_CREATE = "{\n" + "    \"id\": 3,\n" + "    \"Name\": \"Vinay\",\n" + "    \"Age\": 15,\n"
				+ "    \"CourseCompleted\": \"MCA\",\n" + "    \"CourseCurrentlyGoing\": \"Java Selenium\",\n"
				+ "    \"Skills\": [\n" + "        \"Programming : Java\",\n"
				+ "        \"Automationtool : Selenium\",\n" + "        \"Frameworks : selenium frameworks\"\n"
				+ "    ],\n" + "    \"SelfProjects\": [\n" + "        \"Project 1 : XYZ\",\n"
				+ "        \"Project 2 : ABC\"\n" + "    ]\n" + "}";

		given().header("Content-Type", "application/json") // Set the content type to
				.body(POST_CREATE).when().post("/Detail1").then().log().all().assertThat().statusCode(200).extract()
				.response().asString();

		System.out.println(POST_CREATE);
	}

	@Test
	public void put() {
		RestAssured.baseURI = "http://localhost:3000/";
		given().log().all().header("Content-Type", "application/json")
				.body("  {\n" + "    \"id\": 2,\n" + "    \"Name\": \"Kumaresan Lakshman ST\",\n" + "    \"Age\": 15,\n"
						+ "    \"CourseCompleted\": \"MCA\",\n" + "    \"CourseCurrentlyGoing\": \"Java Selenium\",\n"
						+ "    \"Skills\": [\n" + "      \"Programming : Java\",\n"
						+ "      \"Automationtool : Selenium\",\n" + "      \"Frameworks : selenium frameworks\"\n"
						+ "    ],\n" + "    \"SelfProjects\": [\n" + "      \"Project 1 : XYZ\",\n"
						+ "      \"Project 2 : ABC\"\n" + "    ]\n" + "  }")
				.when().put("/Detail1/2").then().log().all().assertThat().statusCode(200);
	}

	@Test
	public void delete() {
		RestAssured.baseURI = "http://localhost:3000/";
		given().log().all().header("Content-Type", "application/json").when().delete("/Detail1/3").then().log().all()
				.assertThat().statusCode(200);
	}

	public static void main(String[] args) {
		PostmanData pd = new PostmanData();
		pd.get("http://localhost:3000/", "/Detail1/2");
	}
}
