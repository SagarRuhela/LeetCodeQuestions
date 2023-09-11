class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,Integer> map =new HashMap<>();
        List<List<Integer>> ans=new ArrayList<>();
        int n=groupSizes.length;
        for(int i=0;i<n;i++){
            map.put(i,groupSizes[i]);
        }
        for(int i=0;i<n;i++){
            if(map.get(i)>0){
                int size=map.get(i);
                ArrayList<Integer>list =new ArrayList<>(size);
                int j=0;
                int k=0;
                while(j<size && k<n){
                    if(map.get(k)==size){
                        list.add(k);
                        map.put(k,0);
                        k++;
                        j++;
                    }
                    else{
                        k++;
                    }
                }
                ans.add(list);
            }
        }
        return ans;
    }
}