class Solution {
    public int helper(int[] locations, int curr, int finish, int fuel,int mem[][]){
        if(fuel<0){
            return 0;
        }
        if(mem[curr][fuel]!=-1){
            return mem[curr][fuel];
        }
        int ans;
        if(curr==finish){
            ans=1;
        }
        else{
            ans=0;
        }
        for(int i=0;i<locations.length;i++){
            if(i!=curr){
                ans=(ans+helper(locations,i,finish,fuel-Math.abs(locations[curr]-locations[i]),mem))%1000000007;
            }
        }        
        return mem[curr][fuel]=ans;
 



    }
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        int n=locations.length;
        int mem[][]=new int[n][fuel+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<fuel+1;j++){
                mem[i][j]=-1;
            }
        }
        int ans=helper(locations,start,finish,fuel,mem);
        return ans;
    }
}