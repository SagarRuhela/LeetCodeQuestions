class Solution {
    
    public int[][] kClosest(int[][] points, int k) {
        int arr[][]=new int[k][2];
        PriorityQueue<Pair> pq=new PriorityQueue<>((p1,p2)->p2.d-p1.d);
        for( int i=0;i<points.length;i++){
            int a=points[i][0];
            int b=points[i][1];
            if(pq.size()>=k){
                double temp=(Math.pow((a),2)+ Math.pow(b,2));
                if(pq.peek().d>temp){
                    pq.remove();
                    pq.add(new Pair(a,b));
                }
            }
            else{
                pq.add(new Pair(a,b));
            }
        }
        int j=0;
        while(!(pq.isEmpty())){
            arr[j][0]=pq.peek().x;
            arr[j][1]=pq.peek().y;
            j++;
            pq.remove();
        }
        return arr;
    }
}
class Pair{
    int x;
    int y;
    int d;
    public Pair(int x,int y){
       this.x=x;
       this.y=y;
       d=(int)(Math.pow(x,2) + Math.pow(y,2));
    }
}