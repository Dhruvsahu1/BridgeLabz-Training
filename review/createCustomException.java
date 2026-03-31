
public class createCustomException extends Exception {
    
    public createCustomException() {
        super("Custom exception occurred");
    }

    public createCustomException(String message) {
        super(message);
    }

    public createCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public createCustomException(Throwable cause) {
        super(cause);
    }

  
    public static void main(String[] args) {
        try {
            checkValue(-1);
        } catch (createCustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        try {
            checkValue(10);
        } catch (createCustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

    public static void checkValue(int value) throws createCustomException {
        if (value < 0) {
            throw new createCustomException("Value cannot be negative: " + value);
        } else {
            System.out.println("Value is valid: " + value);
        }
    }
}
