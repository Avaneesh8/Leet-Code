class Solution {
    public int uniquePaths(int m, int n) {
        double sum=1;
        for(int x=1;x<=n-1;x++)
        {
            sum=sum*(m-1+x)/x;
        }
        return (int)sum;
    }
}