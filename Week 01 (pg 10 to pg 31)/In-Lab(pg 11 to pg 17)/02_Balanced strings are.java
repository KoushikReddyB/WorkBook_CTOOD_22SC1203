/*2.Balanced strings are those that have an equal quantity of 'L' and 'R' characters. Given a balanced string s, split it into some number of substrings such that: Each substring is balanced. Return the maximum number of balanced strings you can obtain.

LINK: https://bit.ly/CTOOD-W1PO1 */

/*LEETCODE SOLUTION:*/
 class Solution {
    public int balancedStringSplit(String s) {
        int sum=0,ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                sum++;
            }else{
                sum--;
            }
            if(sum==0){
                ans++;
            }
        }
        return ans;
    }
}

/*WorkBook Solution:*/
package week01;
import java.util.*;
class InLab02 {
    private static int balancedStringSplit(String s) {
        int sum=0,ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                sum++;
            }else{
                sum--;
            }
            if(sum==0){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str;
        System.out.print("Enter the string: ");
        str=in.nextLine();
        in.close();
        System.out.print(balancedStringSplit(str) + "\n");
    }
}