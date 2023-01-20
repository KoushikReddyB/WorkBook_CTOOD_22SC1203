/* 1. Write a java program to create a class name called number with 2 methods (with same method name with different argument).In main methods call the methods based on the argument and observe the output */

package week03;
import java.util.*;
public class Number {
	public int Addition(int a,int b) {
		System.out.println("You are running the first method");
		return a+b;
	}
	public float Addition(float a,float b) {
		System.out.println("You are running the second method");
		return a+b;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Number n=new Number();
		System.out.print("Enter two intgers: ");
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println("The sum of 2 integers is "+n.Addition(a,b));
		System.out.print("Enter two floating numbers: ");
		float c=in.nextFloat();
		float d=in.nextFloat();
		System.out.println("The sum of 2 floating numbers is "+n.Addition(c,d));
		in.close();
	}
}
