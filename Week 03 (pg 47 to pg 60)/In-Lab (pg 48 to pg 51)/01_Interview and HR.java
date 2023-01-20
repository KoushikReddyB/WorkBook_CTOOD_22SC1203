/* 1. For an interview, the candidates are waiting outside for their turn. Among these candidates one person is the referral candidate, and each candidate is given an interview ID no.HR staff was given a list containing the list of candidates attended for the interview, if the referral candidate attends the interview he will be in the selected list. Given the list of interview ID numbers, the task of the HR staff is to search the referral candidates ID no. Help HR staff to complete the task. To model this scenario, create a class Interview with a static method search () which accepts an array of integers which represent all the candidates ID numbers and a referral candidate ID number. If referral candidate ID is present in array return true otherwise, return false. Access the methods in Interview class from main () of HR class. (Take input through command line) */

/* Interview Class */
package week03;
public class Interview {
	public static boolean search(int[] ids, int id) {
		int flag=0;
		for(int i=0;i<ids.length;i++) {
			flag=1;
			break;
		}
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
}

/* Hr Class */
package week03;
import java.util.*;
public class Hr {

	public static void main(String[] args) {
		int ids[]=new int[200];
		int i=0;
		for(String s:args) {
			ids[i]=Integer.parseInt(s);
			i++;
		}
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a ID: ");
		int id=in.nextInt();
		in.close();
		if(Interview.search(ids,id)) {
			System.out.println("Reference Candidate Selected");
		}
		else {
			System.out.println("Reference Candidate "+id+" was Not Found!");
		}

	}

}
