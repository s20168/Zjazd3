package pl.edu.pjwstk.poj;

public class Circle  {

    private double radius = 1.0;
    String color = "red";
    private static final float PI = 3.14f;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double p) {
        this.radius = p;
    }

    public void setColor(String col) {
        this.color = col;
    }

    public double getArea() {
        double wynik = PI * radius * radius;
        return wynik;
    }
    public String toString() {
        return "Circle[Shape[color=" + getColor() + "]radius=" + radius + "]";
    }

}

