class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int max=Math.abs(points[0][0]-points[1][0]);
        for(int i=2;i<points.length;i++){
          max=Math.max(max,points[i][0]-points[i-1][0]);
        }
        return max;
    }
}