//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] r) {
        // code here
        HashMap<ArrayList<Integer>,ArrayList<String>> map=new HashMap<>();
        for(String s:r)
        {
            int[] arr=new int[26];
            for(char c:s.toCharArray())
            {
                arr[c-'a']+=1;
            }
            ArrayList<Integer> a=new ArrayList<>();
            for(int i:arr)
            {
                a.add(i);
            }
            map.put(a,map.getOrDefault(a,new ArrayList<String>()));
            ArrayList<String> str=map.get(a);
            str.add(s);
            map.put(a,str);
        }
        
        ArrayList<ArrayList<String>> ans=new ArrayList<ArrayList<String>>();
        for(ArrayList<Integer> k:map.keySet())
        {
            ArrayList<String> m=map.get(k);
            ans.add(m);
        }
        return ans;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline after the test case input
        while (t-- > 0) {
            String inputLine = sc.nextLine();
            String[] arr = inputLine.split(" ");

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> result = ob.anagrams(arr);
            result.sort(Comparator.comparing(a -> a.get(0)));
            for (ArrayList<String> group : result) {
                for (String word : group) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends