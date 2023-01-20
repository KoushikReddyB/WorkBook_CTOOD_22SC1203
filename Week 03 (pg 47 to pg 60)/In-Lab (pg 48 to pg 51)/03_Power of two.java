/* 3. Given an integer n, return true if it is a power of two. Otherwise, return false. An integer nisa power of two, if there exists an integer x such that n = 2x.

LINK: https://bit.ly/CTOOD-W3PO1 */

/* LEETCODE: */
class Solution {
    public boolean isPowerOfTwo(int num) {
        return num>0&&(num&num-1)==0;
    }
}

/* WORKBOOK: */
package week03;
import java.util.*;
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int num) {
        return num>0&&(num&num-1)==0;
    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=in.nextInt();
		in.close();
		System.out.print(PowerOfTwo.isPowerOfTwo(n));
	}
}