//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;


// } Driver Code Ends


class Solution {
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        for(String c:arr)
        {
            if(c.equals("*")|| c.equals("+")||c.equals("-")||c.equals("/"))
            {
                int a=st.pop();
                int b=st.pop();
                if(c.equals("*"))
                st.push(a*b);
                else if(c.equals("+"))
                st.push(a+b);
                else if(c.equals("-"))
                st.push(b-a);
                else
                st.push((b/a));
            }
            else
            {
                st.push(Integer.parseInt(c));
            }
        }
        return st.peek();
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int t = Integer.parseInt(line);
        while (t-- > 0) {
            line = reader.readLine();
            String[] arr = line.split(" ");
            Solution solution = new Solution();
            System.out.println(solution.evaluate(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends