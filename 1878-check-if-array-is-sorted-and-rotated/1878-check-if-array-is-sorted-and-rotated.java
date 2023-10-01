class Solution {
    public boolean check(int[] nums) {
        int max=nums[0];
        int m=0;
        for(int x=1;x<nums.length;x++)
        {
            if(nums[m]<=nums[x])
            {
                //System.out.println(nums[x]);
                m=x;
            }
        }
        if(nums.length>1)
        {
        if(nums[m]==nums[0] && nums[nums.length-1]==nums[m] && nums[0]!=nums[1])
        {
            m=0;
        }
        if(nums[m]==nums[0] && nums[nums.length-1]==nums[m] && nums[0]==nums[1])
        {
            m=1;
        }
        }
        //System.out.println(nums[m]);
        int ar[]=new int[nums.length];
        int y=0;
        for(int x=m+1;x<nums.length;x++)
        {
            ar[y]=nums[x];
            y++;
        }
        for(int x=0;x<=m;x++)
        {
            ar[y]=nums[x];
            y++;
        }
        for(int x=0;x<nums.length-1;x++)
        {
            if(ar[x]>ar[x+1])
            {
                return false;
            }
        }
        return true;
    }
}

