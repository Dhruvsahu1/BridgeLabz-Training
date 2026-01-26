package Validation;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

public class JsonValidatior {

    public static void main(String[] args) throws IOException, ProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        // Load schema
        JsonNode schemaNode = mapper.readTree(new File("schema.json"));

        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema schema = factory.getJsonSchema(schemaNode);

        // Load JSON data
        JsonNode jsonNode = mapper.readTree(new File("user.json"));

        // Validate
        ProcessingReport report = schema.validate(jsonNode);

        if (report.isSuccess()) {
            System.out.println("✅ JSON is valid");
        } else {
            System.out.println("❌ JSON is invalid");
            report.forEach(msg -> System.out.println(msg.getMessage()));
        }
    }
}
