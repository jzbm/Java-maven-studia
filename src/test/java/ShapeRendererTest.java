import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class ShapeRendererTest {
   @Test
   void testRenderRectangle() {
      ShapeRenderer shapeRenderer = new ShapeRenderer();
      Rectangle rectangle = new Rectangle(2, 3, new Color(255, 0, 0));
      shapeRenderer.renderShape(rectangle);
   }

   @Test
   void testRenderTriangle() {
      ShapeRenderer shapeRenderer = new ShapeRenderer();
      Triangle triangle = new Triangle(3, 4, 5,  new Color(255, 255, 0));
      shapeRenderer.renderShape(triangle);
   }

   @Test
   void testRenderWithColor() {
      ShapeRenderer shapeRenderer = new ShapeRenderer();
      Triangle triangle = new Triangle(3, 4, 5, new Color(255, 0, 255));
      shapeRenderer.renderShape(triangle);
   }
}