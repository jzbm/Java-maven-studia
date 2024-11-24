public class Rectangle extends Shape{
    public double width;
    public double height;
    public Rectangle(double width, double height, Color color) {
        this.name = "Rectangle";
        this.width = width;
        this.height = height;
        this.color = color;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}