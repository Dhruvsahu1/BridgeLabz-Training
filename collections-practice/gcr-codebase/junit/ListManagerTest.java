import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ListManagerTest {
    ListManager lm = new ListManager();

    @Test
    void addingElementTest() {
        List<Integer> li = new ArrayList<>();
        lm.addElement(li, 15);
        assertTrue(li.contains(15));
    }

    @Test
    void removingElementTest() {
        List<Integer> li = new ArrayList<>();
        li.add(15);
        lm.removeElement(li, 15);
        assertFalse(li.contains(15));
    }

    @Test
    void gettingSizeTest() {
        List<Integer> li = new ArrayList<>();
        lm.addElement(li, 15);
        assertEquals(1, lm.getSize(li));
    }
}
