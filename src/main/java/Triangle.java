public class Triangle extends Shape{
    public double a;
    public double b;
    public double c;
    public Triangle(double a, double b, double c, Color color) {
        this.name = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }
    @Override
    public double getArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}