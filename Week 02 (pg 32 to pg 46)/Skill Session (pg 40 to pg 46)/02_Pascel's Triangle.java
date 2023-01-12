/* 2. Given an integer numRows, return the first numRows of Pascal's triangle In Pascal's triangle, each number is the sum of the two numbers directly below it as shown:

LINK: https://bit.ly/CTOOD-W2SKILL2 */

/* LEETCODE: */
public class Solution {
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++)
        {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++)
                row.set(j, row.get(j)+row.get(j+1));
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
        
    }
}
/* WORKBOOK: */
package week02;
import java.util.*;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++)
        {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++)
                row.set(j, row.get(j)+row.get(j+1));
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        PascalTriangle p = new PascalTriangle();
        System.out.print(p.generate(n));
        sc.close();
    }
}