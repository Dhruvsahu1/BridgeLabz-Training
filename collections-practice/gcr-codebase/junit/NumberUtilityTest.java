import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberUtilityTest {
    NumberUtility NU = new NumberUtility();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 8, 7, 9})
    void testIsEven(int number) {
        if (number % 2 == 0) assertTrue(NU.isEven(number));
        else assertFalse(NU.isEven(number));
    }
}
