/*4. The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter, A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring. How tall will the tree be after n growth cycles?

Link:https://bit.ly/CTOOD-W1-S4  */
package week01;
import java.util.*;
public class UtopianTree {
	public static int utopianTree(int n){
        int r = 1;
        for(int i = 0;i<n;i++){
            if(i%2==0) {
            	r=r*2;
            }
            else {
                r=r+1;
            }
        }
        return r;
    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		System.out.print("Enter Cycle: ");
		n=in.nextInt();
		in.close();
		System.out.println("The height is "+UtopianTree.utopianTree(n));
	}

}
