package Examples;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteMethod {
	
	@Test
	public void DeleteMethod_Example() {
	RestAssured.given().baseUri("http://localhost:3000/")
	.header("Content-Type","application/json")
	.when().delete("employees/12").prettyPrint();
	}

}
