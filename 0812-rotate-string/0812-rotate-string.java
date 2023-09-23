class Solution {
    public boolean rotateString(String s, String goal) {
        String str=s+s;
        for(int x=0;x<s.length();x++)
        {
            if(str.substring(x,s.length()+x).equals(goal))
            {
                return true;
            }
        }
        return false;
    }
}