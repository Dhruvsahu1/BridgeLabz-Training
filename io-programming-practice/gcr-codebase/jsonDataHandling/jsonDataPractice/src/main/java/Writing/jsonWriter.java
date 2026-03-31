package Writing;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonWriter {
	public static void main(String[] args) {
		try {
			ObjectMapper om = new ObjectMapper();
			User user = new User();
			user.setId(101);
			user.setName("Dhruv");
			user.setEmail("Dhruv@gmail.com");
			user.setAge(20);
			user.setSkills(Arrays.asList("Java","JavaScript","React"));
			user.setAddress(Map.of("city","Kanpur","zip","208021"));
			om.writeValue(new File("output.json"), user);
			System.out.println("File created successfully");

		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
