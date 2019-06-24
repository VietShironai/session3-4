package Moveablepoint;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.security.PublicKey;

public class Movepoint extends Point {
    private double xspeed, yspeed;

    public Movepoint() {
    }

    public Movepoint(double x, double y, double xspeed, double yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;

    }

    public double getXspeed() {
        return xspeed;
    }

    public void setXspeed() {
        this.xspeed = xspeed;
    }

    public double getYspeed() {
        return yspeed;
    }

    public void setYspeed() {
        this.yspeed = yspeed;
    }

    public void setSpeed(double xspeed, double yspeed) {
        this.yspeed = yspeed;
        this.xspeed = xspeed;
    }

    public double[] getspeed() {
        double[] array = new double[2];
        array[0] = xspeed;
        array[1] = yspeed;
        return array;
    }

    public double[] move() {
        double[] array = new double[2];
        x += xspeed;
        y += yspeed;
        array[0] = x;
        array[1] = y;
        return array;
    }
    public double getnewX(){
        x+= xspeed;
        return x;
    }
    public double getnewY(){
        y+= yspeed;
        return  y;
    }



    @Override
    public String toString() {
        return super.toString()
                + " and new position is "
                + getnewX()
                +","
                +getnewY();
    }
}
