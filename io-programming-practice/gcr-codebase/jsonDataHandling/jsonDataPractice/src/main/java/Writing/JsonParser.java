package Writing;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {
	public static void main(String[] args) {
		try {
			ObjectMapper map = new ObjectMapper();
			JsonNode node = map.readTree(new File("user.json"));
			System.out.println("Name is : "+node.get("name").asText());
			System.out.println("Your id is : "+node.get("id").asText());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
