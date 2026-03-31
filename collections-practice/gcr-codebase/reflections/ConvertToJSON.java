import java.lang.reflect.*;

class Product {
    public String name = "Laptop";
    public double price = 75000.5;
}

public class ConvertToJSON {
    public static String toJson(Object o) throws Exception {
        StringBuilder sb = new StringBuilder("{");
        for (Field file : o.getClass().getDeclaredFields()) {
            file.setAccessible(true);
            sb.append("\"").append(file.getName()).append("\":\"").append(file.get(o)).append("\",");
        }
        sb.setLength(sb.length()-1);
        return sb.append("}").toString();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(toJson(new Product()));
    }
}