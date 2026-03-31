import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    PasswordValidator pv = new PasswordValidator();

    @Test
    void validPasswordTest() { assertTrue(pv.isValid("StrongPassWord1")); }

    @Test
    void invalidPasswordTest() { assertFalse(pv.isValid("weak")); }
}
