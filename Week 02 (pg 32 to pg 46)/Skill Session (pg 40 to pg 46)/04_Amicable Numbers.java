/* 4. Amicable numbers are two different natural numbers related in such a way that the sum of the proper divisors of each is equal to the other number. The smallest pair of amicable numbers is (220, 284). They are amicable because the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110, of which the sum is 284; and the proper divisors of 284 are 1, 2, 4, 71 and 142, of which the sum is 220. Create a class Amicable with 3 static methods isFactor () which finds whether a given number,,n" is a factor of,,m", isAmicable () to check whether a given number ,,n" and ,,m" are Amicable or not and displayAllAmicableNos () to displays all pairs of Amicable numbers up to,,n". Access them using main () from the same class. (Take hard coded input). */


package week02;
import java.util.*;
public class Amicable {
	public static int isFactor(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	public static boolean isAmicable(int n,int m) {
		int sum1=Amicable.isFactor(n);
		int sum2=Amicable.isFactor(m);
		if(n==sum2&&m==sum1){
		
			return true;
		}
		else {
			return false;
		}
	}
	public static void displayAllAmicableNumbers(int n) {
		int m=0;
		for(int i=1;i<n;i++) {
			for(m=1;m<n;m++){
				if(Amicable.isAmicable(i,m)==true) {
					System.out.println("Amicable pairs: "+i+" "+m);
				}
			}
		}
			
	}
		
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number n (1 to n): ");
		int n=in.nextInt();
		in.close();
		Amicable.displayAllAmicableNumbers(n);
	}
}
