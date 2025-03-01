//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s = in.readLine();

            Solution ob = new Solution();
            out.println(ob.decodeString(s));

            out.println("~");
        }
        out.close();
    }
}
// } Driver Code Ends



class Solution {
    static String decodeString(String s) {
        // code here
        Stack<Integer> n=new Stack<>();
        Stack<Character> st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        int num=0;
        for(char c:s.toCharArray())
        {
            
            if(Character.isDigit(c))
            {
                num=(num*10)+(c-'0');
            }
            else if(c==']')
            {
                StringBuilder temp=new StringBuilder();
                while(st.peek()!='[')
                {
                    temp.append(st.pop());
                }
                st.pop();
                int rep=n.pop();
                temp=temp.reverse();
                while(rep>0)
                {
                    for(char ch:temp.toString().toCharArray())
                    {
                        st.push(ch);
                    }
                    rep--;
                }
                
            }
            else if(c=='[')
            {
                st.push(c);
                n.push(num);
                num=0;
            }
            else
            st.push(c);
        }
        
        while(!st.isEmpty())
        {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}