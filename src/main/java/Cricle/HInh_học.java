package Cricle;

public class HInh_học {
    public static void main(String[] args) {
        Circle circle= new Circle();
        System.out.println(circle);
        Cylinder cylinder= new Cylinder();
        System.out.println(cylinder);
        Circle circle1= new Circle(10,"red");
        System.out.println(circle1);
        Cylinder cylinder1= new Cylinder(15,"black",20);
        System.out.println(cylinder1);

    }
}
