class Solution {
    public void merge(int[] nums1, int m, int[] nums,int n){
        /*int i=0;
        int a=0;
        int ar[]=new int[m+n];
        for(int x=0;x<(m+n);x++)
        {
            if(i<=m && a>=n)
            {
                ar[x]=nums1[i];
                i++;
            }
            else if(a<=n && i>=m)
            {
                ar[x]=nums[a];
                a++;
            }
            else if(nums1[i]<=nums[a])
            {
                ar[x]=nums1[i];
                i++;
            }
            else
            {
                ar[x]=nums[a];
                a++;

            }
        }
        for(int x=0;x<(m+n);x++)
        {
            nums1[x]=ar[x];
        }
    }*/
    if(m<=0)
    {
                for(int x=0;x<n;x++)
        {
            nums1[x+m]=nums[x];
        }
    }
    else if(n<=0)
    {

    }
    else
    {
    for(int x=0;x<(m);x++)
    {
        if(nums1[x]<=nums[0])
        {
            nums1[x]=nums1[x];
        }
        else
        {
            int temp=nums[0];
            nums[0]=nums1[x];
            nums1[x]=temp;Arrays.sort(nums);
            //System.out.println(nums[x]);
        }
    }
    for(int x=0;x<n;x++)
    {
        nums1[x+m]=nums[x];
    }
    }
    }
}