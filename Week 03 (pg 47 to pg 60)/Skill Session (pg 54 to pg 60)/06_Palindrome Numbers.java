/* 6. Enhance the class Palindrome of Problem W02-P04 with another static method isPalindrome() to check whether an each element array is palindrome or not. If all the elements in the array are palindrome numbers then return true otherwise, return false. Access them using main () from the same class. (Take hard coded value for the variable n) */

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
	public static void displayAllPalindromeNOs(int n) {
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
		Palindrome.displayAllPalindromeNOs(n);	
	}
}
