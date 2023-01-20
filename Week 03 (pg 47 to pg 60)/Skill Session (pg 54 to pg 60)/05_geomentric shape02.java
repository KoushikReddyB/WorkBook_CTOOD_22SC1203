/* 5. Create a class GeometricShape with three overloaded methods findPerimeter () to find perimeter of square, rectangle, and circle. and modularize at method, class, and package level.

Note: To find perimeter of a square pass an integer value and to find a circle pass a double value */

/* Package - geopack , Class GeomentricShape */
package geopack;

public class GeomentricShape {
	public int findPerimeter(int s) {
		return(4*s);
	}
	public int findPerimeter(int l,int b) {
		return(2*(l+b));
	}
	public double findPerimeter(double r) {
		return(2*3.14*r);
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
		System.out.println("The perimeter of square is "+gs.findPerimeter(s));
		System.out.print("Enter lenght and breadth of the Rectangle: ");
		l=in.nextInt();
		b=in.nextInt();
		System.out.println("The perimeter of rectangle is "+gs.findPerimeter(l, b));
		System.out.print("Enter the radius of Circle: ");
		r=in.nextDouble();
		System.out.println("The perimeter/circumference of circle is "+gs.findPerimeter(r));
		in.close();
		
	}

}
