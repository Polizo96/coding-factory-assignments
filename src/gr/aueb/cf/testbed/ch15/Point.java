package gr.aueb.cf.testbed.ch15;

public class Point {
    private int x;

    public Point() {}

    public Point(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "(" + x + ")";
    }

    public double getDistanceFromOrigin() {
        return Math.abs(x);
    }
}
