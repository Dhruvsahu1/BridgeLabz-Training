package reflection;
import java.lang.reflect.*;

class Config {
    private static String API_KEY = "OLD_KEY";
}

public class DemonstrationStaticField {
    public static void main(String[] args) throws Exception {
        Field file = Config.class.getDeclaredField("API_KEY");
        file.setAccessible(true);
        file.set(null, "NEW_KEY");
        System.out.println("API_KEY: " + file.get(null));
    }
}