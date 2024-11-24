abstract class Shape {
    public String name;
    public Color color;
    public String getName() {
        return this.name;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String getColorDescription() {
        return String.format("Red: %d, Green: %d, Blue: %d, Alpha: %.2f%n", this.color.red(), this.color.green(), this.color.blue(), this.color.alpha());
    }
}