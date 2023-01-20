/* 2. Consider two closed circuits containing ten resistors each connected in series and parallel respectively. Find the total resistance of the two circuits. To model the above scenario, create a class Circuit with a static method findTotalResistance () which receives an array of integers which represent resistance of each resistor in the serial circuit and returns the total resistance. find TotalResistance() which receives an array of float which represent resistance of each resistor in the parallel circuit and returns the total resistance. Access the methods in Circuit class from its own main (). (Take hardcoded input) */

package week03;
import java.util.*;
public class Circuit {
	public static void findTotalResistance(int[] resistance) {
		double sum=0.0;
		for(int i=0;i<resistance.length;i++) {
			sum=sum+resistance[i];
		}
		System.out.println("The total resistance in series is: "+sum);
	}
	public static void findTotalResistance(float[] resistance) {
		double sum=0.0;
		for(int i=0;i<resistance.length;i++) {
			sum=sum+(1/resistance[i]);
		}
		System.out.print("The total resistance in parallel is: "+sum);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int res1[]=new int[10];
		float res2[]=new float[10];
		System.out.print("Enter resistor values (in numbers): ");
		for(int i=0;i<10;i++) {
			res1[i]=in.nextInt();
		}
		Circuit.findTotalResistance(res1);
		System.out.print("Enter resistor values (in decimals): ");
		for(int i=0;i<10;i++) {
			res2[i]=in.nextFloat();
		}
		Circuit.findTotalResistance(res2);
		in.close();
	}
}
