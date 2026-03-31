import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class DatabaseConnectionTest {
    DatabaseConnection db;

    @BeforeEach
    void settingUp() { db = new databaseConnection(); db.connect(); }

    @AfterEach
    void settingDown() { db.disconnect(); }

    @Test
    void connectionEstablishingTest() { assertTrue(db.isConnected()); }

    @Test
    void testConnectionClosed() {
        db.disconnect();
        assertFalse(db.isConnected());
    }
}
