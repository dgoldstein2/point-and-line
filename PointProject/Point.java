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
        double f = (double)(positiony)/(double)(positionx);
        double z = (double)(p1.getY())/(double)(p1.getX());
        double b = (double)(p2.getY())/(double)(p2.getX());
        if ((f == z) && (z == b)){
            return true;
        }
        else{
            return false;
        }
    }

}