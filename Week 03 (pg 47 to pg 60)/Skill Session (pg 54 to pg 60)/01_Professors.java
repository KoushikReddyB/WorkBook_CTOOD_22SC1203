/* 1. An organization contains 5 departments, and each department contains (9, 12, 14, 16, 21) faculty members in which there will be one Professor and two Associate Professors. Develop a java method to calculate total Assistant Professors present in the entire organization. */

package week03;
public class Professors {

	public static void main(String[] args) {
		int total=0;
		int number_of_faculty;
		for(String s:args) {
			number_of_faculty=Integer.parseInt(s);
			total=total+(number_of_faculty-3);
		}
		System.out.println("The total number of Assistant Professors: "+total);
	}

}