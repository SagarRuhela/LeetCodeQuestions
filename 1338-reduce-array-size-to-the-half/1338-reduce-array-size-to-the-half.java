class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(map.values());
        int n=arr.length;
        int count=0;
        while(n>arr.length/2){
            n=n-pq.remove();
            count++;
        }
        return count;
    }
}