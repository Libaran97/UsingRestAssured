package TC01;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Examples.Pojo;

public class TC_01 {

	@Test
	public void tc001 () throws JsonProcessingException {
		Pojo pojo = new Pojo();
		pojo.setEmail("Libaran-111");
		pojo.setFirstName("Libby");
		pojo.setLastName("s");
		pojo.setSkills(Arrays.asList("Foot","basket"));

		System.out.println(pojo.getEmail());
		System.out.println(pojo.getFirstName());
		System.out.println(pojo.getLastName());
		System.out.println(pojo.getSkills());

		System.out.println("------------------------");

		ObjectMapper mapper = new ObjectMapper();
		String JsonBody = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
		System.out.println(JsonBody);
	}

}
