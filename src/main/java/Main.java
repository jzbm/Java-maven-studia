import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(3.0, 4.0, new Color(200, 0, 0, 0.5f)));
        shapes.add(new Triangle(5.0, 6.0, 7.0, new Color(255, 100, 50)));
        shapes.add(new Rectangle(6.0, 7.0, new Color(0, 200, 0, 0.6f)));
        shapes.add(new Triangle(8.0, 6.0, 7.0, new Color(0, 0, 200, 0.8f)));
        shapes.add(new Rectangle(8.5, 9.0, new Color(255, 255, 50, 0.4f)));
        shapes.add(new Triangle(7.0, 9.0, 11.0, new Color(150, 150, 150, 1.0f)));

        ShapeDescriber describer = new ShapeDescriber();
        for (Shape shape : shapes) {
            describer.describe(shape);
        }

        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShapes(shapes);
    }
}