/* 3. Enhance a Utility class from session no 7 by adding three more static methods. which overload existing Sort () which accepts an array of double to sort them, findSmallest () which accepts an array of double to find smallest value, findLargest () which accepts an array of double to find largest value Access overloading methods from main () of Demo class of different package. (Take input through command line.) */

/* Utility Class */
package week03;
public class Utility {
	public static void sort(double a[])	{
		int i,j;
		double t;
		for(i=1;i<a.length;i++) {
			for(j=i;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	public static double findSmallest(double a[]) {
		double min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	public static double findLargest(double a[]) {
		double max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
}

/* Demo Class */
package week02;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double da[]=new double[n];
		int i=0;
		for(String s:args){
			da[i]=Double.parseDouble(s);
			i++;
		}
		in.close();
		Utility.sort(da);
		double min=Utility.findSmallest(da),max=Utility.findLargest(da);
		System.out.println("Max: "+max+"\nMin :"+min);
	}

}