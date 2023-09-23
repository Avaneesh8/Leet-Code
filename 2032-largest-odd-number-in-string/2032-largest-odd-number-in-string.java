class Solution {
    public String largestOddNumber(String num) 
    {
        for(int x=num.length();x>0;x--)
        {
            if((num.charAt(x-1))%2!=0)
            {
                return num.substring(0,x);
            }
            
        }
        return ""; 
    } 
}