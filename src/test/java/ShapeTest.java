
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(2, 4, new Color(255, 0, 0));
        double expectedArea = 2 * 4;
        assertEquals(expectedArea, rectangle.getArea(), 0.0001);
    }
}
