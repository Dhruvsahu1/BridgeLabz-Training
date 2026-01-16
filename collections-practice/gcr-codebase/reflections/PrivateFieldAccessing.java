import java.lang.reflect.*;

class Person {
    private int age = 25;
}

public class PrivateFieldAccessing {
    public static void main(String[] args) throws Exception {
        Person per = new Person();
        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);
        field.set(per, 30);
        System.out.println("Age: " + field.get(per));
    }
}