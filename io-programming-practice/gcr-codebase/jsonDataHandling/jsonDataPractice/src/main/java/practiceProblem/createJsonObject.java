package practiceProblem;

import org.json.JSONObject;

public class createJsonObject {
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name","Dhruv");
		jsonObject.put("age","25");
		jsonObject.put("email","abc@gmail.com");
		System.out.println(jsonObject.toString());
	}
}
