//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String s[] = br.readLine().split(" ");

            Solution obj = new Solution();

            String encodedString = obj.encode(s);
            String decodedStrings[] = obj.decode(encodedString);

            for (String x : decodedStrings) {
                System.out.print(x + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {

    public String encode(String strs[]) {
        // write your logic to encode the strings
        StringBuilder str=new StringBuilder();
        for(String s:strs)
        {
            str.append(""+s.length());
            str.append('#');
            str.append(s);
        }
        return str.toString();
    }

    public String[] decode(String s) {
        // write your logic to decode the string
        int i=0;
        ArrayList<String> arr=new ArrayList<>();
        while(i<s.length())
        {
            int j=i;
            while(j<s.length() && s.charAt(j)!='#')
            {
                j++;
            }
            int len=Integer.parseInt(s.substring(i,j));
            i=j+1;
            j=i+len;
            arr.add(s.substring(i,j));
            i=j;
        }
        String[] ans=new String[arr.size()];
        int ind=0;
        for(String str:arr)
        {
            ans[ind++]=str;
        }
        return ans;
    }
}