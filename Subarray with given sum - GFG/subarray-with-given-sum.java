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
        
        ArrayList<Integer> arrlist = new ArrayList<Integer>(3);
        int start=0;
        int sum=arr[0];
        arrlist.add(-1);
        for(int x=0;x<arr.length;)
        {
            
            if(sum==s)
            {
                if(start>x)
                {
                    break;
                }
                arrlist.remove(0);
                arrlist.add(start+1);
                arrlist.add(x+1);
                //System.out.println("hi");
                break;
            }
            else if(sum<s)
            {
                x++;
                if(x==arr.length)
                {
                    break;
                }
                sum+=arr[x];
                //System.out.println(sum);
                continue;
            }
            else if(sum>s)
            {
                sum-=arr[start];
                /*if(sum<0)
                {
                    sum=0;
                    x++;
                    if(x==arr.length)
                    {
                    break;
                    }
                    start++;
                    continue;
                }*/
                
                /*if(start==x)
                {
                    start=x;
                    //x++;
                    continue;
                }*/
                start++;
            }
        }
        return arrlist;
    }
}