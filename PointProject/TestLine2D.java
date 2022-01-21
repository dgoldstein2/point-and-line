package PointProject;

public class TestLine2D {
    public static void main(String[] args){
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        Point p3 = new Point(4,9);
        Point p4 = new Point(6,8);
        Line2D L3 = new Line2D(4,9,6,8);
        Line2D L1 = new Line2D(p1,p2);
        Line2D L2 = new Line2D(p3,p4);
        System.out.println(L3.toString());
        System.out.println(L2.toString());
        System.out.println(L1.toString());
        System.out.println(L1.getP1());
        System.out.println(L2.getP1());
        System.out.println(L3.getP1());
        System.out.println(L1.getP2());
        System.out.println(L2.getP2());
        System.out.println(L3.getP2());
        System.out.println(L1.getSlope());
        System.out.println(L2.getSlope());
        System.out.println(L1.isCollinear(p3));
        System.out.println(L1.isCollinear(p4));


    }
}