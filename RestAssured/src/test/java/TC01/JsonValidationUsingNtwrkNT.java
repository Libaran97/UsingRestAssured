package TC01;




import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import javax.xml.validation.SchemaFactory;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;




public class JsonValidationUsingNtwrkNT {
	
	@Test
	public void jsonValidation() throws IOException   {
		
		ObjectMapper Mapper = new ObjectMapper();
		JsonSchemaFactory Factory = JsonSchemaFactory.getInstance(VersionFlag.V4);
		
		File InputJson = new File("src/test/resources/PostMethod.json");
		FileInputStream JsonSchema = new FileInputStream("src/test/resources/jsonSchema.json");
		JsonNode Jnode = Mapper.readTree(InputJson);
		JsonSchema Schema = Factory.getSchema(JsonSchema);
		Set<ValidationMessage> Message = Schema.validate(Jnode);
		
		if (Message.isEmpty()) {
			System.out.println("No Validation Errors");
		}
		else
			System.out.println(Message);
		
	}

}
