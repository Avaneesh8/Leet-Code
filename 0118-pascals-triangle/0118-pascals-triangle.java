class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listar=new ArrayList<>();
        if(numRows==1)
        {
            List<Integer> first=new ArrayList<>();
            first.add(1);
            listar.add(first);
            return listar;
        }
        List<Integer> first=new ArrayList<>();
        List<Integer> second=new ArrayList<>();
        first.add(1);
        second.add(1);
        second.add(1);
        listar.add(first);
        listar.add(second);
        for(int x=2;x<numRows;x++)
        {
            List<Integer> listarr=new ArrayList<>();
            List<Integer> innerList = listar.get(x-1);
            listarr.add(1);
            for(int y=0;y<x-1;y++)
            {
                listarr.add(innerList.get(y)+innerList.get(y+1));
            }
            listarr.add(1);
            listar.add(listarr);
        }
        return listar;
    }
}