class Solution {
    public int singleNumber(int[] nums) {
        int max=0;
        for(int x=0;x<nums.length;x++)
        {
            if(Math.abs(nums[x])>max)
            {
                max=Math.abs(nums[x]);
            }
        }
        int ar[]=new int[2*max+1];
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]>=0)
            {
                ar[nums[x]]=ar[nums[x]]+1;
            }
            else
            {
                ar[(nums[x]*-1)+max]=ar[(nums[x]*-1)+max]+1;
            }
        }
        for(int x=0;x<=2*max;x++)
        {
            if(x<=max && ar[x]==1)
            {
                return x;
            }
            else if(ar[x]==1)
            {
                return (x-max)*-1;
            }
        }
        return nums[0];
    }
}