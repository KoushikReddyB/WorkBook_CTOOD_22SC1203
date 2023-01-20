/* 2. Implement the following leetcode program using method overloading. You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

LINK https://bit.ly/CTOOD-W3SKILL2 */

/* LEETCODE: */
class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}

/* WORKBOOK: */
package week03;
import java.util.*;
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		MaxProfit m=new MaxProfit();
		System.out.print("Enter the size of the array: ");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		in.close();
		System.out.print(m.maxProfit(a));
	}
}