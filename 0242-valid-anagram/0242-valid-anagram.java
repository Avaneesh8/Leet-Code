class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer> Map=new HashMap<Character,Integer>();
        for(int x=0;x<s.length();x++)
        {
            if(Map.containsKey(s.charAt(x)))
            {
                int count=Map.get(s.charAt(x))+1;
                Map.put(s.charAt(x),count);
            }
            else
            {
                Map.put(s.charAt(x),1);
            }
        }
        for(int x=0;x<t.length();x++)
        {
            if(Map.containsKey(t.charAt(x)))
            {
                int count=Map.get(t.charAt(x))-1;
                if(count<0)
                {
                    return false;
                }
                Map.put(t.charAt(x),count);
            }
            else
            {
                return false;
            }
        } 
        return true;
    }
}