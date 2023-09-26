class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> listint=new ArrayList<>();
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        for(int x=0;x<n;x++)
        {
            
            if(hashtable.containsKey(nums[x]))
            {
                hashtable.put(nums[x],hashtable.get(nums[x])+1);
            }
            else
            {
                hashtable.put(nums[x],1);
            }  
        }
        for(Map.Entry<Integer, Integer> m : hashtable.entrySet()){      
            if((m.getValue())>n/3)
            {
                listint.add(m.getKey());
            }
        } 
        return listint;
    }
}