class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[i].length;j++){
                sum=sum+mat[i][j];
            }
            int temp1[]=new int[2];
            temp1[0]=i;
            temp1[1]=sum;
            pq.add(temp1);
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
          int temp[]=pq.poll();
          ans[i]=temp[0];
        }
        return ans;
    }
}