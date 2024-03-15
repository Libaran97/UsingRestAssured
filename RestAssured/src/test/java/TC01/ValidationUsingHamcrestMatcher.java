package TC01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class ValidationUsingHamcrestMatcher {
	
	@Test
	public void JsonValidationUsingHamcrestMatcher() throws IOException {
		
		File inputJson = new File("src/test/resources/PostMethod.json");
		 String JsonString = FileUtils.readFileToString(inputJson);
		FileInputStream jsonschema = new FileInputStream("src/test/resources/jsonSchema.json");
		MatcherAssert.assertThat(JsonString, JsonSchemaValidator.matchesJsonSchema(jsonschema));
	}

}
