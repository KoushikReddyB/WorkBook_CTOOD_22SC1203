/*1. The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is, F (0) =0, F(1) =1 F(n) = F (n-1)+F (n-2), for n>1. Given n, calculate F(n). Now your task to print the Fibonacci series number's up to n number. */
package week01;
import java.util.*;
public class FibonacciSequence {
	private static int f0=0,f1=1,fn=0;
	public void printfibo(int count) {
		if(count>0) {
			fn=f0+f1;
			f0=f1;
			f1=fn;
			System.out.print(" "+fn);
			printfibo(count-1);
		}
	}
	public static void main(String[] args) {
		FibonacciSequence a=new FibonacciSequence();
		Scanner in=new Scanner(System.in);
		int count;
		System.out.print("Enter number >> ");
		count=in.nextInt();;
		in.close();
		System.out.print(f0+" "+f1);
		a.printfibo(count-2);
	}

}