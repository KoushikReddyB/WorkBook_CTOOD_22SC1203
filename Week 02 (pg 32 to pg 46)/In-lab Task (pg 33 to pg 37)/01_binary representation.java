/* 1. Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i<=n), ans[i] is the number of 1's in the binary representation of i.

Link: https://bit.ly/CTOOD-W2P1 */
/* LEETCODE:  */
class Solution {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        for(int i=1;i<=n;i++){
            res[i]=res[i/2]+i%2;
        }
        return res;
    }
}

/* WORKBOOK:  */
package week02;
import java.util.*;
public class BinaryRep {
	public int[] countBits(int n) {
        int[] res=new int[n+1];
        for(int i=1;i<=n;i++){
            res[i]=res[i/2]+i%2;
        }
        return res;
    }
	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.print("Enter a number: ");
			int n=in.nextInt();
			in.close();
			BinaryRep ans=new BinaryRep();
			int[] result=ans.countBits(n);
			System.out.print("[ ");
			for(int x:result) {
				System.out.print(x+" ");
			}
			System.out.print("]");
	}
}
