class Solution {
    int answer=0;
    public int maximumRequests(int n, int[][] requests) {
        int indegree[]=new int[n];
        helper(0,requests,indegree,0);
        return answer;
    }
    public void helper(int index,int[][] requests,int indegree[],int count){
        if(index==requests.length){
            for(int i:indegree){
                if(i!=0){
                    return;
                }
            }
            answer=Math.max(count,answer);
            return;
        }
        // take
        indegree[requests[index][0]]--;
        indegree[requests[index][1]]++;
        helper(index+1,requests,indegree,count+1);
        // not take
        indegree[requests[index][0]]++;
        indegree[requests[index][1]]--;
        helper(index+1,requests,indegree,count);

    }
}