package gr.aueb.cf.testbed.ch16;

import gr.aueb.cf.ch17.cloneable.City;

import java.io.Serializable;

public class Line extends AbstractShape implements IShape, Serializable, Cloneable {
    private final static long serialVersionUID = 1;
    private Point p1;
    private Point p2;

    public Line() {
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Copy Constructor
    public Line(Line line) {
        this.p1 = new Point(line.p1);
        this.p2 = new Point(line.p2);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (!p1.equals(line.p1)) return false;
        return p2.equals(line.p2);
    }

    @Override
    public int hashCode() {
        int result = p1.hashCode();
        result = 31 * result + p2.hashCode();
        return result;
    }

    protected Line clone() throws CloneNotSupportedException {
        Line clone = (Line) super.clone();
        clone.setP1(new Point(this.getP1()));
        clone.setP2(new Point(this.getP2()));
        return clone;
    }
}
