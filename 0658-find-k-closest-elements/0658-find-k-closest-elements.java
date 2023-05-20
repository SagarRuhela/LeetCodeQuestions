class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)-> Math.abs(b-x)-Math.abs(a-x));
        for(int i:arr){
            if(pq.size()>=k){
                if(Math.abs(pq.peek()-x) > Math.abs(i-x)){
                    pq.remove();
                    pq.add(i);
                }
                else{
                  continue;  
                }
            }
              else{
                    pq.add(i);
                }
        }
        List<Integer> list=new ArrayList<>();
        while(!(pq.isEmpty())){
            list.add(pq.remove());
        }
        Collections.sort(list);
        return list;
    }
}