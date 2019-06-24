package Baitap.QuadraticEquation;
import java.util.Scanner;

public class Acount {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Phuowng trinh ax2 + bx + x = 0 ");
        System.out.println("NHap a");
        double a= sc.nextDouble();
        System.out.println("nhap b");
        double b=sc.nextDouble();
        System.out.println("nhap c");
        double c=sc.nextDouble();
        QuadraticEquation Qe= new QuadraticEquation(a,b,c);
        Qe.Result(a,b,c);
    }
}
