package gr.aueb.cf.testbed.ch15;

import java.util.Locale;

public class PointApp {

    public static void main(String[] args) {
        Point p1 = new Point(10);
        Point2D p2 = new Point2D(10, 20);
        Point3D p3 = new Point3D(10, 20, 30);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.printf("Distance p1 from origin: %.2f \n", PointUtil.distanceFromOrigin(p1));
        System.out.printf("Distance p2 from origin: %.2f \n", PointUtil.distanceFromOrigin(p2));
        System.out.printf("Distance p3 from origin: %.2f \n", PointUtil.distanceFromOrigin(p3));
    }
}
