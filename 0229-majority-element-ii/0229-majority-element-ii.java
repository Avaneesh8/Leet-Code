class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> listint=new ArrayList<>();
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int x=0;x<n;x++)
        {
            
            if(hashmap.containsKey(nums[x]))
            {
                hashmap.put(nums[x],hashmap.get(nums[x])+1);
            }
            else
            {
                hashmap.put(nums[x],1);
            }  
        }
        for(Map.Entry<Integer, Integer> m : hashmap.entrySet()){      
            if((m.getValue())>n/3)
            {
                listint.add(m.getKey());
            }
        } 
        return listint;
    }
}