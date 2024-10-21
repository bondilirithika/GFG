//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
// A^A=0
//SO TO DIVIDE THE WHOLE THING INTO TWO AND IN SUCH A WAY THAT THEIR XOR'S ARE EQUAL HAPPENS ONLY IF
//THE WHOLE ELEMENTS XOR IS 0
//I MEAN A1^A2=0
//IF THE XOR AFTER CONSIDERING ALL THE ELEMENTS IS NOT 0 THEN WE CANT DIVIDE IT ANY FURTHER
//IF WE CAN THEN:TOTAL NO.OF GROUPS THAT WE CAN FORM IS 2^N
//IN WHICH WE DONT WANT EMPTY GROUPS:({},{1,2,3}) AND ({1,2,3}.{})
//WE DONT WANT THI SSO TAOTAL:2^N-2
//WE ALSO DONT WANT GROUPS CONATINING SAME NUMBERS/ELEMENTS IN DIFF ORDER HENCE DIVIDE BY 2
//TPTAL:2 POWER N-1-1
    public static int countgroup(int arr[]) {
        // Complete the function
        int xor=0;
        for(int i:arr)
        {
            xor^=i;
        }
        if(xor!=0)
        return 0;
        else
        return (int)Math.pow(2,arr.length-1)-1;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            // int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int ans = obj.countgroup(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends