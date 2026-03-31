package practiceProblem;

import com.google.gson.JsonObject;

public class GsonJsonExample {
	public static void main(String[] args) {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "Dhruv");
		jsonObject.addProperty("age","25");
		jsonObject.addProperty("email", "abc@gmail.com");
		System.out.println(jsonObject.toString());
	}
}
