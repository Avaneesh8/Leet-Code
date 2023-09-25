class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
        for(int x=0;x<nums.length;x++)
        {
            if(set.contains(nums[x]))
            {
                return true;
            }
            else
            {
                set.add(nums[x]);
            }
        }
        return false;
    }   
}