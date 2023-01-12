/* 1. Write a class Armstrong with 2 static methods is Armstrong() to check whether a given number is Armstrong or not and display Armstrong() to displays all Armstrong numbers up to n". Acces them using main () method from the same class. */

package week02;
import java.util.*;
public class Armstrong {
    public static boolean isArmstrong(int n) {
        int rem,temp=n,sum=0;
        while(n>0) {
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(temp==sum) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void displayArmstrong(int n) {
        for(int i=1;i<=n;i++){
        	boolean val=Armstrong.isArmstrong(i);
            if(val==true) {
                System.out.println(i);
            }
        }
	}
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number > ");
        int n=in.nextInt();
        in.close();
        Armstrong.displayArmstrong(n);
    }
}