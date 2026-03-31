
class Robot {
    String name;
    int age;

    public Robot() {
        this("Unknown", 0);
        System.out.println("Robot default constructor called");
    }

    public Robot(String name) {
        this(name, 0);
        System.out.println("Robot constructor with name called");
    }


    public Robot(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Robot constructor with name and age called");
    }
}

public class constructorChainingUsingThisAndSuper extends Robot {
    String variety;

    public constructorChainingUsingThisAndSuper() {
        this("Unknown", 0, "Mixed");
        System.out.println("Robot default constructor called");
    }

    public constructorChainingUsingThisAndSuper(String name) {
        this(name, 0, "Mixed");
        System.out.println("Robot constructor with name called");
    }

    public constructorChainingUsingThisAndSuper(String name, int age) {
        this(name, age, "Mixed");
        System.out.println("Robot constructor with name and age called");
    }

    public constructorChainingUsingThisAndSuper(String name, int age, String variety) {
        super(name, age); 
        this.variety = variety;
        System.out.println("Robot constructor with name, age, and variety called");
    }

    public static void main(String[] args) {
        System.out.println("Creating Robot with default constructor:");
        constructorChainingUsingThisAndSuper Robot1 = new constructorChainingUsingThisAndSuper();

        System.out.println("\nCreating Robot with name:");
        constructorChainingUsingThisAndSuper Robot2 = new constructorChainingUsingThisAndSuper("Bruno");

        System.out.println("\nCreating Robot with name and age:");
        constructorChainingUsingThisAndSuper Robot3 = new constructorChainingUsingThisAndSuper("Bobsy", 3);

        System.out.println("\nCreating Robot with name, age, and variety:");
        constructorChainingUsingThisAndSuper Robot4 = new constructorChainingUsingThisAndSuper("Badsah", 2, "Cane-Corso");
    }
}
