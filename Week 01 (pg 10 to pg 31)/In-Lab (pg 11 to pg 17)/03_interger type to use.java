/*3.integer type to use if one wants to store a positive integer n? 

Link: https://bit.ly/CTOOD-W1P3 */
package week01;
import java.util.*;
public class InLab03 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long x;
		System.out.println("Enter a number: ");
		x=in.nextLong();
		in.close();
		if(x<=127) {
			System.out.println("byte");
		}
		else if(x<=32767) {
			System.out.println("short");
		}
		else if(x<=2147483647) {
			System.out.println("int");
		}
		else {
			System.out.println("long");
		}
	}
}
