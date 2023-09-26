class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        
        if(index==-1)
        {
            int ar[]=new int[nums.length];
            for(int x=0;x<nums.length;x++)
            {
                ar[nums.length-1-x]=nums[x];
            }
            for(int x=0;x<nums.length;x++)
            {
                nums[x]=ar[x];
            }
        }
        else
        {
            for(int i=nums.length-1;i>index;i--)
            {
                if(nums[i]>nums[index])
                {
                    int temp=nums[i];
                    nums[i]=nums[index];
                    nums[index]=temp;
                    break;
                }
            }
            //System.out.println();
            int ar[]=new int[nums.length-index];
            int a=0;
            for(int x=nums.length-1;x>index;x--)
            {
                ar[a]=nums[x];
                a++;
            }
            a=0;
            for(int x=index+1;x<nums.length;x++)
            {
                nums[x]=ar[a];
                a++;
            }
        }
    }
}