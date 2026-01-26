package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonJavaExample {
	public static void main(String[] args) {
		try {
			ObjectMapper om = new ObjectMapper();
			User user = new User("Dhruv","dhruv@gmail.com",24);
			String jsonString = om.writeValueAsString(user);
			System.out.println(jsonString);
		}catch(Exception e){
			System.out.println("error occured");
		}
	}
}
