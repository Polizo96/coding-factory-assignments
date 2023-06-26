package gr.aueb.cf.testbed.ch16;

import gr.aueb.cf.ch17.cloneable.Trainee;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ICircle, ITwoDimensional, Serializable, Cloneable {
    private final static long serialVersionUID = 1;
    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    // Copy Constructor
    public Circle(Circle circle) {
        this.radius = circle.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getDiameter() {
        return 2.0 * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        Circle clone = (Circle) super.clone();
        return clone;
    }
}
