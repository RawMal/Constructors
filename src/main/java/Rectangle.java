public class Rectangle {

    float length;
    float width;

    public Rectangle(float length, float width) {
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
    // BEHAVIOURS
    public float getPerimeter() {
        return ((length + width) * 2);
    }
    public float getArea() {
        return (length * width);
    }
    public float getDiagonal() {
        return (float) (Math.pow(length, 2) + Math.pow(length, 2));
    }
}
