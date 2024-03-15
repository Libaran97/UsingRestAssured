package Examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DataFromJson {
	
	@Test
	public static void dataJson () throws FileNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream("src/test/resources/PostMethod.json");
		RestAssured.given().baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(fileInputStream)
		.when().post("/employees").prettyPrint();

	}
	
}
