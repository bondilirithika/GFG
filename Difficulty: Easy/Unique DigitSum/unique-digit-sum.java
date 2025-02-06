//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        Solution solution = new Solution();

        while (t-- > 0) {
            String[] input = reader.readLine().trim().split("\\s+");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

            System.out.println(solution.uniqueDigitSums(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int uniqueDigitSums(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        {
            int sum=0;
            while(i>0)
            {
                sum+=i%10;
                i=i/10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return map.size();
    }
}
