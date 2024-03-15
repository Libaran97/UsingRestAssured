package Examples;

import java.io.File;
import java.io.FileInputStream;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostMethod {
	
	@Test
	public void Postmethod_using_RestAssured() {
		
		
		File newfile =new File("src/test/resources/PostMethod.json");
		
		RestAssured.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(newfile).when().post("/employees").prettyPrint();
		
	
		
		
	}

}
