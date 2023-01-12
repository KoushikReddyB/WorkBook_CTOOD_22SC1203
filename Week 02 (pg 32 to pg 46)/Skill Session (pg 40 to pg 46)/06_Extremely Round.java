/* 6. Let's call a positive integer extremely round if it has only one non-zero digit. For example, 5000, 4, 1, 10, 200 are extremely round integers; 42, 13, 666, 77, 101 are not. You are given an integer n. You have to calculate the number of extremely round integers x such that 1<x<=n.

LINK: https://bit.ly/CTOOD-W2SKILL6 */
package week02;
import java.util.*;
public class ExtremelyRound {
    static Scanner xd = new Scanner(System.in);
    public static void main(String args[]) {
        int t =xd.nextInt();
        for (int i = 0; i < t; i++) {
            int a = xd.nextInt();
            String str = ""+a;
            System.out.println(str.charAt(0)-'0'+(str.length()-1)*9);
        }
    }
}