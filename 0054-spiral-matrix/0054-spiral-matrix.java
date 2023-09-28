class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int r=col-1;
        int l=0;
        int top=0;
        int bottom=row-1;
        List<Integer> list=new ArrayList<Integer>();  
        while(r>=l && bottom>=top)
        {
        for(int x=l;x<=r;x++)
        {
            list.add(matrix[top][x]);
            
        }
        top++;
        for(int x=top;x<=bottom;x++)
        {
            list.add(matrix[x][r]);
            
        }
        r--;
        if(bottom>=top)
        {
        for(int x=r;x>=l;x--)
        {
            list.add(matrix[bottom][x]);
            
        }
        bottom--;
        }
        if(r>=l)
        {
        for(int x=bottom;x>=top;x--)
        {
            list.add(matrix[x][l]);
            
        }
        l++;
        }
    }
        return list;
    }
}