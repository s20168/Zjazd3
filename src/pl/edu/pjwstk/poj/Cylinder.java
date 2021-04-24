package pl.edu.pjwstk.poj;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        super(height);
    }

    public Cylinder(double radius, double height) {
        this(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea()*height;
    }
}
