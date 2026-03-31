import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class Service { void run() { System.out.println("Service running"); } }

class Client {
    @Inject Service service;
}

public class SimpleData {
    public static void main(String[] args) throws Exception {
        Client c = new Client();
        for (Field file : Client.class.getDeclaredFields()) {
            if (file.isAnnotationPresent(Inject.class)) {
                file.setAccessible(true);
                file.set(c, new Service());
            }
        }
        c.service.run();
    }
}