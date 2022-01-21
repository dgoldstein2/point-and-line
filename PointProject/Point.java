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
        if(positionx == p1.getX()){
            if(positionx != p2.getX()){
                return false;
            }
            else{
                return true;
            }
        
        }
        else if(positionx == p2.getX()){
            if(positionx != p1.getX()){
                return false;
            }
            else{
                return true;
            }

        }
        else{
            double slope1x = (double) positionx - p1.getX();
            double slope1y = (double) positiony - p1.getY();
            double slope1 = slope1y/slope1x;
            double slope2x = (double) positionx - p2.getX();
            double slope2y = (double) positionx - p2.getY();
            double slope2 = slope2y/slope2x;
            double dif = Math.abs(slope1 - slope2);
            if ((dif < .01) && (dif > -.01)){
                return true;
            }
            else{
                return false;
            }

        }


        
        
    }
    public String toString(){
        return "x = "+positionx+", y = "+ positiony;
    }
    

}