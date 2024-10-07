//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long n = Long.parseLong(read.readLine());
            
            Solution ob = new Solution();
            
            ArrayList<Long> answer = ob.absDifOne(n);
            
            for(long value :  answer){
                System.out.print(value+" ");
            }
            
            if(answer.size() == 0)
            System.out.print(-1);
            
            System.out.println();

        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<Long> absDifOne(long N){
        ArrayList<Long> ans=new ArrayList<Long>();
        solve(N,ans);
        Collections.sort(ans);
        return ans;
    }
    
    void solve(long N,ArrayList<Long> ans)
    {
        Queue<Long> q=new LinkedList<Long>();
        for(long i=1;i<=9;i++)
        {
            q.add(i);
        }
        while(!q.isEmpty())
        {
            long n=q.poll();
            long lastdig=n%10;
            if(n>N)
            continue;
             if (n >= 10 && n <= N) {
                ans.add(n); 
            }
            if(n<=N)
            {
                if(lastdig==0)
                {
                    long num=n*10+lastdig+1;
                    if(num<=N)
                    {
                    q.add(num);
                    }
                }
                else if(lastdig==9)
                {
                    long num=n*10+8;
                    if(num<=N)
                    {
                    q.add(num);
                   
                    }
                }
                else
                {
                    long num1=n*10+lastdig+1;
                    long num2=n*10+lastdig-1;
                    if(num1<=N)
                    {
                    q.add(num1);
                    
                    }
                    if(num2<=N )
                    {
                    q.add(num2);
                   
                    }
                }
            }
            
        }
    }
}