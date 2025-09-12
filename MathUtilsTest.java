import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    public void testAdd() {
        assertEquals(6, MathUtil.add(2, 3));
    }
    @Test
    public void testSubtract() {
        assertEquals(1, MathUtil.subtract(2, 1));
    }
}