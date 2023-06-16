package gr.aueb.cf.testbed.ch12;

public class PointXYZApp {

    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ();
        PointXYZ p2 = new PointXYZ(1,2,3);

        p1.setX(3);
        p1.setY(5);
        p1.setZ(7);

        System.out.println(p1.convertToString());
        System.out.println(p2.convertToString());
    }
}
