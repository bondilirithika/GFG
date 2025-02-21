//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            new Solution().setMatrixZeroes(arr);
            for (int[] row : arr) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


//Back-end complete function Template for Java
class Solution {
    public void setMatrixZeroes(int[][] mat) {
        boolean row=false;
        boolean col=false;
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<c;i++)
        {
            if(mat[0][i]==0)
            {
                row=true;
                break;
            }
        }
        for(int i=0;i<r;i++)
        {
            if(mat[i][0]==0)
            {
                col=true;
                break;
            }
        }
        
        for(int i=1;i<r;i++)
        {
            for(int j=1;j<c;j++)
            {
                if(mat[i][j]==0)
                {
                    mat[0][j]=0;
                    mat[i][0]=0;
                }
            }
        }
        
        for(int i=1;i<c;i++)
        {
            if(mat[0][i]==0)
            {
                for(int j=1;j<r;j++)
                {
                    mat[j][i]=0;
                }
            }
        }
        for(int i=1;i<r;i++)
        {
            if(mat[i][0]==0)
            {
                for(int j=1;j<c;j++)
                {
                    mat[i][j]=0;
                }
            }
        }
        
        if(row)
        {
            for(int i=0;i<c;i++)
            {
                mat[0][i]=0;
            }
        }
        if(col)
        {
            for(int i=0;i<r;i++)
            {
                mat[i][0]=0;
            }
        }
    }
}