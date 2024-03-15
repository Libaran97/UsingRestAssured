package Examples;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class GetMethod_Example {
	
	
	@Test
	public void Tc1 () {
		
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.GET,"employees/1");
		//io.restassured.RestAssured RestAssured = null;
		//io.restassured.RestAssured.baseURI = "https://bookstore.toolsqa.com";
        //RequestSpecification request = RestAssured.given();
        System.out.println(response.asString());
        System.out.println(response.statusLine());
        System.out.println("-------------------");

	}

}
