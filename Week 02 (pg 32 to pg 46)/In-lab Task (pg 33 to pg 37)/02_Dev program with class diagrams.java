/* 2. Consider the below class diagram and develop program */

/* p2 */
/* Code01 */
package p2;

public class Utility {
	public static long findReverse(long n) {
		long rev=0,reminder;
		while(n!=0) {
			reminder=n%10;
			rev=(rev*10)+reminder;
			n=n/10;
		}
		return rev;
	}
}
/* Code02 */
package p2;

public class Checker {
	public static boolean isArmstrong(int n) {
		int rem,temp=n,sum=0;
		while(n>0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isPalindrome(long n) {
		long temp=n;
		if(temp==Utility.findReverse(n)) {
			return true;
		}
		else {
			return false;
		}
	}
}
/* Code03 */
package p2;

public class DisplayAll {
	public static void displayPalindromeNOs(long n) {
		if(Checker.isPalindrome(n)==true) {
			System.out.println(n+" is a Palindrom number");
		}
		else {
			System.out.println(n+" is not a Palindrom number");
		}
	}
	public static void displayArmstrong(int n) {
		if(Checker.isArmstrong(n)==true) {
			System.out.println(n+" is a Armstrong number");
		}
		else {
			System.out.println(n+" is not a Armstrong number");
		}
	}
}

/* p1 */
/* main () method code */
package p1;
import java.util.*;
import p2.*;
public class Demo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number ( palindrome check ) >> ");
		long n=in.nextLong();
		DisplayAll.displayPalindromeNOs(n);
		System.out.print("Enter a number ( armstrong check ) >> ");
		int m=in.nextInt();
		in.close();
		DisplayAll.displayArmstrong(m);
	}

}