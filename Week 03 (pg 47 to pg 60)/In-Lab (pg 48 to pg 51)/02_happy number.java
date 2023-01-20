/* 2. Write a java program to determine if a number n is happy. A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.

Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.

Those numbers for which this process ends in I are happy. Return true if n is a happy number, and false if not.

LINK: https://bit.ly/CTOOD-W3P2 */

/* LEETCODE: */
class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(n>0){
            int a = n%10;
            sum += a*a;
            n /=10;
        } if(sum == 1){
            return true;
        }else if(sum == 4){
            return false;
        }
        return isHappy(sum);
    }
}

/* WORKBOOK: */
package week03;
import java.util.*;
public class HappyNumber{
	public static boolean isHappy(int n) {
		int sum=0;
		while(n>0){
			int a = n%10;
			sum += a*a;
			n /=10;
		}
		if(sum == 1){
			return true;
		}
		else if(sum == 4){
			return false;
		}
		return isHappy(sum);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=in.nextInt();
		in.close();
		System.out.print(HappyNumber.isHappy(num));
	}
}