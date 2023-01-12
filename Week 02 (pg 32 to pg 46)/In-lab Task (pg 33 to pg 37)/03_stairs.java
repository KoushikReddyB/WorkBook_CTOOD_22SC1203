/* 3. You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

LINK: https://bit.ly/CTOOD-W2PO2 */

package week02;
import java.util.*;
public class Stairs {
	    public int climbStairs(long n) {
	        if (n == 0) {
	            return 0;
	        }
	        if (n == 1) {
	            return 1;
	        }
	        if (n == 2) {
	            return 2;
	        }
	        return climbStairs(n - 1) + climbStairs(n - 2);
	    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter any number >> ");
		long n=in.nextInt();
		in.close();
		Stairs a=new Stairs();
		long res=a.climbStairs(n);
		System.out.println(res);
	}

}