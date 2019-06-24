package Baitap.QuadraticEquation;

public class QuadraticEquation {
    private  double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
    }

    public void Result(double a,double b,double c) {
        double delta = this.b * 2 - 4 * this.a * this.c;
        if (delta == 0) {
            double r = (-b + Math.pow(delta, 0.5)) / (2 * a);
            System.out.println("Phuong trinh co 1  nghiem: " + r);
        } else {
            if (delta >= 0) {
                double r1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
                double r2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
                System.out.println("PHuong trinh co 2 nghiem: " + r1 + "va " + r2);
            } else {
                System.out.println("The equation has no roots");
            }
        }
    }
}
