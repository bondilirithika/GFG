//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int z;
        int i=0;
        if(map.containsKey(0)){
        z=map.get(0);
        
        while(z>0)
        {
            arr[i++]=0;
            z--;
        }}
        if(map.containsKey(1)){
        z=map.get(1);
        while(z>0)
        {
            arr[i++]=1;
            z--;
        }
        }
        if(map.containsKey(2)){
        z=map.get(2);
        while(z>0)
        {
            arr[i++]=2;
            z--;
        }
        }
    }
}

//{ Driver Code Starts.
// } Driver Code Ends