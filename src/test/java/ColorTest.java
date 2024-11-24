import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColorTest {

    @Test
    public void testGetRed() {
        Color color = new Color(255, 0, 0);
        assertEquals(255, color.red());
    }

    @Test
    public void testGetGreen() {
        Color color = new Color(0, 255, 0);
        assertEquals(255, color.green());
    }

    @Test
    public void testGetBlue() {
        Color color = new Color(0, 0, 255);
        assertEquals(255, color.blue());
    }

    @Test
    public void testColorAttributes() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Color(123, 456, 789);
        });
        assertEquals("Color values must be in the range 0-255", exception.getMessage());
    }
    @Test
    public void testAlphaAttribute() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Color(123, 236, 239, 5);
        });
        assertEquals("Alpha must be between 0.0 and 1.0", exception.getMessage());
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> {
            new Color(123, 236, 239, -5);
        });
        assertEquals("Alpha must be between 0.0 and 1.0", exception2.getMessage());
    }

}
