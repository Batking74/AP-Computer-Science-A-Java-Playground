public class Square {
    // Attributes
    private String color;
    private int height;
    private int width;

    // Constructor
    public Square() {
        width = 10;
        height = 5;
        color = "Black";
    }

    // Overload
    public Square(int newWidth, int newHeight, String newColor) {
        width = newWidth;
        height = newHeight;
        color = newColor;
    }
    
    // Other methods
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getArea() {
        return width * height;
    }

    public String getColor() {
        return color;
    }
}
