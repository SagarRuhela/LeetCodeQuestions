class Solution {
    HashMap<Integer,Integer> map;
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n=nums.length;
        int ans1=findLessThan(nums,k);
        int ans2=findGreaterThan(nums,k);
        long total=(long)n*(long)(n+1)/2;
        long ans=total-(ans1+ans2);
        return (int)ans;
    }
    public int findLessThan(int arr[],int k){
        k=k-1;
        int n=arr.length;
        int left=0;
        int right=0;
        int ans=0;
        this.map=new HashMap<>();
        while(right<n){
            if(map.containsKey(arr[right])){
                map.put(arr[right],map.get(arr[right])+1);
            }
            else{
                map.put(arr[right],1);
            }
            if(map.size()<k){
             ans=ans+(right-left+1);
            }
            else{
                while(map.size()>k){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
                }
                ans=ans+(right-left+1);
            }
            right++;
        }
        map.clear();
        return ans;

    }
    public int findGreaterThan(int arr[],int k){
        k=k+1;
        int n=arr.length;
        int left=0;
        int right=0;
        int ans=0;
        this.map=new HashMap<>();
        while(right<n){
             if(map.containsKey(arr[right])){
                map.put(arr[right],map.get(arr[right])+1);
            }
            else{
                map.put(arr[right],1);
            }
            if(map.size()>=k){
                while(map.size()>=k){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
                ans=ans+(n-right);
                }
            }
            right++;
        }
        map.clear();
        return ans;
    } 
}