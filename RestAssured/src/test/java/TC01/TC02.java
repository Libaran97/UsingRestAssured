package TC01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class TC02 {
	
	
	@Test
	public void jsonschema_validator() throws FileNotFoundException {
		
		FileInputStream inputStream = new FileInputStream("src/test/resources/PostMethod.json");
		FileInputStream jsonschema = new FileInputStream("src/test/resources/jsonSchema.json");
														
		
		RestAssured.given().baseUri("http://localhost:3000")
		.header("Content-Type","application/json").body(inputStream).when().post("/employees").then()
		.body(JsonSchemaValidator.matchesJsonSchema(jsonschema));
		
	}

}
