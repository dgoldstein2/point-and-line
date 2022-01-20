package PointProject;


public class Point {
    private int positionx;
    private int positiony;
    public Point(int x, int y){
        positionx = x;
        positiony = y;
    }
    public int manhattanDistance(Point other){
        int a = Math.abs(positionx - other.getX());
        int b = Math.abs(positiony - other.getY());
        return a + b;
    }
    public int getX(){
        return positionx;

    }
    public int getY(){
        return positiony;

    }
    public void changeX(int z){
        positionx = z;

    }
    public void changeY(int h){
        positiony = h;
        
    }
    public boolean isCollinear(Point p1, Point p2){
        double f1 = (double)(positiony)-(double)(p1.getY());
        System.out.println(f1);

        double z1 = (double)(positionx)-(double)(p1.getX());
        System.out.println(z1);
        double b1 = f1/z1;
        double f2 = (double)(positiony)-(double)(p2.getY());
        System.out.println(f2);
        double z2 = (double)(positionx)-(double)(p2.getX());
        System.out.println(z2);
        double b2 = f2/z2;
        double f3 = (double)(p2.getY())-(double)(p1.getY());
        System.out.println(f3);
        double z3 = (double)(p2.getX())-(double)(p1.getX());
        System.out.println(z3);
        double b3 = f2/z2;


        System.out.println(b1 + " " + b2 + " " + b3);
        return false;
        /*if (((f - z < .01) && (f - z > -.01) && (z - b < .01) && (z - b > -.01) && (b - f < .01) && (b - f > -.01))){
            return true;
        }
        else{
            return false;
        }
        */
    }
    

}