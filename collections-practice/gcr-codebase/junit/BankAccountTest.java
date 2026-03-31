import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    BankAccount ba = new BankAccount();

    @Test
    void testDeposit() {
        ba.deposit(100000);
        assertEquals(100000, ba.getBalance());
    }

    @Test
    void testWithdraw() {
        ba.deposit(100000);
        ba.withdraw(50000);
        assertEquals(50000, ba.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> ba.withdraw(50));
    }
}
