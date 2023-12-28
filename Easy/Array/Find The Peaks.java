class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> list=new ArrayList<>();
        int n=mountain.length,i,j;
        if(n>2){
        for(i=1;i<n-1;i++){
            if(mountain[i-1]<mountain[i] && mountain[i+1]<mountain[i])
                list.add(i);
        }
        }
        
       // System.out.println(list.get(0));
        return list;
    }
}