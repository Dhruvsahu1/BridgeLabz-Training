import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RegistrationUserTest {
    RegistrationUser ur = new RegistrationUser();

    @Test
    void validRegistrationTest() {
        ur.registerUser("Dhruv", "Dhruv@example.com", "security");
    }

    @Test
    void invalidRegistrationTest() {
        assertThrows(IllegalArgumentException.class, () -> ur.registerUser("", "Dhruv@example.com", "security"));
    }

    @Test
    void invalidEmailTest() {
        assertThrows(IllegalArgumentException.class, () -> ur.registerUser("Dhruv", "invalidemail", "security"));
    }

    @Test
    void shortPasswordTest() {
        assertThrows(IllegalArgumentException.class, () -> ur.registerUser("Dhruv", "Dhruv@example.com", "123"));
    }
}
