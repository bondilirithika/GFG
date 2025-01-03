//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String s[] = br.readLine().split(" ");
            int arr[] = new int[s.length];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int k = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            System.out.println(obj.subarrayXor(arr, k));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        //long ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        long ans=0;
        int pref=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++)
        {
            pref^=arr[i];
            int req=pref^k;
            if(map.containsKey(req))
            {
                ans+=map.get(req);
            }
            map.put(pref,map.getOrDefault(pref,0)+1);
        }
        return ans;
    }
}