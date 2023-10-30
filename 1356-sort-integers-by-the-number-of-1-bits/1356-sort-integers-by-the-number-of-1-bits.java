class Solution {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                int t1=Integer.bitCount(a);
                int t2=Integer.bitCount(b);
                if(t1==t2){
                    return a-b;
                }
                else{
                    return t1-t2;
                }
            }
        });
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int j=0;
        while(!pq.isEmpty()){
       arr[j++]=pq.remove();
        }
    return arr;
    }
}