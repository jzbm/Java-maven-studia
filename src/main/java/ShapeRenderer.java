import java.util.List;

public class ShapeRenderer {

    public void renderShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            renderShape(shape);
        }
    }

    public void renderShape(Shape shape) {
        System.out.println("Rysowanie figury:");
        System.out.println("Typ figury: " + shape.getName());
        System.out.println("Kolor figury: " + shape.getColorDescription());
        System.out.println("Reprezentacja graficzna:");
        drawShape(shape);
        System.out.println(resetColor());
        System.out.println();
    }

    private void drawShape(Shape shape) {
        if (shape instanceof Rectangle) {
            drawRectangle((Rectangle) shape);
        }
        if (shape instanceof Triangle) {
            drawTriangle((Triangle) shape);
        }
    }

    private void drawRectangle(Rectangle rectangle) {
        String colorCode = getColorCode(rectangle.color);
        for (int i = 0; i < (int)rectangle.height; i++) {
            System.out.println(colorCode + "* ".repeat((int)rectangle.width) + resetColor());
        }
    }

    private void drawTriangle(Triangle triangle) {
        double a = triangle.a;
        double b = triangle.b;
        double c = triangle.c;
        double base = Math.max(a, Math.max(b, c));
        double area = triangle.getArea();

        int height = (int)Math.round((2 * area) / base);

        String colorCode = getColorCode(triangle.color);

        for (int i = 1; i <= height; i++) {
            int stars = (int)Math.round((i * base) / height);
            System.out.println(" ".repeat(height - i) + colorCode + "* ".repeat(stars) + resetColor());
        }
    }

    private String getColorCode(Color color) {
        return String.format("\u001B[38;2;%d;%d;%dm", color.red(), color.green(), color.blue());
    }

    private String resetColor() {
        return "\u001B[0m";
    }
}