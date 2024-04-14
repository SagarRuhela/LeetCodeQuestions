class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int leftmin[]=new int[n];
        int rightmin[]=new int [n];
        leftmin[0]=-1;
        rightmin[n-1]=n;
        // here we are finding the left  side min. index at which our histrogrm is smaller than the current one at left side
        for(int i=1;i<n;i++){
            int prev=i-1;
            while(prev>=0 && heights[prev]>=heights[i]){
                prev=leftmin[prev];
            }
            leftmin[i]=prev;
        }
         // here we are finding the right side min. index at which our histrogrm is smaller than the current one at right side
        for(int i=n-2;i>=0;i--){
            int prev=i+1;
            while(prev<=n-1 && heights[prev]>=heights[i]){
                prev=rightmin[prev];
            }
            rightmin[i]=prev;
        }
        // here now we are finding the area of rectangle
        int maxArea=0;
        for(int i=0;i<n;i++){
            maxArea=Math.max(maxArea,heights[i]*(rightmin[i]-leftmin[i]-1));
        }
        return maxArea;
    }
}