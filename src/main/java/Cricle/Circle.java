package Cricle;

public class Circle {
    private String color;
    private double radius;
    public Circle(){};
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(String color){
        this.color= color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public Circle(double radius, String color){
        this.radius=radius;
        this.color= color;
    }
    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }


}
