//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    String roundToNearest(String str) {
        // Complete the function//if last digit<=5 replace last digit with 0
        //else
        //add one to the remaining and
       int n = str.length();
        int last = str.charAt(n - 1) - '0';  // Extract the last digit
        StringBuilder ans = new StringBuilder();

        if (last <= 5) {
            // If the last digit is 5 or less, round down by replacing the last digit with '0'
            ans.append(str, 0, n - 1).append('0');
        } else {
            // If the last digit is greater than 5, we need to round up
            int carry = 1;  // Carry to add to the remaining number

            // Process the string from right to left, starting with the second-to-last digit
            for (int i = n - 2; i >= 0; i--) {
                int sum = (str.charAt(i) - '0') + carry;
                carry = sum / 10;
                ans.append(sum % 10);  // Append the result of this digit's sum
            }

            if (carry != 0) {
                ans.append(carry);  // Append any leftover carry if the first digit caused a carry (like 999 → 1000)
            }

            ans.reverse();  // Reverse the constructed string as we built it backwards
            ans.append('0');  // Finally, append the '0' for rounding
        }

        return ans.toString();
    }
}




//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {

            String str = br.readLine().trim();

            Solution obj = new Solution();

            String res = obj.roundToNearest(str);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends