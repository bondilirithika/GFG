//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {

    public static boolean isZigzag(int n, int[] arr) {
        int f = 1;

        for (int i = 1; i < n; i++) {
            if (f == 1) {
                if (arr[i - 1] > arr[i]) return false;
            } else {
                if (arr[i - 1] < arr[i]) return false;
            }
            f ^= 1;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String a[] = br.readLine().split(" ");
            int arr[] = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                arr[i] = Integer.parseInt(a[i]);
            }
            int n = arr.length;
            Solution obj = new Solution();
            obj.zigZag(arr);
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] == i % 2) {
                    flag = false;
                } else {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("0");
            } else {

                boolean check = isZigzag(n, arr);
                if (check) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public static void zigZag(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++)
        {
            if(i%2==0)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
            else
            {
                if(arr[i]<arr[i+1])
                {
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
}
