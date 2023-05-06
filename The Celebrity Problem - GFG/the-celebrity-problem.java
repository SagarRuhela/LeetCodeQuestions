//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	int cel=-1;
    	for(int i=0;i<n;i++){
    	    boolean b=false;
    	    for(int j=0;j<n;j++){
    	        if(M[i][j]==1){
    	            b=true;
    	            break;
    	        }
    	    }
    	    if(!b){
    	         cel=i;
    	    }
    	
    	}
    	if(cel==-1){
    	    return -1;
    	}
    	int res=0;
    	for(int i=0;i<n;i++){
    	     res=res+ M[i][cel];
    	}
    	if(res==n-1){
    	    return cel;
    	}
    	else{
    	    return -1;
    	}
    	
    }
}