/*1. Chris and Dolly were discussing about their monthly bills to be paid in the due time and identified that they are pending in paying the electrical bill and Dolly asks for the electrical bill details. Here are the details given by Chris for the payment of bill. Generate electricity bill based on numbers of units consumed

if units are <50 then rate per unit is 2RS.

Units are >= 51 and <= 100 then rate per unit is 3RS.

units are>= 101 and <= 300 then rate per unit is 5 Rs and add extra 100Rs to the total bill.

units are >=301 and <= 450 then rate per unit is 6RS and add extra 200 RS to the total bill

units are >450 then per unit is 8RS and add extra 250 RS to the total bill. Now your task is to identify the units utilized and the amount to be pay.
*/
package week01;
import java.util.*;
public class InLab01 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int NumberOfUnits;
		int cost=0;
		System.out.print("Enter number of units consumed: ");
		NumberOfUnits=in.nextInt();
		in.close();
		if(NumberOfUnits<50) {
			cost=NumberOfUnits*2;
		}
		else if(NumberOfUnits>=51 && NumberOfUnits<=100) {
			cost=NumberOfUnits*3;
		}
		else if(NumberOfUnits>=101 && NumberOfUnits<=300) {
			cost=(NumberOfUnits*5)+100;
		}
		else if(NumberOfUnits>=301 && NumberOfUnits<=450) {
			cost=(NumberOfUnits*6)+200;
		}
		else {
			cost=(NumberOfUnits*8)+250;
		}
		System.out.println("Amount to be paid: "+cost);

	}

}


