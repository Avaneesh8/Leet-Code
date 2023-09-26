class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> listint=new ArrayList<>();
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        for(int x=0;x<n;x++)
        {
            
            if(hashtable.containsKey(nums[x]))
            {
                int i=hashtable.get(nums[x])+1;
                hashtable.put(nums[x],i);
            }
            else
            {
                hashtable.putIfAbsent(nums[x],1);
            }  
        }
   for(Map.Entry<Integer, Integer> m : hashtable.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
    if((m.getValue())>n/3)
    {
        listint.add(m.getKey());
    }
   } 

        return listint;
    }
}