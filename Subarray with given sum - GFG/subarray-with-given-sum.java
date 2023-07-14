//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> g = new ArrayList<Integer>(2);
        int a=0,b=0,sum=arr[0],flag=0;
        while(a<=b+1)
        {
           
            if(sum<s)
            {
                
                /*if(arr[b]==s)
                {
                    g.add(a);
                   g.add(a);
                   return g;
                }*/
                b++;
                if(b==arr.length)
                {
                    break;
                }
                sum=sum+arr[b];
                continue;
                
            }
            else if(sum==s)
            {
                if(a>b)
                {
                    g.add(-1);
                    return g;
                }
                flag++;
                break;
            }
            else
            {
                sum=sum-arr[a];
                a++;
                /*if(a>b)
                {
                    if(arr[a]==s)
                    {
                   g.add(a);
                   g.add(a);
                   return g;
                    }
                }*/
                
                
            }
            
        }
        
        if(flag==1)
        {
        
        g.add(a+1);
        g.add(b+1);
        return g;
        }
        
        else
        {
            g.add(-1);
            return g;
        }
    }
}
