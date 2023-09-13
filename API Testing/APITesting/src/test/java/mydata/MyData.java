package mydata;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MyData {

	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader fr = new FileReader("/home/kumaresan/git/Full-Stack-QA-Automation-Testing/API Testing/APITesting/src/test/resources/json/sample.json");
		JSONParser jp = new JSONParser();
		Object parse = jp.parse(fr);
		JSONObject job = (JSONObject)parse;
		String name = (String) job.get("Name");
		System.out.println(name);
		JSONArray ja = (JSONArray) job.get("SelfProjects");
		for(Object a : ja) {
			System.out.println(a);
		}
		

	}

}
