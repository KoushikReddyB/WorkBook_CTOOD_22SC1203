/* 1. Solve the following problems using java in hacker rank

LINK: https://bit.ly/CTOOD-W2SKILL1 */
package week02;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
class Person {
    int age;   
    Person(int initialAge){
        if(initialAge<0){
            this.age=0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else
            this.age=initialAge;
    }
    
    void yearPasses(){
        this.age++; 
    }
    
    void amIOld(){
        if(this.age<13)
            System.out.println("You are young.");
        else if (this.age>=18)
            System.out.println("You are old.");
        else
            System.out.println("You are a teenager."); 
    }
}