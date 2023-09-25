class Solution {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        long finalAns=0;
        for(int i=0;i<maxHeights.size();i++){
            // now we are checking max sum for all indexes as peak
            long sum=maxHeights.get(i);
            long temp=maxHeights.get(i);
            for(int j=i;j>0;j--){
                temp=Math.min(temp,maxHeights.get(j-1));
                sum=sum+temp;
            }
            temp=maxHeights.get(i);
            for(int j=i;j<maxHeights.size()-1;j++){
                 temp=Math.min(temp,maxHeights.get(j+1));
                sum=sum+temp;
            }
            finalAns=Math.max(finalAns,sum);

        }
        return finalAns;
        
    }
}