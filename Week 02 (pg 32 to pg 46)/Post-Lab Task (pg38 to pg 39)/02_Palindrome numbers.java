/* 2. Write a class Palindrome with 3 static methods findReverse() which reverses a given number n", isPalindrome to check whether a given number n" is palindrome or not and displayPalindromeNos() to displays all palindrome numbers up to n". Access them using main () of Palindrome Demo Class which is in the same package. */

package week02;
import java.util.*;
public class Palindrome {
	public static int findReverse(int n) {
		int rev=0,reminder;
		while(n!=0) {
			reminder=n%10;
			rev=(rev*10)+reminder;
			n=n/10;
		}
		return rev;
	}
	public static boolean isPalindrome(int n) {
		int temp=n;
		if(temp==Palindrome.findReverse(n)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void displayPalindrome(int n) {
        for(int i=1;i<=n;i++){
        	boolean val=Palindrome.isPalindrome(i);
            if(val==true) {
                System.out.println(i);
            }
        }
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number > ");
		int n=in.nextInt();
		in.close();
		Palindrome.displayPalindrome(n);	
	}
}
