/* 6. Let a number x containing n digits. If sum of each digit raised to power n is equal to the number itself, then the number is said to be Armstrong number i.e. Now your task to check whether the given number is Armstrong number or not. */
package week01;
import java.util.*;
public class ArmstrongNumber {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int n,r,sum=0,temp;
			System.out.print("Enter the number: ");
			n=in.nextInt();
			in.close();
			temp=n;
			while(n>0) {
				r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
			}
			if(temp==sum) {
				System.out.println("The number "+temp+" is a Armstrong Number");
			}
			else {
				System.out.println("The number "+temp+" is not a Armstrong Number");
			}
		}
}
