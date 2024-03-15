package Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class Pojo {
	
	private String FirstName;
	private String LastName;
	private String email;
	private List Skills;
	
	
	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List getSkills() {
		return Skills;
	}


	public void setSkills(List skills) {
		Skills = skills;
	}


	@Test
	public void emp() {
	
		Map<String,Object> obj =new HashMap<>();
		
		List<String> skills = new ArrayList<String>();
		skills.add("football");
		skills.add("basketball");
		skills.add("volleyball");
		
		obj.put("EmpID", "123");
		obj.put("class", "12-a");
		obj.put("name", "libby");
		obj.put("skills", skills);
		
		System.out.println(obj);
		
		RestAssured.given().baseUri("http://localhost:3000").header("Content-Type","application/json").
		body(obj).log().all().when().post("/employees").then().log().all();
	}

}
