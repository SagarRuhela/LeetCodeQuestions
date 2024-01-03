class Solution {
    public int numberOfBeams(String[] bank) {
        int n=bank.length;
        int ans=0;
        int l1=0;
        int l2=0;
        for(int i=0;i<bank[0].length();i++){
            if(bank[0].charAt(i)=='1'){
                l1++;
            }
        }
        System.out.println(l1);
        for(int i=1;i<n;i++){
            String str=bank[i];
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1'){
                    l2++;
                }
            }
            if(l1==0 && l2!=0){
                l1=l2;
                l2=0;
            }
            else if(l1>0 && l2>0){
                ans=ans+ l1*l2;
                l1=l2;
                l2=0;
            }
           
            
        }
        return ans;
    }
}