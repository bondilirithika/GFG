//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

//import java.util.HashMap;

class Solution {
    int countPairs(int arr[], int target) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            // Check if the complement is already in the map
            int complement = target - num;
            if (map.containsKey(complement)) {
                ans += map.get(complement); // Add the count of the complement
            }

            // Add the current number to the map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return ans;
    }
}



//{ Driver Code Starts.
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int target = Integer.parseInt(inputLine[0]);

            Solution obj = new Solution();
            int res = obj.countPairs(arr, target);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends