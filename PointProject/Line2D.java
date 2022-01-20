package PointProject;

public class Line2D {
    private int posx1;
    private int posy1;
    private int posx2;
    private int posy2;
    public Line2D(Point p1, Point p2){
        posx1 = p1.getX();
        posy1 = p1.getY();
        posx2 = p2.getX();
        posy2 = p2.getY();
    }
    public Line2D(int x1, int y1, int x2, int y2){
        posx1 = x1;
        posy1 = y1;
        posx2 = x2;
        posy2 = y2;
    }
    public Point getP1(){
        Point firP = new Point(posx1, posy1);
        return firP;
    }
    public Point getP2(){
        Point SecP = new Point(posx2, posy2);
        return SecP;
    }
    public String toString(){
        String x = "[(" + posx1 + "," +posy1+"), (" + posx2 + "," + posy2 + ")]";
        return x;
    }
    public double getSlope(){
        
        double px1 = (double)(posx1);
        double px2 = (double)(posx2);
        double py1 = (double)(posy1);
        double py2 = (double)(posy2);
        double f = py2 - py1;
        double h = px2 - px1;
        double fin = f/h;
        
        
        return fin;
        

    }
    public boolean isCollinear(Point p1){
        if ((posx1 == p1.getX()) && (posx2 == p1.getX())){
            
        }


        
        
    }


}
