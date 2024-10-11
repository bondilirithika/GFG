//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int[] a = new int[s.length];
            for (int i = 0; i < s.length; i++) a[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            int res = obj.pairWithMaxSum(a);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends

/*
class Solution {
    public int pairWithMaxSum(int[] arr) {
        // code here
        if(arr.length==1)
        return -1;
        
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            //int sum=0;
            PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
            pq.add(arr[i]);
            for(int j=i+1;j<arr.length;j++)
            {
                if(pq.size()==2 && arr[j]<=pq.peek())
                {
                    pq.poll();
                    int f=pq.peek();
                    pq.add(arr[j]);
                    ans=Math.max(ans,f+arr[j]);
                }
                else if(pq.size()<2)
                {
                pq.add(arr[j]);
                ans=Math.max(ans,arr[i]+arr[j]);
                }
            }
        }
        return ans;
    }
}
*/

class Solution {
    public int pairWithMaxSum(int[] arr) {
        // code here
        if(arr.length==1)
        return -1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            ans=Math.max(ans,arr[i]+arr[i+1]);
        }
        return ans;
    }
}
