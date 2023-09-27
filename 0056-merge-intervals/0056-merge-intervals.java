class Solution {
    public int[][] merge(int[][] intervals) {
        int ar[][]=new int[intervals.length][2];
        Arrays.sort(intervals, new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            return Integer.compare(o1[0], o2[0]);
        }
        });
        for (int[] row : intervals) {
            System.out.println(Arrays.toString(row));
        }
        int i=0;
        int a=0;
        int j=1;
        boolean f=true;
        boolean fa=true;
        int count=0;
        for(int x=0;x<intervals.length-1;x++)
        {
            if(intervals[i][1]>=intervals[j][0])
            {
                intervals[i][0]=intervals[i][0];
                if(intervals[i][1]>=intervals[j][1])
                {
                    intervals[i][1]=intervals[i][1];
                    fa=false;
                }
                else
                {
                    intervals[i][1]=intervals[j][1];
                    fa=true;
                }
                System.out.println(intervals[i][0]+" "+intervals[i][1]+" "+j);
                j++;
                f=false;
            }
            else
            {
                ar[a][0]=intervals[i][0];
                ar[a][1]=intervals[i][1];
                count++;
                a++;
                i=j;j++;
                System.out.println("hello");
                f=true;
            }
        }
        System.out.println(j);
        if(f==true)
        {
            ar[a][0]=intervals[i][0];
            ar[a][1]=intervals[i][1];
        }
        else
        {
            ar[a][0]=intervals[i][0];
            if(fa==false)
            {
                ar[a][1]=intervals[i][1];
            }
            else
            {
                ar[a][1]=intervals[j-1][1];
            }
        }
        int arr[][]=new int[count+1][2];
        for(int x=0;x<count+1;x++)
        {
            arr[x][0]=ar[x][0];
            arr[x][1]=ar[x][1];
        }
        return arr;
    }
}