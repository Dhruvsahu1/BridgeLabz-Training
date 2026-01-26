package practiceProblem;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonArray {
	public static void main(String[] args) {
		JSONArray skills = new JSONArray();
		skills.put("java");
		skills.put("javaScript");
		skills.put("Spring");
		skills.put("Sql");
		JSONObject object = new JSONObject();
		object.put("name", "Dhruv");
		object.put("age","25");
		object.put("Skills", skills);
		System.out.println(object);
	}
}
