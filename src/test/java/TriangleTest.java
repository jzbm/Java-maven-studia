
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void testCalculatePerimeterEquilateral() {
        Triangle triangle = new Triangle(3, 3, 3, new Color(255,255,255));
        double result = triangle.getPerimeter();
        assertEquals(9.0, result);
    }

    @Test
    public void testCalculatePerimeterIsosceles() {
        Triangle triangle = new Triangle(3, 3, 2, new Color(255,255,255));
        double result = triangle.getPerimeter();
        assertEquals(8.0, result);
    }

    @Test
    public void testCalculatePerimeterScalene() {
        Triangle triangle = new Triangle(2, 3, 4, new Color(255,255,255));
        double result = triangle.getPerimeter();
        assertEquals(9.0, result);
    }

    @Test
    public void testCalculateAreaEquilateral() {
        Triangle triangle = new Triangle(3, 3, 3, new Color(255,255,255));
        double result = triangle.getArea();
        assertEquals(3.897, result, 0.001);
    }

    @Test
    public void testCalculateAreaIsosceles() {
        Triangle triangle = new Triangle(3, 3, 2, new Color(255,255,255));
        double result = triangle.getArea();
        assertEquals(2.828, result, 0.001);
    }

    @Test
    public void testCalculateAreaScalene() {
        Triangle triangle = new Triangle(2, 3, 4, new Color(255,255,255));
        double result = triangle.getArea();
        assertEquals(2.904, result, 0.001);
    }
}
