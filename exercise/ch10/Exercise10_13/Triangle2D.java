//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : 10.13
//  @ File Name : Triangle2D.java
//  @ Date : 2014/5/8
//  @ Author : Copperfield
//
//

import java.awt.geom.Line2D;


public class Triangle2D {
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
	public Triangle2D() {
	    p1 = new MyPoint();
	    p2 = new MyPoint(1, 1);
	    p3 = new MyPoint(2, 5);
	}
	
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
	    this.p1 = p1;
	    this.p2 = p2;
	    this.p3 = p3;
	}
	
	public MyPoint getP1() {
	    return p1;
	}
	
	public MyPoint getP2() {
	    return p2;
	}
	
	public MyPoint getP3() {
	    return p3;
	}
	
	public void setP1(MyPoint p1) {
	    this.p1 = p1;
	}
	
	public void setP2(MyPoint p2) {
	    this.p2 = p2;
	}
	
	public void setP3(MyPoint p3) {
	    this.p3 = p3;
	}
	
	public double getArea() {
	    double side1 = MyPoint.distance(p1, p2); 
	    double side2 = MyPoint.distance(p2, p3);
	    double side3 = MyPoint.distance(p3, p1);

        double s = (side1 + side2 + side3) / 2.0;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		return area;
	}
	
	public double getPerimeter() {
	    double side1 = MyPoint.distance(p1, p2); 
	    double side2 = MyPoint.distance(p2, p3);
	    double side3 = MyPoint.distance(p3, p1);
	    return side1 + side2 + side3;
	}
	
	public boolean contains(MyPoint p) {
	    Line2D side1 = new Line2D.Double(p1.getX(), 
	    	p1.getY(), p2.getX(), p2.getY());
	    Line2D side2 = new Line2D.Double(p2.getX(),
	    	p2.getY(), p3.getX(), p3.getY());
	    Line2D side3 = new Line2D.Double(p3.getX(),
	    	p3.getY(), p1.getX(), p1.getY());

	    if (side1.contains(p.getX(), p.getY()) || side2.contains(p.getX(), p.getY())
	    	|| side3.contains(p.getX(), p.getY()))
	    	return true;

	    Line2D line1 = new Line2D.Double(p1.getX(), 
	    	p1.getY(), p.getX(), p.getY());
	    if (line1.intersectsLine(side2))
	    	return false;
	    Line2D line2 = new Line2D.Double(p2.getX(),
	    	p2.getY(), p.getX(), p.getY());
	    if (line2.intersectsLine(side3)) 
	    	return false;
	    Line2D line3 = new Line2D.Double(p3.getX(),
	    	p3.getY(), p.getX(), p.getY());
	    if (line3.intersectsLine(side1))
	    	return false;

	    return true;
	}
	
	public boolean contains(Triangle2D t) {
	    if (this.contains(t.getP1()) && this.contains(t.getP2())
	    	&& this.contains(t.getP3()))
	    	return true;
	    else 
	    	return false;
	}
	
	public boolean overlaps(Triangle2D t) {
	    if (contains(t) || t.contains(this))
	    	return true;
	    else {
	    	Line2D side1 = new Line2D.Double(p1.getX(), 
	    	    p1.getY(), p2.getX(), p2.getY());
	        Line2D side2 = new Line2D.Double(p2.getX(),
	    		p2.getY(), p3.getX(), p3.getY());
	    	Line2D side3 = new Line2D.Double(p3.getX(),
	    		p3.getY(), p1.getX(), p1.getY());

	    	Line2D tempLine1 = new Line2D.Double(t.p1.getX(),
	    		t.p1.getY(), t.p2.getX(), t.p2.getY());
	    	Line2D tempLine2 = new Line2D.Double(t.p2.getX(),
	    		t.p2.getY(), t.p3.getX(), t.p3.getY());
	    	Line2D tempLine3 = new Line2D.Double(t.p3.getX(),
	    		t.p3.getY(), t.p3.getX(), t.p3.getY());

	    	if (tempLine1.intersectsLine(side1) ||
	    		tempLine1.intersectsLine(side2) ||
	    		tempLine1.intersectsLine(side3) ||
	    		tempLine2.intersectsLine(side1) ||
	    		tempLine2.intersectsLine(side2) ||
	    		tempLine2.intersectsLine(side3) ||
	    		tempLine3.intersectsLine(side1) ||
	    		tempLine3.intersectsLine(side2) ||
	    		tempLine3.intersectsLine(side3))
	    		return true;
	    }

	    return false;
	}

	private static double distance(double x1, double y1, 
        double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
}
