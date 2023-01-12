/* 5. Hossam has n trainees. He assigned a number ai for the i-th trainee. A pair of the i-th and j-th (ij) trainees is called successful if there is an integer x (x2), such that x divides ai, and x divides aj. Hossam wants to know if there is a successful pair of trainees. Hossam is very tired now, so he asks you for your help!

Link: https://bit.ly/CTOOD-WEEK2SKILL5 */
import java.io.*;
import java.util.*;
 
public class Codeforces
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=35000,p[]=new int[N+1],i,j;   //root wont be higher than that
        primes=new ArrayList<>();
        for(i=2;i<=N;i++)
        if(p[i]==0)
        {
            primes.add(i);
            for(j=i;j<=N;j+=i) p[j]=i;
        }
 
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine());
            String s[]=bu.readLine().split(" ");
 
            HashSet<Integer> hs=new HashSet<>();
            boolean ans=false;
            for(i=0;i<n && !ans;i++)
            {
                j=Integer.parseInt(s[i]);
                ans|=checkprime(hs,j);
            }
            if(ans) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.print(sb);
    }
 
    static ArrayList<Integer> primes;
    static boolean checkprime(HashSet<Integer> hs,int n)
    {
        for(int x:primes)
        if(x*x>n) break;
        else if(n%x==0)
        {
            if(hs.contains(x)) return true;
            hs.add(x);
 
            while(n%x==0) n/=x;
        }
 
        if(n>1)
        {
            if(hs.contains(n)) return true;
            hs.add(n);
        }
        return false;
    }
}