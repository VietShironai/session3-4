package DRAW;

public class Point2d {
    private double x,y;
    public Point2d(){}
    public Point2d(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return this.x;
    }
    public void setX(){
        this.x= x;
    }
    public  double getY(){
        return this.y;
    }
    public void setY(){
        this.y= y;
    }
    public void setXY(double x, double y){
        this.x=x;
        this.y= y;
    }
    public double[] getXY(){
        double[] array= new double[2];
        array[0]= x;
        array[1]= y;
        return array;

    }

    @Override
    public String toString() {

        return "Draw a Point2d at "
                + getX()
                +","
                + getY()
                +","
                + super.toString();
    }
}
