class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int ans[]=new int[2001];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int index= 1000+ -1*(arr[i]);
                ans[index]++;
            }
            else{
                ans[arr[i]]++;
            }
        }
        Arrays.sort(ans);
        for(int i=1;i<ans.length;i++){
            if(ans[i]==0){
                continue;
            }
            if(ans[i]==ans[i-1]){
                return false;
            }
        }
        return true;
    }
}