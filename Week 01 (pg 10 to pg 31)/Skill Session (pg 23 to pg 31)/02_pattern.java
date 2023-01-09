/* 2. Romeo proposed Juliet. Juliet is the college topper, so she has given a crazy star pattern for Romeo to print it.If Romeo prints it then there is some chance that Juliet accepts his proposal. But Romeo is very poor at coding, can you please help to make their love successful by printing the below pattern?

                                    *****
                                     ****
                                      ***
                                       **
                                        *
 */
package week01;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int rows;
		System.out.print("Enter rows >> ");
		rows=in.nextInt();
		in.close();
		for(int i=rows;i>=1;i--) {
			for(int j=rows;j>i;j--) {
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++) {  
			System.out.print("*");  
			}
		System.out.println("");
		}
	}
}