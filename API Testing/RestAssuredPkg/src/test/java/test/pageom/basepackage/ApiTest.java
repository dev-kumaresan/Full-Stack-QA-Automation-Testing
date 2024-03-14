package test.pageom.basepackage;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ApiTest {

	@Test
	public void get() {
		RestAssured.baseURI = "http://localhost:3000/";
		String response = given().log().all().header("Content-Type", "application/json").when().log().all()
				.get("/Details").then().log().all().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response);
	}

	@Test
	public void put() {

		RestAssured.baseURI = "http://localhost:3000/";
		String response = given().log().all().header("Content-Type", "application/json")
				.body("{\n"
						+ " \"Details\" : [\n"
						+ "    {\n"
						+ "    \"id\" : 1,\n"
						+ "      \"Name\" : \"Kumaresan\",\n"
						+ "      \"Age\" : 25,\n"
						+ "      \"City\" : \"Pudukkottai\"\n"
						+ "      },\n"
						+ "      {\n"
						+ "      \"id\" : 2,\n"
						+ "        \"Name\" : \"Rainaa\",\n"
						+ "        \"Age\" : 40,\n"
						+ "        \"City\" : \"Mumbai\"\n"
						+ "      }\n"
						+ "  ]\n"
						+ " }")
				.when().log().all().put("/Details/2").then().log().all().assertThat().statusCode(200).extract()
				.response().asString();
		System.out.println(response);
	}
	@Test
	public void post() {
		RestAssured.baseURI = "http://localhost:3000/";
		String response = given().log().all().header("Content-Type","application/json")
				.body("{\n"
						+ "      \"id\" : 3,\n"
						+ "        \"Name\" : \"dhoni\",\n"
						+ "        \"Age\" : 40,\n"
						+ "        \"City\" : \"Mumbai\"\n"
						+ "      }").when().log().all()
				.post("/Details/3").then().assertThat().statusCode(200)
				.extract().response().asString();
		System.out.println(response);
	}
	@Test
	public void delete() {
		RestAssured.baseURI = "http://localhost:3000/";
		String response = given().log().all().header("Content-Type","application.json").when().log().all().
				delete("/Details/3").then().log().all().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response);
	}

}
