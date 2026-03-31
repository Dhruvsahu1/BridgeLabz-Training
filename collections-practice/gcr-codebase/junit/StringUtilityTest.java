import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilityTest {
    StringUtility su = new StringUtility();

    @Test
    void testReverse() { assertEquals("fed", su.reverse("def")); }

    @Test
    void testIsPalindrome() { assertTrue(su.isPalindrome("adda")); }

    @Test
    void testToUpperCase() { assertEquals("HOME", su.toUpperCase("home")); }
}
