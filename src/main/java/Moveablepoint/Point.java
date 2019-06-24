package Moveablepoint;

public class Point {
    double x,y;
    public Point(){}
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public void setX(){
        this.x=x;
    }
    public  double getY(){
        return y;
    }
    public void setY(){
        this.y=y;
    }
    public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double[] getXY(){
        double[] array= new double[2];
        array[0]=x;
        array[1]=y;
        return array;
    }

    @Override
    public String toString() {
        return " Draw a point at "
                + getX()
                +","
                + getY();
    }
}
