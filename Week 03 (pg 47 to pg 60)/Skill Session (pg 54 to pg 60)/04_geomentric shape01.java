/* 4. Create a class GeometricShape with three overloaded methods findArea () to find area of square, rectangle, and circle, and modularize at method, class, and package level. (Hint: To find area of a square pass an integer value and to find a circle pass a double value) */

/* Package - geopack , Class GeomentricShape */
package geopack;

public class GeomentricShape {
	public int findArea(int s) {
		return(s*s);
	}
	public int findArea(int l,int b) {
		return(l*b);
	}
	public double findArea(double r) {
		return(3.14*r*r);
	}

}
 /* Package - mypack , Class - Demo */
 package mypac;
import geopack.*;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		GeomentricShape gs=new GeomentricShape();
		Scanner in=new Scanner(System.in);
		int s,l,b;
		double r;
		System.out.print("Enter side of Square: ");
		s=in.nextInt();
		System.out.println("The area of square is "+gs.findArea(s));
		System.out.print("Enter lenght and breadth of the Rectangle: ");
		l=in.nextInt();
		b=in.nextInt();
		System.out.println("The area of rectangle is "+gs.findArea(l, b));
		System.out.print("Enter the radius of Circle: ");
		r=in.nextDouble();
		System.out.println("The area of circle is "+gs.findArea(r));
		in.close();
		
	}

}
