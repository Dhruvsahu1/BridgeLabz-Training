
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author { String name(); }

@Author(name="John Doe")
class Book {}

public class DemoAnnotation {
    public static void main(String[] args) {
        Author auth = Book.class.getAnnotation(Author.class);
        System.out.println("Author: " + auth.name());
    }
}