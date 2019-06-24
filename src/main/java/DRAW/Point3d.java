package DRAW;

public class Point3d extends Point2d {
    public Point3d(){}
    double z;
    public double getZ(){
        return this.z;
    }
    public void setZ(){
        this.z=z;
    }

    public Point3d(double x, double y, double z){
        super(x,y);
        this.z=z;
    }
    public void setPoint3d(double x, double y, double z){
        this.setXY(x,y);
        this.z=z;
    }
    public double[] getPoint3d(){
        double[] array= new double[3];
        array[0]=this.getX();
        array[1]=this.getY();
        array[2]=z;
        return array;

    }

    @Override
    public String toString() {
        return "Draw a POint 3d at "
                + getX()
                +","
                +getY()
                +","
                +getZ()
                +","
                + super.toString();
    }
}
