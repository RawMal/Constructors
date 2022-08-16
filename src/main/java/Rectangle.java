public class Rectangle {

    float length;
    float width;

    public Rectangle(float length) {
        this.length = length;
        this.width = width;
    }

    // Rectangles Method


    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getPerimeter() {
        return ((length + width) * 2);
    }
    
}
