//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : 10.4
//  @ File Name : MyPoint.java
//  @ Date : 2014/5/7
//  @ Author : Copperfield
//
//




public class MyPoint {
	private double x;
	private double y;

	public MyPoint() {
	    this(0, 0);
	}
	
	public MyPoint(double newX, double newY) {
	    this.x = newX;
	    this.y = newY;
	}
	
	public double getX() {
	    return x;
	}
	
	public double getY() {
	    return y;
	}
	
	public static double distance(MyPoint n1, MyPoint n2) {
	    return Math.sqrt((n1.x - n2.x) * (n1.x - n2.x) +
            (n1.y - n2.y) * (n1.y - n2.y));
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
	    return Math.sqrt((x1 - x2) * (x1 - x2) +
            (y1 - y2) * (y1 - y2));
	}
}
