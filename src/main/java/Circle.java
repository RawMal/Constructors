public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //Circles Method


    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double getCircumference() {
        return (2 * radius * Math.PI);
    }
public String toString() {
        return "Circle{" + "radius = " + radius + "circumference = " + getCircumference() + '}';
}
}
