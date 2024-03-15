package Examples;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutMethod {
	
	@Test
	public void PutMethod_Example() {
		File newfile = new File("src/test/resources/PutMethod.json");
		RestAssured.given().baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(newfile)
		.when().put("/employees/11").prettyPrint();
		
		
	}

}
