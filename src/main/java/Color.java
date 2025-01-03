public record Color(int red, int green, int blue, float alpha) {
    public Color {
        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
            throw new IllegalArgumentException("Color values must be in the range 0-255");
        }
        if (alpha < 0.0f || alpha > 1.0f) { // Ensure alpha is within valid range
            throw new IllegalArgumentException("Alpha must be between 0.0 and 1.0");
        }
    }

    public Color(int red, int green, int blue) {
        this(red, green, blue, 0.0f);
    }
}