/*3. Ravi likes printing tables. So, whenever he finds a number, he will print a table for it. Given an integer, n, print its first 10 multiples. Each multiple n x i (where 1 <= i <= 10) should be printed on a new line in the form: n xi = result.

Link: https://bit.ly/CTOOD-W1S3
*/
package week;
import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		n=sc.nextInt();
		sc.close();
		int multi;
		for(int i=1;i<=10;i++)
		{
			multi=i*n;
			System.out.println(n+" X "+i+" = "+multi);
		}
	}

}