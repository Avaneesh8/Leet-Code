class Solution {
    public int[] rearrangeArray(int[] nums) {
        /*int first=0;
        if(nums[0]<0)
        {
            for(int y=1;y<nums.length;y++)
            {
                if(nums[y]>=0)
                {
                     first=y;
                     break;
                }
            }
            int temp=nums[0];
            nums[0]=nums[first];
            int temp1=0;
            for(int j=1;j<first;j++)
            {
                temp1=nums[j];
                nums[j]=temp;
                temp=temp1;
            }
            nums[first]=temp;
        }
        for(int x=0;x<nums.length-1;x++)
        {
            if(!((nums[x]>=0 && nums[x+1]<0 )||(nums[x]<0 && nums[x+1]>=0)))
            {
                for(int y=x+2;y<nums.length;y++)
                {
                    if((nums[x]>=0 &&  nums[y]<0)||(nums[x]<0  &&  nums[y]>=0))
                    {
                        int temp=nums[x+1];
                        nums[x+1]=nums[y];
                        int temp1=0;
                        for(int j=x+2;j<y;j++)
                        {
                            temp1=nums[j];
                            nums[j]=temp;
                            temp=temp1;
                        }
                        nums[y]=temp;
                        break;
                    }
                }
            }
        }
        return nums*/
        int pos[]=new int[nums.length/2+1];
        int p=0;
        int neg[]=new int[nums.length/2+1];
        int n=0;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]>=0)
            {
                pos[p]=nums[x];
                p++;
            }
            else
            {
                neg[n]=nums[x];
                n++;
            }
        }
        int y=0;
        for(int x=0;x<nums.length/2;x++)
        {
            nums[y]=pos[x];
            y++;
            nums[y]=neg[x];
            y++;
        }
        return nums;
    }
}