package Cricle;

public class Cylinder extends Circle {
    double hight;
    public Cylinder(){}
    public Cylinder(double radius,String color,double hight){
        super(radius,color);
        this.hight=hight;
    }
    public double getHight(){
        return hight;
    }
    public void setHight(){
        this.hight=hight;
    }
    public double Volume(){
        double result= getArea()* hight;
        return  result;
    }
    @Override
    public String toString() {
        return "A Cylinder with radius="
                + getRadius()
                +" hight is: "
                + getHight()
                +" The tich la: "
                + Volume()
                + ", which is a subclass of "
                + super.toString();

    }
}
