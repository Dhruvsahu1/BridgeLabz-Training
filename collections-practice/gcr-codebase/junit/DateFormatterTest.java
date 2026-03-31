import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.text.ParseException;

public class DateFormatterTest {
    DateFormatter df = new DateFormatter();

    @Test
    void testValidDate() throws ParseException {
        assertEquals("12-01-2026", df.formatDate("2026-01-12"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(ParseException.class, () -> df.formatDate("12-01-2026"));
    }
}
