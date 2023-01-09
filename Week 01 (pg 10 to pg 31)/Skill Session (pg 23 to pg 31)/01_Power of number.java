/* 1. For every x, try xy where y starts from 2 and increases one by one until either xy becomes n or greater than n. 
Write a program to find power of a number using while loops. The base number (>0) and exponent (>=0) is taken from the 
test cases. Now your task to is to find power of a number. (Hint: Use while Loop). */
package week01;
import java.util.*;
public class S01PowerOfNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int base,exponent,expo;
		System.out.print("Enter the base: ");  
		base=in.nextInt();
		System.out.print("Enter the exponent: ");  
		exponent=in.nextInt();
		in.close();
		expo=exponent;  
		long power=1;
		while(exponent!=0) {
			power=power*base;
			--exponent;
		}
		System.out.println(base +" to the power " +expo + " is: "+power);
	}

}
