/* 2. Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors 
excluding the number itself is equal to the number. Now your task to check whether the given number is Perfect number 
or not */
package week01;
import java.util.*;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		System.out.print("Enter a number >> ");
		n=in.nextInt();
		in.close();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println(n+" is a perfect number");
		}
		else {
			System.out.println(n+" is not a perfect number");
		}
	}

}
